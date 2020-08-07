package app;

import animals.Snake;
import background.Board;
import resources.Constants;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Controller implements Constants {
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Controller window = new Controller();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public Controller() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.pack();
        Insets insets = frame.getInsets();
        frame.setTitle(TITLE);
        frame.setSize(new Dimension(insets.left + insets.right + SCREEN_WIDTH,
                insets.top + insets.bottom + SCREEN_HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        String imgCrossFilename = "images/tail.png";
        ImageIcon iconCross = null;
        Image imgCross;
        URL imgURL = getClass().getClassLoader().getResource(imgCrossFilename);

        if (imgURL != null) {
            iconCross = new ImageIcon(imgURL);
        } else {
            System.out.println("Couldn't find file: " + imgCrossFilename);
        }

        assert iconCross != null;
        imgCross = iconCross.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        JLabel label = new JLabel();
        label.setBounds(60, 30, 30, 30);
        //label.setOpaque(true);
        label.setIcon(new ImageIcon(imgCross));

        frame.getContentPane().add(label);
        //new Snake(frame);
        new Board(frame);
    }
}

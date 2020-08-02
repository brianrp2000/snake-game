package app;

import animals.Snake;
import background.Board;
import resources.Constants;

import java.awt.*;
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

        new Snake(frame);
        new Board(frame);
    }
}

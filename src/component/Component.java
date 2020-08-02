package component;

import org.jetbrains.annotations.NotNull;
import resources.Constants;
import resources.Drawable;

import javax.swing.*;
import java.awt.*;

public class Component implements Drawable, Constants {
    private final JLabel label;
    private Color color;
    private Point point;
    private Dimension dimension;
    public int xSpeed = 10;
    public int ySpeed = 10;

     public Component(){
         label = new JLabel();
         point = new Point(0,0);
         dimension = new Dimension(100, 100);
         color = Color.green;
     }
     public Component(@NotNull Rectangle rectangle){
         label = new JLabel();
         point = rectangle.getLocation();
         dimension = rectangle.getSize();
     }

     public void setColor(Color color){
         this.color = color;
     }
     public void setPoint(Point point){
         this.point = point;
     }
     public void setDimension(Dimension dimension){
         this.dimension = dimension;
     }

     public Point getPoint(){return point;}
     public JLabel getLabel(){
         return label;
     }

     public void createLabel(){
         label.setBackground(color);
         label.setOpaque(true);
         label.setBounds(new Rectangle(point, dimension));
     }

    @Override
    public void draw(JFrame frame) {
        createLabel();
        frame.getContentPane().add(label);
        frame.revalidate();
        frame.repaint();
    }

    private boolean isMoving(Point point){
        if (point.x > SCREEN_WIDTH - CELL_SIDE || point.x < 0) {
            return false;
        }
        if (point.y > SCREEN_HEIGHT - CELL_SIDE || point.y < 0) {
            return false;
        }
        return true;
    }
}

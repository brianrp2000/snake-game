package component;

import org.jetbrains.annotations.NotNull;
import resources.Constants;
import resources.Drawable;

import javax.swing.*;
import java.awt.*;

public class Component implements Drawable, Constants {
    protected int level;
    protected JLabel label;
    protected Point point;
    protected Dimension dimension;

     public void setLevel(int level) {
        this.level = level;
    }
     public void setPoint(Point point){
         this.point = point;
     }
     public void setDimension(Dimension dimension){
         this.dimension = dimension;
     }

     public int getLevel() {
        return level;
    }
     public Point getPoint(){return point;}
     public JLabel getLabel(){
         return label;
     }

     public  void createLabel(){
         label = new JLabel();
         label.setOpaque(true);
         label.setBounds(new Rectangle(point, dimension));
     }

    @Override
    public void draw(JFrame frame) {
        createLabel();
        frame.getContentPane().add(label, level);
        frame.revalidate();
        frame.repaint();
    }

    private boolean isMoving(Point point){
        if (point.x > SCREEN_WIDTH - CELL_SIZE || point.x < 0) {
            return false;
        }
        if (point.y > SCREEN_HEIGHT - CELL_SIZE || point.y < 0) {
            return false;
        }
        return true;
    }
}

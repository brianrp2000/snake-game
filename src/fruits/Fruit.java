package fruits;

import component.Component;
import resources.Constants;
import resources.Drawable;
import resources.Spawnable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Fruit implements Spawnable, Drawable, Constants {
    private Point location;
    private Dimension dimension;
    private ArrayList<Component> components;

    public Fruit(){

    }

    public abstract void setComponents(JFrame frame);

    @Override
    public void spawn(JFrame frame) {
        location.setLocation(randomGenerate(SCREEN_WIDTH),
                randomGenerate(SCREEN_HEIGHT));
        setComponents(frame);
        for (Component aComponent : components) {

        }
        draw(frame);
    }

    @Override
    public void draw(JFrame frame) {
        Component aComponent = new Component();
        aComponent.setDimension(dimension);
        aComponent.setColor(Constants.RED);
        aComponent.draw(frame);
    }
}

package animals.parts;

import resources.*;
import component.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class BodyPart implements Constants{
    ArrayList<Component> components = new ArrayList<>();

    protected boolean isMoving;

    public abstract void setComponents(JFrame frame);

    public void buildComponent(int x, int y, int width, int height, Color color, JFrame frame){
        Component aComponent = new Component(new Rectangle(x, y, width, height));
        aComponent.setColor(color);
        aComponent.draw(frame);
        components.add(aComponent);
    }

    public boolean isMoving() {
        return isMoving;
    }
    public ArrayList<Component> getComponents(){
        return components;
    }
}


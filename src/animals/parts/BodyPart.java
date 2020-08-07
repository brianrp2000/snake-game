package animals.parts;

import component.ImageComponent;
import resources.*;
import component.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class BodyPart extends ImageComponent implements Constants{
    ArrayList<Component> components = new ArrayList<>();

    public abstract void setComponents(JFrame frame);

    public void buildComponent(int x, int y, int width, int height, Color color, JFrame frame){
        /*Component aComponent = new Component(new Rectangle(x, y, width, height));
        aComponent.setColor(color);
        aComponent.draw(frame);
        components.add(aComponent);*/
    }

    public ArrayList<Component> getComponents(){
        return components;
    }
}


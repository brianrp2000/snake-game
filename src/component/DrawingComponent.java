package component;

import resources.Constants;

import java.awt.*;

public class DrawingComponent extends Component implements Constants {
    private Color color;

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public void createLabel(){
        super.createLabel();
        label.setBackground(color);
    }
}

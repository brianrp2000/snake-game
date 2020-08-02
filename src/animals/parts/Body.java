package animals.parts;

import javax.swing.*;

public class Body extends BodyPart{

    @Override
    public void setComponents(JFrame frame) {
        //vertical rectangle
        buildComponent(2*CELL_SIDE + CELL_SIDE/3,
                CELL_SIDE + CELL_PADDING,
                CELL_SIDE / 3,
                CELL_SIDE - CELL_PADDING*2,
                LIME_GREEN,
                frame);

        //middle square
        buildComponent(2*CELL_SIDE + CELL_SIDE/6,
                CELL_SIDE + CELL_SIDE/6,
                CELL_SIDE - CELL_SIDE/3,
                CELL_SIDE - CELL_SIDE/3,
                LIME_GREEN,
                frame);

        //horizontal rectangle
        buildComponent(2*CELL_SIDE + CELL_PADDING,
                CELL_SIDE + CELL_SIDE / 3,
                CELL_SIDE - CELL_PADDING*2,
                CELL_SIDE / 3,
                LIME_GREEN,
                frame);
    }
}

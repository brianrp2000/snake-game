package animals.parts;

import javax.swing.*;

public class Head extends BodyPart {

    @Override
    public void setComponents(JFrame frame) {
        /*buildComponent(3*CELL_SIDE,
                CELL_SIDE,
                CELL_SIDE - CELL_SIDE/3,
                CELL_SIDE,
                LIME_GREEN,
                frame);*/
        //build overall shape of the head
        //just a square
        buildComponent(3*CELL_SIDE + CELL_PADDING,
                CELL_SIDE + CELL_PADDING,
                CELL_SIDE - CELL_PADDING*2,
                CELL_SIDE - CELL_PADDING*2,
                LIME_GREEN,
                frame);

        //Build upper eye
        buildComponent(3*CELL_SIDE + CELL_SIDE - CELL_SIDE/3-CELL_PADDING,
                CELL_SIDE + CELL_SIDE / 4,
                CELL_SIDE / 5,
                CELL_SIDE / 5,
                AZURE,
                frame);

        //Build lower eye
        buildComponent(3*CELL_SIDE + CELL_SIDE - CELL_SIDE/3 - CELL_PADDING,
                CELL_SIDE + CELL_SIDE / 2 + CELL_PADDING,
                CELL_SIDE / 5,
                CELL_SIDE / 5,
                AZURE,
                frame);
    }
}
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
        buildComponent(3* CELL_SIZE + CELL_PADDING,
                CELL_SIZE + CELL_PADDING,
                CELL_SIZE - CELL_PADDING*2,
                CELL_SIZE - CELL_PADDING*2,
                LIME_GREEN,
                frame);

        //Build upper eye
        buildComponent(3* CELL_SIZE + CELL_SIZE - CELL_SIZE /3-CELL_PADDING,
                CELL_SIZE + CELL_SIZE / 4,
                CELL_SIZE / 5,
                CELL_SIZE / 5,
                AZURE,
                frame);

        //Build lower eye
        buildComponent(3* CELL_SIZE + CELL_SIZE - CELL_SIZE /3 - CELL_PADDING,
                CELL_SIZE + CELL_SIZE / 2 + CELL_PADDING,
                CELL_SIZE / 5,
                CELL_SIZE / 5,
                AZURE,
                frame);
    }
}
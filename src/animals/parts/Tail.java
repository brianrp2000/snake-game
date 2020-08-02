package animals.parts;

import javax.swing.*;

public class Tail extends BodyPart{

    @Override
    public void setComponents(JFrame frame) {
        buildComponent(CELL_SIDE + (CELL_SIDE/2) - CELL_PADDING,
                CELL_SIDE + CELL_PADDING,
                CELL_SIDE/2,
                CELL_SIDE - 2*CELL_PADDING,
                LIME_GREEN,
                frame);

        buildComponent(CELL_SIDE + CELL_PADDING + CELL_SIDE/6,
                CELL_SIDE  + CELL_SIDE/6,
                CELL_SIDE - CELL_SIDE/3,
                CELL_SIDE - CELL_SIDE/3,
                LIME_GREEN,
                frame);

        buildComponent(CELL_SIDE + CELL_PADDING,
                CELL_SIDE + CELL_SIDE/3,
                CELL_SIDE/3,
                CELL_SIDE/3,
                LIME_GREEN,
                frame);
    }

}

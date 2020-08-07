package animals.parts;

import javax.swing.*;

public class Tail extends BodyPart{

    @Override
    public void setComponents(JFrame frame) {
        buildComponent(CELL_SIZE + (CELL_SIZE /2) - CELL_PADDING,
                CELL_SIZE + CELL_PADDING,
                CELL_SIZE /2,
                CELL_SIZE - 2*CELL_PADDING,
                LIME_GREEN,
                frame);

        buildComponent(CELL_SIZE + CELL_PADDING + CELL_SIZE /6,
                CELL_SIZE + CELL_SIZE /6,
                CELL_SIZE - CELL_SIZE /3,
                CELL_SIZE - CELL_SIZE /3,
                LIME_GREEN,
                frame);

        buildComponent(CELL_SIZE + CELL_PADDING,
                CELL_SIZE + CELL_SIZE /3,
                CELL_SIZE /3,
                CELL_SIZE /3,
                LIME_GREEN,
                frame);
    }

}

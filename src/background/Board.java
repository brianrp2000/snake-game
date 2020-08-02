package background;

import component.Component;
import resources.Constants;
import resources.Drawable;

import javax.swing.*;
import java.awt.*;


public class Board implements Constants, Drawable {

    public Board(JFrame frame){
        draw(frame);
    }

    @Override
    public void draw(JFrame frame) {
        int numCellsInColumn =  SCREEN_HEIGHT / CELL_SIDE;
        int numCellsInRow = SCREEN_WIDTH / CELL_SIDE;

        for (int i = 0; i < numCellsInRow; i++) {
            for (int j = 0; j < numCellsInColumn; j++) {
                Component aComponent = new Component();
                aComponent.setPoint(new Point(i*CELL_SIDE, j*CELL_SIDE));
                aComponent.setDimension(new Dimension(CELL_SIDE, CELL_SIDE));

                if((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)){
                    aComponent.setColor(MOCCASIN);
                    aComponent.draw(frame);
                }

                if((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)){
                    aComponent.setColor(BURLY_WOOD);
                    aComponent.draw(frame);
                }

                if(i == 0 || i == numCellsInRow-1 || j == 0 || j == numCellsInColumn-1) {
                    aComponent.setColor(SANDY_BROWN);
                    aComponent.draw(frame);
                }
            }
        }
    }
}

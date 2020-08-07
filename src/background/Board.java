package background;

import component.DrawingComponent;
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
        int numCellsInColumn =  SCREEN_HEIGHT / CELL_SIZE;
        int numCellsInRow = SCREEN_WIDTH / CELL_SIZE;

        for (int i = 0; i < numCellsInRow; i++) {
            for (int j = 0; j < numCellsInColumn; j++) {
                DrawingComponent aComponent = new DrawingComponent();
                aComponent.setPoint(new Point(i* CELL_SIZE, j* CELL_SIZE));
                aComponent.setDimension(new Dimension(CELL_SIZE, CELL_SIZE));

                if((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)){
                    aComponent.setColor(MOCCASIN);
                }

                if((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)){
                    aComponent.setColor(BURLY_WOOD);
                }

                if(i == 0 || i == numCellsInRow-1 || j == 0 || j == numCellsInColumn-1) {
                    aComponent.setColor(SANDY_BROWN);
                }

                aComponent.draw(frame);
            }
        }
    }
}

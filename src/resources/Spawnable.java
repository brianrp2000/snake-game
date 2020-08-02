package resources;

import javax.swing.*;
import java.util.Random;

import static resources.Constants.CELL_SIDE;

public interface Spawnable {
    /**
     * Randomly generate a number multiple of CELL_SIDE
     * @param limit
     * @return
     */
    default int randomGenerate(int limit){
        Random rnd = new Random();
        int num =  rnd.nextInt(CELL_SIDE) + limit - CELL_SIDE*2;
        int index = num / CELL_SIDE;
        return index * CELL_SIDE;
    }

    void spawn(JFrame frame);
}

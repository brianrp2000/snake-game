package resources;

import javax.swing.*;
import java.util.Random;

import static resources.Constants.CELL_SIZE;

public interface Spawnable {
    /**
     * Randomly generate a number multiple of CELL_SIDE
     * @param limit
     * @return
     */
    default int randomGenerate(int limit){
        Random rnd = new Random();
        int num =  rnd.nextInt(CELL_SIZE) + limit - CELL_SIZE *2;
        int index = num / CELL_SIZE;
        return index * CELL_SIZE;
    }

    void spawn(JFrame frame);
}

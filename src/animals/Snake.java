package animals;

import animals.parts.Body;
import animals.parts.BodyPart;
import animals.parts.Head;
import animals.parts.Tail;
import component.Component;
import resources.Movable;

import javax.swing.*;
import java.awt.event.*;

public class Snake implements Movable {
    int xSpeed = 15;
    int ySpeed = 10;

    public Snake(JFrame frame){
        draw(frame, new Head());

        draw(frame, new Body());

        draw(frame, new Tail());
    }

    private void draw(JFrame frame, BodyPart bodyPart){
        bodyPart.setComponents(frame);

        // Define an ActionListener to perform update at regular interval
        ActionListener updateTask = evt -> {
            for (Component aComponent : bodyPart.getComponents()){
                aComponent.getPoint().x += xSpeed;
                move(frame);
                aComponent.setLevel(1);
                aComponent.draw(frame);
            }
        };
        // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
        new Timer(UPDATE_INTERVAL, updateTask).start();
    }

    @Override
    public void move(JFrame frame) {
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                switch(evt.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        xSpeed = -Math.abs(xSpeed);
                        break;
                    case KeyEvent.VK_RIGHT:
                        xSpeed = Math.abs(xSpeed);
                        break;
                }
            }
        });
    }
}
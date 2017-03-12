package org.game.java;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by andrzejdubaj on 11.03.2017.
 */
public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getID() == ID.Player) {
                //key events for Player1
                if (key == KeyEvent.VK_W) tempObject.setVelY((-5));
                if (key == KeyEvent.VK_S) tempObject.setVelY((5));
                if (key == KeyEvent.VK_D) tempObject.setVelX((5));
                if (key == KeyEvent.VK_A) tempObject.setVelX((-5));
            }
                //key events for Player1
            if (tempObject.getID() == ID.Player2) {
                if (key == KeyEvent.VK_UP) tempObject.setVelY((-5));
                if (key == KeyEvent.VK_DOWN) tempObject.setVelY((5));
                if (key == KeyEvent.VK_RIGHT) tempObject.setVelX((5));
                if (key == KeyEvent.VK_LEFT) tempObject.setVelX((-5));
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getID() == ID.Player) {
                //key events for Player1
                if (key == KeyEvent.VK_W) tempObject.setVelY((0));
                if (key == KeyEvent.VK_S) tempObject.setVelY(0);
                if (key == KeyEvent.VK_D) tempObject.setVelX((0));
                if (key == KeyEvent.VK_A) tempObject.setVelX((0));
            }
            //key events for Player2
            if (tempObject.getID() == ID.Player2) {
                if (key == KeyEvent.VK_UP) tempObject.setVelY((0));
                if (key == KeyEvent.VK_DOWN) tempObject.setVelY((0));
                if (key == KeyEvent.VK_RIGHT) tempObject.setVelX((0));
                if (key == KeyEvent.VK_LEFT) tempObject.setVelX((0));
            }
        }
    }

}

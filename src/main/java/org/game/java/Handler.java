package org.game.java;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by andrzejdubaj on 07.03.2017.
 */
public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick() {
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    public void addObject(GameObject object) {
        this.object.add(object);
    }

    public void removeObject(GameObject object) {
        this.object.remove(object);
    }
}

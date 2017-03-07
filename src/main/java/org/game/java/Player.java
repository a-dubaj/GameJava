package org.game.java;

import java.awt.*;
import java.util.Random;

/**
 * Created by andrzejdubaj on 07.03.2017.
 */
public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);
        velY = r.nextInt(5) + 1;
        velX = r.nextInt(5);
    }

    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32,32);
    }

}

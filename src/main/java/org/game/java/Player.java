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

    }

    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 32, 32);
    }

}

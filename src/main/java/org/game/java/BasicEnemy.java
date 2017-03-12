package org.game.java;

import java.awt.*;

/**
 * Created by andrzejdubaj on 12.03.2017.
 */
public class BasicEnemy extends GameObject {
    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);
    }

    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 16, 16);

    }
}

package org.game.java;

import java.awt.*;

/**
 * Created by andrzejdubaj on 12.03.2017.
 */
public class HUD {

    public static int HEALTH = 100;

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(15, 15, 200, 32);
    }

}

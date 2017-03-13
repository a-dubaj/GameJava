package org.game.java;

import java.awt.*;

/**
 * Created by andrzejdubaj on 12.03.2017.
 */
public class HUD {

    public static int HEALTH = 100;

    private int greenVariable = 255;

    public void tick() {
        HEALTH = Game.clamp(HEALTH, 0, 100);
        greenVariable = Game.clamp(greenVariable, 0, 255);
        greenVariable = HEALTH *2;
    }

    public void render(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(15, 15, 200, 32);
        g.setColor(new Color(75, greenVariable, 0));
        g.fillRect(15, 15, HEALTH * 2, 32);
        g.setColor(Color.WHITE);
        g.drawRect(15, 15, 200, 32);
    }
}

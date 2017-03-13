package org.game.java;
import java.awt.*;

/**
 * Created by andrzejdubaj on 12.03.2017.
 */
public class BasicEnemy extends GameObject {

    private Handler handler;


    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 5;
        velY = 5;

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;

        if (y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if (x <= 0 || x >= Game.WIDTH - 15) velX *= -1;
        handler.addObject(new Trail(x,y, ID.Trail, Color.RED, 16, 16, 0.08f, handler));
        //handler.addObject(new Trail(x, y, ID.Trail, Color.RED, 16, 16, 0.01f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 16, 16);

    }
}

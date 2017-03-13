package org.game.java;

import java.awt.*;

/**
 * Created by andrzejdubaj on 07.03.2017.
 */
public abstract class GameObject {

    protected float x, y;
    protected ID id;
    protected float velX, velY;


    public GameObject(float x, float y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract Rectangle getBounds();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public ID getID() {
        return id;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public float getVelX() {
        return velX;
    }

    public float getVelY() {
        return velY;
    }


}
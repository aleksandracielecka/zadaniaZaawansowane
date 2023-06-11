package org.example;

public class Point2DEx5 {
    protected float x;
    protected float y;

    public Point2DEx5(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};

    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }



    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}

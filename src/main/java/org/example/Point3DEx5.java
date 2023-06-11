package org.example;

public class Point3DEx5 extends Point2DEx5 {
    private float z;

    public Point3DEx5(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.z = z;

    }

    public String toString2() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
}

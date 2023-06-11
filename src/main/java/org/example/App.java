package org.example;


public class App {
    public static void main(String[] args) {
        Point2DEx5 pointA = new Point2DEx5(6, 3);
        pointA.getXY();
        pointA.setXY(5, 4);
        System.out.println(pointA);
        Point3DEx5 pointB = new Point3DEx5(7, 8, 9);

        pointB.setXYZ(1, 2, 3);
        System.out.println(pointB);
    }
}
package org.example;


public class App {
    public static void main(String[] args) {
        Point2D pointA = new Point2D(6, 3);
        pointA.getXY();
        pointA.setXY(5, 4);
        System.out.println(pointA);
        Point3D pointB = new Point3D(7, 8, 9);

        pointB.setXYZ(1, 2, 3);
        System.out.println(pointB);
    }
}
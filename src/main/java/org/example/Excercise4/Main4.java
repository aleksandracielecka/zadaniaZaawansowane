package org.example.Excercise4;

public class Main4 {
    public static void main(String[] args) {
        ShapeExcercise4[] shapes = {
                new CircleExcercise4("orange", true, 10),
                new RectangleExcercise4("purple", true, 20, 30),
                new SquareExcercise4("green", false, 5)
        };


        for (ShapeExcercise4 shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }

}


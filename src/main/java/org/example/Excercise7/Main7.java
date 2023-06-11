package org.example.Excercise7;

public class Main7 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Resizable resizable = new ResizableCircle(50);
        resizable.resize(20);
        System.out.println(resizable);


    }
}

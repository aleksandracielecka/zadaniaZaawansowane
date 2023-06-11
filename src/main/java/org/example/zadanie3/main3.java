package org.example.zadanie3;

public class main3 {
    public static void main(String[] args) {


        Shape shape = new Shape("Brown", true);
        System.out.println(shape);
        Circle circle = new Circle("Red", false, 10);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("Black",true,9,10);
        System.out.println(rectangle);
        Square square = new Square("Violet", true, 10);
        System.out.println(square);
    }
}

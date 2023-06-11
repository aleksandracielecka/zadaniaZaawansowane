package org.example.zadanie3;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String colour, boolean isFilled, double radius) {
        super(colour, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }
    public double getPerimeter(){
        return (Math.PI*2*radius);
    }
    @Override
    public String toString(){
        return String.format("Circle with radius= %f which is a subclass off %s",radius,super.toString());
    }

}

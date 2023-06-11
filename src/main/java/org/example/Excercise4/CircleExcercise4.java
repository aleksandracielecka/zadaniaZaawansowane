package org.example.Excercise4;

public class CircleExcercise4 extends ShapeExcercise4{
    private double radius;



    public CircleExcercise4(String color, boolean isFilled, double radius) {
        super(color, isFilled);
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

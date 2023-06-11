package org.example.Excercise4;



public class RectangleExcercise4 extends ShapeExcercise4 {
    protected double width;
    protected double length;

//    public RectangleExcercise4() {
//        super();
//        this.width = 1;
//        this.length = 1;
//    }

    public RectangleExcercise4(String colour, boolean isFilled, double width, double length) {
        super(colour, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width= %f and length= %f which is a subclass off %s", width, length, super.toString());

    }
}

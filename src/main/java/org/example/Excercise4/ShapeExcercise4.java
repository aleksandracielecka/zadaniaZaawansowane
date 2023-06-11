package org.example.Excercise4;

abstract class ShapeExcercise4 {
    protected String color;
    protected boolean isFilled;

    public ShapeExcercise4() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public ShapeExcercise4(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public String toString(){
        return String.format("Shape with color of %s and %s", color,isFilled? "filed":"NotFilled");

    }

   public abstract double getArea();
    public abstract double getPerimeter();

    }


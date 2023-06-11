package org.example.zadanie3;

public class Shape {
    protected String colour;
    protected boolean isFilled;

    public Shape() {
        this.colour = "unknown";
        this.isFilled = false;
    }

    public Shape(String colour, boolean isFilled) {
        this.colour = colour;
        this.isFilled = isFilled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public String toString(){
        return String.format("Shape with color of %s and %s",colour,isFilled? "filed":"NotFilled");

    }
}

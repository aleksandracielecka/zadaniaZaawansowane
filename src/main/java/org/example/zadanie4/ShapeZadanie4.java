package org.example.zadanie4;

public class ShapeZadanie4 {
    protected String colour;
    protected boolean isFilled;

    public ShapeZadanie4() {
        this.colour = "unknown";
        this.isFilled = false;
    }

    public ShapeZadanie4(String colour, boolean isFilled) {
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

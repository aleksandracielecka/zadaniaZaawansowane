package org.example.Excercise4;

import org.example.Excercise3.Rectangle;

public class SquareExcercise4 extends RectangleExcercise4 {



    public SquareExcercise4(String colour, boolean isFilled, double size) {
        super(colour, isFilled, size, size);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length){
        super.setWidth(length);
        super.setLength(length);
    }
@Override
    public String toString(){
        return String.format("Square with witdh =%f and length = %f which is subclass off %s",width,length,super.toString());
}
}

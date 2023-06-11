package org.example.Excercise3;

public class Square extends Rectangle{



    public Square(String colour, boolean isFilled, double size) {
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

package org.example.Excercise6;

public class Main6 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(3, 4, 6, 7);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println(movablePoint);

        Movable movableCircle = new MovableCircle(10, 1, 1, 3, 3);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);

    }
}

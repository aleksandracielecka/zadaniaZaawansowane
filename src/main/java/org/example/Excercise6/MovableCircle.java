package org.example.Excercise6;

public class MovableCircle implements Movable {
    private MovablePoint movablePoint;
    private double radius;

    public MovableCircle(double radius, int x, int y, int xSpeed, int ySpeed) {

        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }
    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}

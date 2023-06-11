package org.example.Excercise5;



 class Line {
    private Point2DEx5 pA;
    private Point2DEx5 pB;


    public Line(Point2DEx5 pA, Point2DEx5 pB) {
        this.pA = pA;
        this.pB = pB;
    }

    public Line(float xa, float ya, float xb, float yb) {
        this.pA = new Point2DEx5(xa, ya);
        this.pB = new Point2DEx5(xb, yb);
    }


    public Point2DEx5 getpA() {
        return pA;
    }

    public void setpA(Point2DEx5 pA) {
        this.pA = pA;
    }

    public Point2DEx5 getpB() {
        return pB;
    }

    public void setpB(Point2DEx5 pB) {
        this.pB = pB;
    }

    public double getLineLength() {
        return Math.sqrt(Math.pow((pB.x - pA.x),2) + Math.pow((pB.y - pA.y),2));
    }

    public Point2DEx5 getMiddleofLine(){
        float xMiddle=(pA.x+pB.x/2);
        float yMiddle=(pA.y+pB.y)/2;
      return new Point2DEx5(xMiddle,yMiddle);

    }

}


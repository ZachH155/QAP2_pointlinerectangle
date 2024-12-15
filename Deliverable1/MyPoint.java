package Deliverable1;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    //constructors
    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x,int y) {
        this.x = x;
        this.y = y;
    }

    //getters and setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //distance methods
    public double distance(int x, int y) {
        //to tell the difference between MyPoint's x and y, and the given x and y
        int x1 = getX();
        int x2 = x;
        int y1 = getY();
        int y2 = y;

        //gets distance between points
        int xsum = (x2 - x1)^2;
        int ysum = (y2 - y1)^2;
        double sum = Math.sqrt(xsum + ysum);

        return sum;
    }

    public double distance(MyPoint MyPoint) {
        //to tell the difference between this MyPoint's x and y, and the given MyPoint's x and y
        int x1 = getX();
        int x2 = MyPoint.getX();
        int y1 = getY();
        int y2 = MyPoint.getY();

        //gets distance between points
        int xsum = (x2 - x1)^2;
        int ysum = (y2 - y1)^2;
        double sum = Math.sqrt(xsum + ysum);

        return sum;
    }

    public double distance() {
        int x = getX();
        int y = getY();

        //gets distance between points
        int xsum = x^2;
        int ysum = y^2;
        double sum = Math.sqrt(xsum + ysum);

        return sum;
    }


    //toString
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}

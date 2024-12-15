package Deliverable2;
import Deliverable1.MyPoint;

public class MyRectangle {
    MyPoint topLeft = new MyPoint(0, 0);
    MyPoint bottomRight = new MyPoint(0, 0);

    //constructors
    public MyRectangle(int topLX, int topLY, int bottomRX, int bottomRY) {
        this.topLeft.setXY(topLX, topLY);
        this.bottomRight.setXY(bottomRX, bottomRY);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft.setXY(topLeft.getX(), topLeft.getY());
        this.bottomRight.setXY(bottomRight.getX(), bottomRight.getY());
    }

    //getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    public void setTopLeft(int topLX, int topLY) {
        this.topLeft.setXY(topLX, topLY);
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    public void setBottomRight(int bottomRX, int bottomRY) {
        this.bottomRight.setXY(bottomRX, bottomRY);
    }
    


    //toString
    public String toString() {
        return "Top left point: " + topLeft.toString() + ", Bottom right point: " + bottomRight.toString();
    }

}

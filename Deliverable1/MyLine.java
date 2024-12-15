package Deliverable1;

public class MyLine {
    MyPoint begin = new MyPoint();
    MyPoint end = new MyPoint();

    //constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }

    public MyLine(MyPoint MyPoint1, MyPoint MyPoint2) {
        begin = MyPoint1;
        end = MyPoint2;
    }

    //getters and setters
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(MyPoint begin) {
        this.begin.setX(begin.getX());
    }

    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(MyPoint begin) {
        this.begin.setY(begin.getY());
    }

    public int getEndX() {
        return end.getX();
    }
    public void setEndX(MyPoint end) {
        this.end.setX(end.getX());
    }

    public int getEndY() {
        return end.getY();
    }
    public void setEndY(MyPoint end) {
        this.end.setY(end.getY());
    }

    public int getBeginXY() {
        return begin.getX() + begin.getY();
    }
    public void setBeginXY(MyPoint begin) {
        this.begin.setXY(begin.getX(), begin.getY());
    }

    public int getEndXY() {
        return end.getX() + end.getY();
    }
    public void setEndXY(MyPoint end) {
        this.end.setXY(end.getX(), end.getY());
    }


    //length
    public double getLength() {
        return begin.distance(end);
    }

    //gradient
    public double getGradient() {

        //gets distance between points
        int xdiff = (begin.getX() - end.getX());
        int ydiff = (begin.getY() - end.getY());

        double sum = Math.atan2(ydiff, xdiff);

        return sum;
    }

    //toString
    public String toString() {
        return "MyLine[begin=" + begin + "," + "end=" + end + "]";
    }
}

package Deliverable2;

import Deliverable1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        
        MyPoint point1 = new MyPoint(5, 10);
        MyPoint point2 = new MyPoint(0, 0);
        MyRectangle rectangle = new MyRectangle(point1, point2);

        System.out.println("-------------------------------");
        System.out.println(rectangle);
        System.out.println("-------------------------------");
        point2.setXY(-5, -10);
        rectangle.setBottomRight(point2);
        System.out.println(rectangle);
    }
}

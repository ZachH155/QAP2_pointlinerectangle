package Deliverable1;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(15,10);
        MyPoint point2 = new MyPoint(20,15);
        MyPoint point3 = new MyPoint();


        System.out.println("-------------------------------");
        System.out.println(point.distance(20, 15));
        System.out.println(point.distance(point2));
        System.out.println(point.distance());
        System.out.println("-------------------------------");
        System.out.println(point3.distance(20, 15));
        System.out.println(point3.distance(point2));
        System.out.println(point3.distance());

    }
}

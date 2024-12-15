package Deliverable1;

public class TestMyLine {
    public static void main(String[] args) {
        //points for line1
        MyPoint point1 = new MyPoint(12, 5);
        MyPoint point2 = new MyPoint(15, 8);

        //lines
        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(12, 5, 15, 8);

        System.out.println("-------------------------------");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("-------------------------------");
        System.out.println(line1.getLength());
        System.out.println(line2.getLength());
        System.out.println("-------------------------------");
        System.out.println(line1.getGradient());
        System.out.println(line2.getGradient());




    }
}

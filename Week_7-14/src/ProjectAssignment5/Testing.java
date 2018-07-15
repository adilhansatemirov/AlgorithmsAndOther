package ProjectAssignment5;

public class Testing {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2,3);
        MyPoint point2 = new MyPoint(3,1);
        MyPoint point3 = new MyPoint(1,2);
        MyTriangle triangle =new MyTriangle(point1,point2,point3);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}

package ProjectAssignment5;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        myPointDemo();
        myEllipseDemo();
        myCircleDemo();
        myRectangleDemo();
        mySquareDemo();
        myTriangleDemo();
        plotterDemo();          //♡
    }
    public static void myPointDemo() {
        System.out.println("MyPoint Demonstration: ");
        // default constructor creates a point at (0, 0)
        MyPoint origin = new MyPoint();
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint();
        // toString()
        System.out.println("1. origin: " + origin);
        System.out.println("2. point1: " + point1);
        // getX(), getY()
        System.out.println("3. x coordinate of point1: " + point1.getX());
        System.out.println("4. y coordinate of point1: " + point1.getY());
        // setX(), setY()
        point1.setX(4);
        point1.setY(3);
        System.out.println("5. Changed x and y coordinates of point1: " + point1);
        // getXY(), setXY()
        System.out.printf("6. x and y coordinates of origin: %d, %d %n",
                origin.getXY()[0], origin.getXY()[1]);
        point2.setXY(3, 4);
        System.out.println("7. point2: " + point2);
        // different versions of distance()
        System.out.println("8. Distance from point1 to point2: " + point1.distance(point2));
        System.out.println("9. Distance from point2 to point1: " + point2.distance(point1));
        System.out.println("10. Distance from point1 to (5, 5): " + point1.distance(5, 5));
        System.out.println("11. Distance from point1 to origin: " + point1.distance());
        System.out.println("End of MyPoint Demonstration\n");
    }
    public static void myEllipseDemo() {
        System.out.println("MyEllipse Demonstration: ");
        // default constructor creates an ellipse at (0, 0) with
        // radiusA=1 and radiusB=2
        MyEllipse ellipse1 = new MyEllipse();
        MyEllipse ellipse2 = new MyEllipse(4, 4, 4, 5);
        // MyEllipse using a MyPoint as a center
        MyPoint point1 = new MyPoint(4, -4);
        MyEllipse ellipse3 = new MyEllipse(point1, 5, 2);
        // toString()
        System.out.println("1. ellipse1: " + ellipse1);
        System.out.println("2. ellipse2: " + ellipse2);
        System.out.println("3. ellipse3: " + ellipse3);
        // getRadiusA(), getRadiusB(), setRadiusB(), setRadiusB()
        System.out.printf("4. Radii of ellipse1: radiusA = %d, radiusB = %d %n",
                ellipse1.getRadiusA(), ellipse1.getRadiusB());
        ellipse1.setRadiusA(3);
        ellipse1.setRadiusB(6);
        System.out.printf("5. Changed radii of ellipse1: radiusA = %d, radiusB = %d %n",
                ellipse1.getRadiusA(), ellipse1.getRadiusB());
        // getCenterX(), getCenterY(), setCenter(), getCenterXY()
        System.out.printf("6. Center of ellipse2: (%d, %d) %n",
                ellipse2.getCenterX(), ellipse2.getCenterY());
        ellipse2.setCenter(new MyPoint(10, 5));
        System.out.printf("7. Changed center of ellipse2: (%d, %d) %n",
                ellipse2.getCenterXY()[0], ellipse2.getCenterXY()[1]);
        // setCenterX(), setCenterY(), getCenter(), setCenterXY()
        System.out.printf("8. Center of ellipse3: %s %n", ellipse3.getCenter());
        ellipse3.setCenterX(-5);
        ellipse3.setCenterY(-5);
        System.out.printf("9. Changed center of ellipse3: %s %n", ellipse3.getCenter());
        ellipse3.setCenterXY(0, 100);
        System.out.printf("10. Changed center of ellipse3: %s %n", ellipse3.getCenter());
        // getArea()
        System.out.println("11. Area of ellipse1: " + ellipse1.getArea());
        System.out.println("12. Area of ellipse2: " + ellipse2.getArea());
        System.out.println("13. Area of ellipse3: " + ellipse3.getArea());
        // distance()
        System.out.println("14. Distance from ellipse1 to ellipse3: " +
                ellipse1.distance(ellipse3));
        System.out.println("End of MyEllipse Demonstration\n");
    }
    public static void myCircleDemo() {
        System.out.println("MyCircle Demonstration: ");
        // default constructor creates a circle at (0, 0) with
        // radius=1
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(4, 4, 4);
        // MyEllipse using a MyPoint as a center
        MyPoint point1 = new MyPoint(4, -4);
        MyCircle circle3 = new MyCircle(point1, 5);
        // toString()
        // overridden to print circles differently
        System.out.println("1. circle1: " + circle1);
        System.out.println("2. circle2: " + circle2);
        System.out.println("3. circle3: " + circle3);
        // getRadiusA(), getRadiusB(), setRadiusB(), setRadiusB()
        // inherited from MyEllipse
        System.out.printf("4. Radii of circle1: radiusA = %d, radiusB = %d %n",
                circle1.getRadiusA(), circle1.getRadiusB());
        circle1.setRadiusA(3);
        System.out.printf("5. Changed radiusA of circle1: radiusA = %d, radiusB = %d %n",
                circle1.getRadiusA(), circle1.getRadiusB());
        circle1.setRadiusB(6);
        System.out.printf("6. Changed radiusB of circle1: radiusA = %d, radiusB = %d %n",
                circle1.getRadiusA(), circle1.getRadiusB());
        // getRadius(), setRadius()
        System.out.println("7. Radius of circle2: " + circle2.getRadius());
        circle2.setRadius(9);
        System.out.println("8. Changed radius of circle2: " + circle2.getRadius());
        // getCenterX(), getCenterY(), setCenter(), getCenterXY()
        // inherited from MyEllipse
        System.out.printf("9. Center of circle2: (%d, %d) %n",
                circle2.getCenterX(), circle2.getCenterY());
        circle2.setCenter(new MyPoint(10, 10));
        System.out.printf("10. Changed center of circle2: (%d, %d) %n",
                circle2.getCenterXY()[0], circle2.getCenterXY()[1]);
        // setCenterX(), setCenterY(), getCenter(), setCenterXY()
        // inherited from MyEllipse
        System.out.printf("11. Center of circle3: %s %n", circle3.getCenter());
        circle3.setCenterX(-5);
        circle3.setCenterY(-4);
        System.out.printf("12. Changed center of circle3: %s %n", circle3.getCenter());
        circle3.setCenterXY(0, 100);
        System.out.printf("13. Changed center of circle3: %s %n", circle3.getCenter());
        // getArea()
        // inherited from MyEllipse
        System.out.println("14. Area of circle1: " + circle1.getArea());
        System.out.println("15. Area of circle2: " + circle2.getArea());
        System.out.println("16. Area of circle3: " + circle3.getArea());
        // getCircumference()
        System.out.println("17. Circumference of circle1: " + circle1.getCircumference());
        System.out.println("18. Circumference of circle2: " + circle2.getCircumference());
        System.out.println("19. Circumference of circle3: " + circle3.getCircumference());
        // distance()
        // inherited from MyEllipse
        System.out.println("20. Distance from circle1 to circle3: " +
                circle1.distance(circle3));
        System.out.println("End of MyCircle Demonstration\n");
    }
    public static void myRectangleDemo() {
        System.out.println("MyRectangle Demonstration: ");
        // three different constructors
        MyRectangle rectangle1 = new MyRectangle(1, 5, 6, 4);
        MyPoint topLeft = new MyPoint(2, 4);
        MyRectangle rectangle2 = new MyRectangle(topLeft, 4, 2);
        MyRectangle rectangle2Copy = new MyRectangle(rectangle2);
        // toString()
        System.out.println("1. rectangle1: " + rectangle1);
        System.out.println("2. rectangle2: " + rectangle2);
        System.out.println("3. rectangle2Copy: " + rectangle2Copy);
        // getTopLeft(), setTopLeft()
        System.out.println("4. Top left corner of rectangle1: " +
                rectangle1.getTopLeft());
        rectangle1.setTopLeft(new MyPoint(0, 6));
        System.out.println("5. Changed top left corner of rectangle1: " +
                rectangle1.getTopLeft());
        // getWidth(), getHeight()
        System.out.printf("6. Width and height of rectangle2: w=%d, h=%d %n",
                rectangle2.getWidth(), rectangle2.getHeight());
        // setWidth(), setHeight()
        rectangle2.setWidth(5);
        rectangle2.setHeight(3);
        System.out.printf("7. Changed width and height of rectangle2: w=%d, h=%d %n",
                rectangle2.getWidth(), rectangle2.getHeight());
        // getPerimeter(), getArea()
        System.out.println("8. Perimeter of rectangle2Copy: " + rectangle2Copy.getPerimeter());
        System.out.println("9. Area of rectangle2Copy: " + rectangle2Copy.getArea());
        System.out.println("End of MyRectangle Demonstration\n");
    }
    public static void mySquareDemo() {
        System.out.println("MySquare Demonstration: ");
        // three different constructors
        MySquare square1 = new MySquare(1, 5, 4);
        MyPoint topLeft = new MyPoint(2, 4);
        MySquare square2 = new MySquare(topLeft, 6);
        MySquare square2Copy = new MySquare(square2);
        // toString()
        // overridden to print squares differently
        System.out.println("1. square1: " + square1);
        System.out.println("2. square2: " + square2);
        System.out.println("3. square2Copy: " + square2Copy);
        // getTopLeft(), setTopLeft()
        // inherited from MyRectangle
        System.out.println("4. Top left corner of square1: " +
                square1.getTopLeft());
        square1.setTopLeft(new MyPoint(0, 6));
        System.out.println("5. Changed top left corner of square1: " +
                square1.getTopLeft());
        // getWidth(), getHeight()
        // inherited from MyRectangle
        System.out.printf("6. Width and height of square2: w=%d, h=%d %n",
                square2.getWidth(), square2.getHeight());
        // setWidth(), setHeight()
        // overridden to avoid a square with different sides
        square2.setWidth(5);
        System.out.printf("7. Changed width of square2: w=%d, h=%d %n",
                square2.getWidth(), square2.getHeight());
        square2.setHeight(3);
        System.out.printf("8. Changed height of square2: w=%d, h=%d %n",
                square2.getWidth(), square2.getHeight());
        // getSide(), setSide()
        System.out.println("9. Side of square2Copy: " + square2Copy.getSide());
        square2Copy.setSide(10);
        System.out.println("10. Changed side of square2Copy: " + square2Copy.getSide());
        // getPerimeter(), getArea()
        // inherited from MyRectangle
        System.out.println("11. Perimeter of square2Copy: " + square2Copy.getPerimeter());
        System.out.println("12. Area of square2Copy: " + square2Copy.getArea());
        System.out.println("End of MySquare Demonstration\n");
    }
    public static void myTriangleDemo() {
        System.out.println("MyTriangle Demonstration: ");
        // constructors
        MyTriangle triangle1 = new MyTriangle(0, 12, 5, 0, 0, 0);
        MyPoint point1 = new MyPoint(0, 1);
        MyPoint point2 = new MyPoint(1, 0);
        MyPoint point3 = new MyPoint(0, 0);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);
        // toString()
        System.out.println("1. triangle1: " + triangle1);
        System.out.println("2. triangle2: " + triangle2);
        // getPerimeter()
        System.out.println("3. Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("4. Perimeter of triangle2: " + triangle2.getPerimeter());
        // getArea()
        System.out.println("5. Area of triangle1: " + triangle1.getArea());
        System.out.println("6. Area of triangle2: " + triangle2.getArea());
        // getType()
        System.out.println("7. Type of triangle1: " + triangle1.getType());
        System.out.println("8. Type of triangle2: " + triangle2.getType());
        System.out.println("End of MyTriangle Demonstration\n");
    }
    public static void plotterDemo() {
        System.out.println("Plotter Demonstration:");
        Plotter plotter = new Plotter();
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5, 4);
        MyPoint p3 = new MyPoint(-11, -11);
        MyPoint p4 = new MyPoint(11, 11);
        MyPoint p5 = new MyPoint(100, 100);
        plotter.addPoint(p1);
        plotter.addPoint(p2);
        plotter.addPoint(p3);
        plotter.addPoint(p4);
        plotter.addPoint(p5);
        MyRectangle r1 = new MyRectangle(-11, 11, 7, 7);
        MyRectangle r2 = new MyRectangle(new MyPoint(-8, 8), 17, 10);
        MySquare s1 = new MySquare(-3, 2, 8);
        MySquare s2 = new MySquare(new MyPoint(6, -5), 6);
        plotter.addRectangle(r1);
        plotter.addRectangle(r2);
        plotter.addRectangle(s1);
        plotter.addRectangle(s2);
        System.out.println("Points:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println("Rectangles:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s1);
        System.out.println(s2);
        plotter.drawPlane();
    }
}

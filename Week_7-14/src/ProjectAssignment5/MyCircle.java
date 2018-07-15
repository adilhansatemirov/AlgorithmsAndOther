package ProjectAssignment5;

public class MyCircle extends MyEllipse {

    public MyCircle(){
        super(0,0,1,1);
    }
    public MyCircle(int x, int y, int radius){
        super(x,y,radius,radius);
    }
    public MyCircle(MyPoint center, int radius){
        super(center,radius,radius);
    }
    public int getRadius(){
        return radiusA;
    }

    public void setRadius(int radius){
        this.radiusA = radius;
        this.radiusB = radius;
    }

    public void setRadiusA(int radiusA){
        this.radiusA = radiusA;
        this.radiusB = radiusA;
    }

    public void setRadiusB(int radiusB){
        this.radiusA = radiusB;
        this.radiusB = radiusB;
    }

    public double getCircumference(){
        return 2*this.radiusA*Math.PI;
    }

    public String toString(){
        return "MyCircle[radius = "+this.radiusA+", center = ("+this.center.getX()+", "+this.center.getY()+")]";
    }
}

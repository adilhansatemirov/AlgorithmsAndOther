package ProjectAssignment5;

public class MyEllipse {
    protected MyPoint center;
    protected int radiusA;
    protected int radiusB;

    public MyEllipse(){
        this.center = new MyPoint();                            //default origin (0,0)
        radiusA = 1;                                            //default radius 1 and 2
        radiusB = 2;
    }
    public MyEllipse(int x, int y, int radiusA, int radiusB){
        this.center = new MyPoint(x, y);                        //creates a new point with coordinates(x,y)
        this.radiusA = radiusA;                                 //and sets it to center
        this.radiusB = radiusB;
    }
    public MyEllipse(MyPoint center, int radiusA, int radiusB){
        this.center = new MyPoint(center.getX(),center.getY());
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }
    public void setRadiusA(int radiusA){
        this.radiusA = radiusA;
    }

    public void setRadiusB(int radiusB){
        this.radiusB = radiusB;
    }

    public int getRadiusA(){
        return this.radiusA;
    }

    public int getRadiusB(){
        return this.radiusB;
    }

    public void setCenter(MyPoint center){
        this.center = new MyPoint(center.getX(),center.getY());
    }

    public MyPoint getCenter(){
    return new MyPoint(center.getX(),center.getY());
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        return new int[]{this.center.getX(),this.center.getY()};
    }

    public double getArea(){
        return this.radiusA*this.radiusB*Math.PI;
    }

    public double distance(MyEllipse another){
        return this.center.distance(another.center);
    }

    public String toString(){
        return "My Ellipse[radiusA = "+this.radiusA+", radiusB = "+this.radiusB+", center = " +
                "("+this.center.getX()+", "+this.center.getY()+")]";
    }
}

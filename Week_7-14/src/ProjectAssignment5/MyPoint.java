package ProjectAssignment5;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {                          //creates a point with origin (0,0)
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){               //uses user's input to assign the origin
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }                       //encapsulation goes

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{this.x,this.y};
    }     //till here

    public String toString(){
        return "("+x+", "+y+")";
    }         //any point we refer to will look in this way

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double distance(MyPoint otherOne){
        return Math.hypot(this.getX()-otherOne.getX(),this.getY()-otherOne.getY());
    }
}

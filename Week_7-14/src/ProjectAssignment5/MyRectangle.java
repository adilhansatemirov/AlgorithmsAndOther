package ProjectAssignment5;

public class MyRectangle {
    protected MyPoint topLeft;
    protected int width;
    protected int height;

    public MyRectangle(int x, int y, int width, int height){
        this.topLeft = new MyPoint(x,y);
        this.width = width;
        this.height = height;
    }
    public MyRectangle(MyPoint topLeft, int width, int height){
        this.topLeft = new MyPoint(topLeft.getX(),topLeft.getY());
        this.width = width;
        this.height = height;
    }
    public MyRectangle(MyRectangle rectangle){
        MyPoint topLeft = rectangle.getTopLeft();
        this.topLeft = new MyPoint(topLeft.getX(), topLeft.getY());
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }
    public MyPoint getTopLeft(){
        return this.topLeft;
    }
    public void setTopLeft(MyPoint topLeft){
        this.topLeft = new MyPoint(topLeft.getX(),topLeft.getY());
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getArea(){
        return width*height;
    }
    public String toString(){
        return "MyRectangle[v1="+topLeft+", v2=("+(topLeft.getX()+width)+", "+topLeft.getY()+"), " +
                "v3=("+(topLeft.getX()+width)+", "+(+topLeft.getY()-height)+"), " +
                "v4=("+topLeft.getX()+", "+(topLeft.getY()-height)+")]";
    }
}

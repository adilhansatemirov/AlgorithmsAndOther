package ProjectAssignment5;

public class MySquare extends MyRectangle{
    public MySquare(int x, int y, int side){
        super(x,y,side,side);
    }
    public MySquare(MyPoint topLeft, int side){
        super(topLeft,side,side);
    }
    public MySquare(MySquare square){
        super(square);
    }
    public void setWidth(int side){
        this.width = side;
        this.height = side;
    }
    public void setHeight(int side){
        this.width = side;
        this.height = side;
    }
    public void setSide(int side){
        this.width = side;
        this.height = side;
    }
    public int getSide(){
       return this.width;
    }
    public String toString(){
        return "MySquare[v1=("+topLeft.getX()+", "+topLeft.getY()+"), v2=("+(topLeft.getX()+getSide())+", "+topLeft.getY()+"),"+
                " v3=("+(topLeft.getX()+getSide())+", "+(topLeft.getY()-getSide())+"), v4=("+topLeft.getX()+", "+(topLeft.getY()-getSide()+")]");
    }
}

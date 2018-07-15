package ProjectAssignment5;


public class Plotter {
    private final int plotterSize = 25;
    private String[][]array2d = new String[plotterSize][plotterSize];       //create an 2D array  of Strings (25 x 25)
    private int zeroPoint = array2d.length/2;                               //12 in array, 0 in coordinate plane

    Plotter() {                                                             //constructs coordinate plane
        for (int row = 0; row < plotterSize; row++) {
            for (int column = 0; column < plotterSize; column++) {          //firstly we fill every
                array2d[row][column] = ". ";                                //element of array with dots
            }
        }//ends for
        for (int vertical = 0; vertical < plotterSize; vertical++) {        //then every central column
            array2d[vertical][array2d.length / 2] = "| ";                   //with "| "
        }//ends for
        for (int horizontal = 0; horizontal < plotterSize; horizontal++) {  //then every central row with "- "
            array2d[array2d.length / 2][horizontal] = "- ";
        }//ends for
    }//ends constructor


    public void addPoint(MyPoint point){
        try {                                                                    //try to
            array2d[zeroPoint-point.getY()][zeroPoint+point.getX()] = "O ";      //put a "O " in the coordinate plane
        }catch (IndexOutOfBoundsException e){                                    //catch the OutOfBounds exception
            System.out.println("Sorry, your point "+point+" is out of the borders.");
        }

    }

    public void addRectangle(MyRectangle rectangle){
        try {
            //UPPER PART
            int putStar = rectangle.getTopLeft().getX();                                        //changing coordinate
            for (int up = 0; up < rectangle.width; up++) {                                      //will continue width times
                array2d[zeroPoint-rectangle.getTopLeft().getY()] [zeroPoint+putStar] = "x ";    //row keeps its coordinate
                putStar++;                                                                      //columns change
            }
            //RIGHT PART
            putStar = rectangle.topLeft.getY();
            for (int rightSide = 0; rightSide < rectangle.height; rightSide++) {
                array2d[zeroPoint-putStar][zeroPoint+rectangle.topLeft.getX()+rectangle.width-1]="x ";
                putStar--;
            }
            //LOWER PART
            putStar = rectangle.topLeft.getX()+rectangle.width;
            for (int downSide = 0; downSide < rectangle.width; downSide++) {
                array2d[zeroPoint-rectangle.topLeft.getY()+rectangle.height-1] [zeroPoint+putStar-1] = "x ";
                putStar--;
            }
            //LEFT PART
            putStar = rectangle.topLeft.getY()-rectangle.height+1;
            for (int leftSide = 0; leftSide < rectangle.height; leftSide++) {
                array2d[zeroPoint-putStar][zeroPoint+rectangle.topLeft.getX()]="x ";
                putStar++;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Sorry, one of rectangle sides is out of borders.");
        }

    }

    public void drawPlane(){
        for (int row = 0; row < array2d.length; row++) {                //just prints elements
            for (int column = 0; column < array2d.length; column++) {
                System.out.print(array2d[row][column]);
            }
            System.out.println();
        }//ends for
    }
}

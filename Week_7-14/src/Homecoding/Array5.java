package Homecoding;

public class Array5 {
    public static void main(String[] args) {
        int first_arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        display(first_arr);
    }
    public static void display(int x[][]){
        for(int row = 0; row < x.length; row++){
            for(int column = 0; column < x[row].length; column++){
                System.out.print(x[row][column] + " ");
            }
            System.out.println();
        }
    }
}

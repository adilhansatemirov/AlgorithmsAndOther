package CodingCourse;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    Scanner in = new Scanner(System.in);
    String [][] array = new String[5][5];
    TicTacToe(){
        for (int row = 0; row < 5; row++) {
            for (int col = 1; col < 4; col+=2) {
                array[row][col]="| ";
            }
        }
        for (int row = 1; row < 4; row+=2) {
            for (int col = 0; col < 5; col+=2) {
               array[row][col]="--";
            }
        }
        for (int row = 0; row <= 4; row+=2) {
            for (int col = 0; col <= 4; col+=2) {
                array[row][col]="  ";
            }
        }
    }
    public String toString(){
        StringBuilder toReturn = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                toReturn.append(array[row][column]);
            }
            toReturn.append("\n");
        }//ends for
        return toReturn.toString();
    }
    public void acceptValue(String Xor0, int row, int column){
        if(column==2 && row==2){
            array[row][column]= Xor0+" ";
        }else {
            array[row-1][column+1] = Xor0+" ";
        }

    }
}

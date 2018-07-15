package ExamPreparation;

import java.util.Objects;
import java.util.Scanner;

public class Bingo {
    static Scanner in = new Scanner(System.in);
    static int n = 2;
    static String[][] gameArr;

    public static void main(String[] args) {
        System.out.println("Enter number of players: ");
        n = in.nextInt();
        gameArr = new String[n][8];
        drawTable();
        game();
    }

    public static void drawTable() {
        for (int row = 0; row < gameArr.length; row++) {
            for (int column = 0; column < gameArr[row].length; column++) {
                gameArr[row][column] = String.valueOf((int)(Math.random()*100));
                if(Integer.parseInt(gameArr[row][column])<10){
                    gameArr[row][column]=" "+gameArr[row][column];
                }
            }
        }
    }

    public static void printTable() {
        for (int row = 0; row < gameArr.length; row++) {
            for (int column = 0; column < gameArr[row].length; column++) {
                System.out.print(gameArr[row][column]+" ");
            }
            System.out.println();
        }
    }

    public static void game() {
        boolean playing = true;
        while(playing){
            printTable();
           int numToCross = in.nextInt();
            for (int row = 0; row < gameArr.length; row++) {
                for (int column = 0; column < gameArr[row].length; column++) {
                    if(Objects.equals(String.valueOf(gameArr[row][column]), String.valueOf(numToCross)) ||
                            Objects.equals(String.valueOf(gameArr[row][column]), " "+String.valueOf(numToCross))){
                        gameArr[row][column] = " X";
                    }
                }
            }
            for (int row = 0; row < gameArr.length; row++) {
                int counter = 0;
                for (int column = 0; column < gameArr[row].length; column++) {
                    if(Objects.equals(gameArr[row][column], " X"))
                        counter++;
                }
                if(counter==8){
                    System.out.println("Player "+(row+1)+" won!");
                    playing=false;
                }
            }
        }
    }
}
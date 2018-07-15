package Games;

import java.util.Objects;

public class Tower {
    static String[][] gameArr = new String[8][42];
    static String separate = "_";
    public static void main(String[] args) {
        buildTowers();
        moveDisk(1,3);
        printTowers();
    }

    public static void buildTowers(){
        //area
        for (int row = 0; row < gameArr.length; row++) {
            for (int column = 0; column < gameArr[row].length; column++) {
                gameArr[row][column]= separate;
            }
        }
        //needles
        for (int i = 0; i < gameArr.length; i++) {
            gameArr[i][8]="*";
            gameArr[i][20]="*";
            gameArr[i][33]="*";
        }
        //stacks
        for (int i = 4; i <= 12; i++) {
            gameArr[gameArr.length-1][i]="*";
        }
        for (int i = 5; i <=11 ; i++) {
            gameArr[gameArr.length-2][i]="*";
        }
        for (int i = 6; i <=10 ; i++) {
            gameArr[gameArr.length-3][i]="*";
        }


    }

    public static void printTowers(){
        for (int row = 0; row < gameArr.length; row++) {
            for (int column = 0; column < gameArr[row].length; column++) {
                System.out.print(gameArr[row][column]+" ");
            }
            System.out.println();
        }
    }

    public static void moveDisk(int from, int to){
        //moving from the FIRST needle
        if(from==1 && Objects.equals(gameArr[gameArr.length - 2][6], "*")){
            for (int i = 4; i <= 12; i++) {
                gameArr[gameArr.length-3][i]=separate;      //take it off the first needle
            }gameArr[gameArr.length-3][8]="*";
            //TO SECOND
            //if empty
            if(to==2 && Objects.equals(gameArr[gameArr.length - 1][18], separate)){
                for (int i = 18; i <= 22; i++) {
                    gameArr[gameArr.length-1][i]="*";
                }
            //if there is a bottom disk
            }else if(to==2 && Objects.equals(gameArr[gameArr.length - 1][18], "*") && Objects.equals(gameArr[gameArr.length - 2][18],separate)){
                for (int i = 18; i <= 22; i++) {
                    gameArr[gameArr.length-2][i]="*";
                }
            //if there are two disks
            }else if(to==2 && Objects.equals(gameArr[gameArr.length - 1][18], "*") && Objects.equals(gameArr[gameArr.length - 2][18],"*")){
                for (int i = 18; i <= 22; i++) {
                    gameArr[gameArr.length-3][i]="*";
                }
            }

            //TO THIRD
            //if empty
            if(to==3 && Objects.equals(gameArr[gameArr.length - 1][32], separate)){
                for (int i = 31; i <= 35; i++) {
                    gameArr[gameArr.length-1][i]="*";
                }
                //if there is a bottom disk
            }else if(to==3 && Objects.equals(gameArr[gameArr.length - 1][32], "*") && Objects.equals(gameArr[gameArr.length - 2][33],separate)){
                for (int i = 31; i <= 35; i++) {
                    gameArr[gameArr.length-2][i]="*";
                }
                //if there are two disks
            }else if(to==3 && Objects.equals(gameArr[gameArr.length - 1][32], "*") && Objects.equals(gameArr[gameArr.length - 2][33],"*")){
                for (int i = 31; i <= 35; i++) {
                    gameArr[gameArr.length-3][i]="*";
                }
            }

        }


    }
}

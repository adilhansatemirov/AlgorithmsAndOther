package Games;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Reverse {
    private static int[] arrayToPlay = new int[9];
    public static void main(String[] args) {
        startGameExplainRules();
        play();
    }

    public static void randFill(){
        for (int i = 0; i < arrayToPlay.length; i++) {
            arrayToPlay[i]=i+1;
        }
        Random rand = new Random();
        int randNum;
        for (int i = 0; i < arrayToPlay.length; i++) {
            randNum = rand.nextInt(9);
            if(i!=randNum) {
                int temp = arrayToPlay[i];
                arrayToPlay[i] = arrayToPlay[randNum];
                arrayToPlay[randNum] = temp;
            }
        }
    }

    public static void printArray(){
        for (int i = 0; i < arrayToPlay.length; i++) {
            System.out.print(arrayToPlay[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int indexToReverse){
        for (int i = 0; i < indexToReverse/2; i++) {
            int temp = arrayToPlay[i];
            arrayToPlay[i] = arrayToPlay[indexToReverse-1-i];
            arrayToPlay[indexToReverse-1-i] = temp;
        }
    }

    public static void startGameExplainRules(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        System.out.println("Do you know how to play?");
        System.out.println("\n1.Yes."+"\n"+"2. No.");
        int yesNo = in.nextInt();
        if(yesNo==1){
            System.out.println("Let'start then!\n");
            play();
        }else if(yesNo==2){
            System.out.println("So, your aim is to arrange list of numbers.\n" +
                    "You can do that by entering some number from 2 to 9 and the list will\n" +
                    "get reversed from 1 to the number that you entered.\n" +
                    "Example. List looks like:\n" +
                    "6 5 4 3 2 1 7 8 9\n" +
                    "if you enter '6', 6 will change places with 1\n" +
                    "5 will change places with 2\n" +
                    "and 4 changes with 3 and the list will be sorted\n" +
                    "1 2 3 4 5 6 7 8 9\n" +
                    "So, I hope it was clear enough, let's get started!\n");
            play();
        }
    }

    public static void play(){
        Scanner in = new Scanner(System.in);

        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        randFill();
        boolean playing = true;
        while (playing){
            System.out.println("How many should I reverse?");
            printArray();
            int reverseIndex = in.nextInt();
            reverse(reverseIndex);
            if(Arrays.equals(arrayToPlay, sortedArray)){
                printArray();
                System.out.println("Well done! One more time?");
                System.out.println("1.Yes.\n2.No.");
                int yesOrNo = in.nextInt();
                if(yesOrNo == 1){
                    System.out.println("\nLet's go!");
                    play();
                }else if(yesOrNo == 2){
                    System.out.println("\nAll right. See you!");
                    playing=false;
                }
            }
        }
    }
}
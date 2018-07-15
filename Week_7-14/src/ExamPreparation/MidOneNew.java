package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MidOneNew {
    static Random rand = new Random();
    static int[] randomNumbers = new int[997];
    public static void main(String[] args) {
        arrayFill();
        printArr();
        evenBetween101and210();
        divisibleBy9();
        printLargest();
        printSmallest();
    }

    public static void arrayFill() {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(530)+29;
        }
    }

    public static void evenBetween101and210() {
        ArrayList<Integer> evenBet101and210 = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i]%2==0 && randomNumbers[i]>101 && randomNumbers[i]<210){
                evenBet101and210.add(randomNumbers[i]);
                counter++;
            }
        }
        System.out.println(evenBet101and210);
        System.out.println(counter);
    }
    public static void divisibleBy9(){
        ArrayList<Integer> divisibleBy9 = new ArrayList<>();
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i]%9==0){
                divisibleBy9.add(randomNumbers[i]);
            }
        }
        System.out.println(divisibleBy9);
    }

    public static void printArr() {
        System.out.println(Arrays.toString(randomNumbers));
    }

    public static void printLargest() {
        int largest = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if(randomNumbers[i]>largest)
                largest = randomNumbers[i];
        }
        System.out.println("Largest: "+largest);
    }

    public static void printSmallest() {
        int smallest = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if(randomNumbers[i]<smallest)
                smallest = randomNumbers[i];
        }
        System.out.println("Smallest: "+smallest);
    }
}
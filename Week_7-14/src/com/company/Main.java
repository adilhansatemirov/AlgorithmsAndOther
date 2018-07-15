package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        occurrences();
    }

    public static void random() {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(91)+10;
        }
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>largest)
                largest = array[i];
        }
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<smallest)
                smallest = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number; i++) { //number is divide by i
            if(number%i==0)
                isPrime = false;
        }
        return isPrime;                    //returns whether the number inside function is prime
    }

    public static void checkingPrime() {
        for (int i = 2; i < 100; i++) {  //we check i for being prime
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static void occurrences(){
        String text = in.nextLine();
        String[] wordsArr = text.split(" ");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(wordsArr));
        ArrayList<String> checkedWords = new ArrayList<>();
        ArrayList<Integer> counters = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if(!checkedWords.contains(words.get(i))){
                checkedWords.add(words.get(i));
                counters.add(1);
            }else{
                int temp = counters.get(checkedWords.indexOf(words.get(i)));
                temp++;
                counters.set(checkedWords.indexOf(words.get(i)),temp);
            }
        }
        System.out.println(checkedWords);
        System.out.println(counters);
    }
}


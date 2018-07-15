package MidTerm2;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] testArr = {1,3,39,40,4,3,7};
        System.out.println(secondLargest(testArr));
    }
    public static int secondLargest(int[] array){
        int largest = array[0];
        int secondLargest = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>largest){
                secondLargest = largest;
                largest = array[i];
            }
        }

        return secondLargest;
    }
}

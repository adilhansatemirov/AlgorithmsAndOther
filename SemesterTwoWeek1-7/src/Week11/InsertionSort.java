package Week11;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] array = randomArray(100000,0,100);
        int[] array = {12,9,4,99,120,1,3,10};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static int[] randomArray(int numberOfElements, int from, int to) {
        int[] array = new int[numberOfElements];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (from + Math.random() * (to - from + 1));
        }
        return array;
    }

    private static void insertionSort(int[] array){
        int current;
        //WE START WITH INDEX '1', SINCE WE CONSIDER THE FIRST ELEMENT TO BE SORTED
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            //'CURRENT' IS THE ELEMENT THAT WE WANT TO START SORTING WITH
            current = array[currentIndex];
            for (int indexSorted = 0; indexSorted < currentIndex; indexSorted++) {
                if(current<array[indexSorted]){
                    swap(array,currentIndex,indexSorted);
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

package Week11;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = randomArray(100000,1,100);
//        int[] array = {7,6,8,9,3,2,10,5,1};

        int gap = (int)Math.ceil(array.length/2);
        long time = System.nanoTime();
        shellSort(array,gap);
        long elapsed = System.nanoTime()-time;
        System.out.println(Arrays.toString(array));
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed for Shell Sort");

    }
    private static void shellSort(int[] array, int gap){
        for (int index = 0; index < array.length - gap; index++) {
            if(array[index]>array[index+gap]) {
                swap(array, index, index + gap);
            }
        }

        if(gap>1){
            shellSort(array, gap/2);
        }else if(gap==1){
            insertionSort(array);
        }
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
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            current = array[currentIndex];
            for (int indexSorted = 0; indexSorted < currentIndex; indexSorted++) {
                if(current<array[indexSorted]){
                    swap(array,currentIndex,indexSorted);
                }
            }
        }
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

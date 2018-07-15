package Week11;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] givenArray = randomArray(100000, 1, 100);
        //int[] array = {11, 2, 14, 8, 6, 3, 12,7,4,7,2,1,94,587};

        System.out.println(Arrays.toString(givenArray));
        long time = System.nanoTime();
        quickSort(givenArray,0,givenArray.length);
        long elapsed = System.nanoTime()-time;
        System.out.println(Arrays.toString(givenArray));
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed for Quick Sort Sort");
    }

//                                      which array we      from what in index to which
//                                       want to sort        you want it to be sorted
    private static void quickSort(int[] array, int indexBeginning, int indexEnd) {
        //imaginary WALL where we store values smaller than PIVOT
        int wall = indexBeginning-1;
        //by default PIVOT is the last element
        int pivot = array[indexEnd-1];
        //index of pivot
        int pivotIndex = indexEnd-1;

        //current element that we compare to the pivot
        int current;
        //goes from given indexes
        for (int currentIndex = indexBeginning; currentIndex < indexEnd; currentIndex++) {
            current = array[currentIndex];

            //if current element is less than PIVOT, move WALL(because we store values there values less than pivot)
            //we put current element across the WALL
            if (current < pivot) {
                wall++;
                swap(array, currentIndex, wall);
            }
        }

        //after we found position of the pivot we swap it with an element next to the WALL
        swap(array,wall+1,pivotIndex);

        //now the position of the PIVOT is one next to the WALL
        pivotIndex = wall + 1;
        //if if there are elements to sort(index of pivot - beginning index should be bigger than 1)
        if (pivotIndex-indexBeginning>1) {
            quickSort(array,0,pivotIndex);
        }
        //the same thing on the right side
        if (indexEnd-pivotIndex>1) {
            quickSort(array,pivotIndex+1,indexEnd);
        }
    }
    private static int[] randomArray(int numberOfElements, int from, int to) {
        int[] array = new int[numberOfElements];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (from + Math.random() * (to - from + 1));
        }
        return array;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

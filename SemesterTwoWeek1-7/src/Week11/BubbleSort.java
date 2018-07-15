package Week11;
import java.util.Arrays;

public class BubbleSort {
    static int steps = 0;
    public static void main(String[] args) {
        int[] givenArray = randomArray(100,0,100);
        System.out.println("Array before sorting: \n"+ Arrays.toString(givenArray));
        long time = System.nanoTime();
        bubbleSort(givenArray);
        long elapsed = System.nanoTime()-time;
        System.out.println("Array after sorting: \n"+ Arrays.toString(givenArray));
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed for Bubble Sort");
        System.out.println(steps);
    }
    private static int[] randomArray(int numberOfElements, int from, int to){
        int[] array = new int[numberOfElements];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(from+Math.random()*(to-from+1));
        }
        return array;
    }
    private static void bubbleSort(int[] array){
        boolean check;
        for (int counter = 0; counter < array.length; counter++) {
            check = false;  //check false
            for (int index = 0; index < array.length-1; index++) {
                if(array[index]>array[index+1]){
                    int temp = array[index];               //save bigger one
                    array[index] = array[index+1];
                    //set bigger one to smaller one
                    array[index+1] = temp;                 //set smaller one to bigger one
                    check = true;
                }
                steps++;
            }
            if(!check)
                break;
            //if it is still false and if no changes were made,
            //array is sorted, no need to continue
        }
    }
}

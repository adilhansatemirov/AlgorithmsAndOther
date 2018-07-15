package Week11;

import java.util.ArrayList;

//******DICTIONARY**********
//   ARRAYLIST = BUCKET
//**************************

public class BucketSort {
    //INITIALIZING THE BUCKETS
    static ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();

    //CREATING RANDOM ARRAY FROM 0 TO 99
    static int[] givenArray = randomArray(100000,0,100);
    public static void main(String[] args) {

        long time = System.nanoTime();
        //FILLING THEM WITH EMPTY BUCKETS
        fillBuckets();

        int bucketIndex;
        //PUTTING ELEMENTS IN 10 BUCKETS
        for (int index = 0; index < givenArray.length; index++) {
            //DETERMINING INDEX OF BUCKET BY DIVIDING ELEMENT BY 'DIVIDER'
            bucketIndex = givenArray[index]/divider();
            //GETTING INDEX OF BUCKET AND PUT THIS ELEMENT
            buckets.get(bucketIndex).add(givenArray[index]);
        }


        //SEPARATELY SORT ELEMENTS IN THIS SMALL BUCKETS
        for (int index = 0; index < buckets.size(); index++) {
            insertionSort(buckets.get(index));
        }

        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed for Bucket Sort");
        //PRINTING SORTED ELEMENTS
        for (int indexOfBucket = 0; indexOfBucket < buckets.size(); indexOfBucket++) {
            for (int indexBucketInside = 0; indexBucketInside < buckets.get(indexOfBucket).size(); indexBucketInside++) {
                System.out.print(buckets.get(indexOfBucket).get(indexBucketInside)+" ");
            }
        }
        System.out.println();

    }

    //FUNCTION TO CREATE RANDOM ARRAY
    private static int[] randomArray(int numberOfElements, int from, int to){
        int[] array = new int[numberOfElements];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(from+Math.random()*(to-from+1));
        }
        return array;
    }

    //FUNCTION TO FILL BUCKETS WITH 10 SMALL BUCKETS
    private static void fillBuckets(){
        for (int i = 0; i <= 9; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    //FUNCTION TO SORT SMALL BUCKETS
    private static void insertionSort(ArrayList<Integer> array){
        int current;
        for (int currentIndex = 1; currentIndex < array.size(); currentIndex++) {
            current = array.get(currentIndex);
            for (int indexSorted = 0; indexSorted < currentIndex; indexSorted++) {
                if(current<array.get(indexSorted)){
                    swap(array,currentIndex,indexSorted);
                }
            }
        }
    }

    //FUNCTION TO SWAP TWO ELEMENTS IN A GIVEN ARRAY BY INDEXES
    public static void swap(ArrayList<Integer> arrayList, int number1Index,int number2Index){
        int temp = arrayList.get(number1Index);                     //save bigger one
        arrayList.set(number1Index,arrayList.get(number2Index));    //set bigger one to smaller one
        arrayList.set(number2Index,temp);                           //set smaller one to bigger one
    }

    //FUNCTION TO FIND DIVIDER
    public static int divider(){
        //  FORMULA
        //divider = ceil(max+1)/numberOfBuckets-1

        int max = givenArray[0];
        for (int index = 1; index < givenArray.length; index++) {
            if(givenArray[index]>max){
                max = givenArray[index];
            }
        }
        return  (int)Math.ceil((max+1)/9);
    }
}

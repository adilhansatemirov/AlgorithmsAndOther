package Week11;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] givenArray = randomArray(100000,0,30);

        System.out.println("Before sorting: \n"+Arrays.toString(givenArray));
        long time = System.nanoTime();
        selectionSort(givenArray);
        long elapsed = System.nanoTime()-time;
        System.out.println("After sorting: \n"+Arrays.toString(givenArray));
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed for Selection Sort");
    }
    private static int[] randomArray(int numberOfElements, int from, int to){
        int[] array = new int[numberOfElements];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(from+Math.random()*(to-from+1));
        }
        return array;
    }

    private static void selectionSort(int[] array){
        int minimumValue;
        int indexOfMinimumValue = 0;
        //GOING THROUGH ALL THE ARRAY
        for (int counter = 0; counter < array.length; counter++) {

            //==='COUNTER' IS THE INDEX OF THE FIRST UNORDERED ELEMENT===
            //AND AFTER EVERY CYCLE IT INCREMENTS BY ONE
            //AND EVERYTHING THAT IS LESS THAN COUNTER IS SORTED

            //LOOK FOR MINIMUM VALUE
            minimumValue = array[counter];
            //BOOLEAN TO CONTROL WHETHER THE THE ELEMENT WE WANT PLACE IS ALREADY SORTED, ALREADY 'inPlace'
            boolean inPlace = true;

            //STARTING FROM THE COUNTER (INDEX OF THE FIRST UNORDERED ELEMENT)
            for (int index = counter; index < array.length; index++) {

                //IF WE FOUND OUT THAT THERE IS LESS VALUE THAT 'minimumValue'
                if(minimumValue>array[index]){

                    //WE SAVE THIS NUMBER AND INDEX
                    minimumValue = array[index];
                    indexOfMinimumValue = index;

                    //SET 'inPlace' TO FALSE, MEANS WE WANT TO CHANGE ITS POSITION
                    inPlace = false;
                }
            }

            //IF VALUE IS NOT IN PLACE
            if(!inPlace) {
                swap(array,counter,indexOfMinimumValue);
                //put minimumValue to the place of the first unordered element, making it 'SORTED'
                //in the place of minimumValue we put element from the beginning
            }
            //BUT IF IT IS 'inPlace', MEANS THAT THE VALUE WE LOOKED AT IS ALREADY IN THE PLACE,
            // WHERE IT IS SUPPOSED TO BE. SO WE DO NOTHING...
        }
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

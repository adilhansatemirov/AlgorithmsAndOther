package Week11;

public class BubbleSortStrings {
    public static void bubbleSortStrings(String[] array){
        int indexLetter = 0;
        //sorting by the first letter
        for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].charAt(indexLetter) > array[i + 1].charAt(indexLetter)) {
                    swap(array, i, i + 1);
                }else if(array[i].charAt(indexLetter)==array[i+1].charAt(indexLetter)){
                    if(array[i].charAt(indexLetter+1) > array[i + 1].charAt(indexLetter+1)){
                        swap(array, i, i+1);
                    }
                }
            }
        }

    }
    public static void swap(String[] array, int index1, int index2){
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

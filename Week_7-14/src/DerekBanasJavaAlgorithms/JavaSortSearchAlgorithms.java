package DerekBanasJavaAlgorithms;

public class JavaSortSearchAlgorithms {
    private int[] theArray = new int[50];
    private int arraySize = 15;
    public void generateRandomArray(){
        for (int i = 0; i <= arraySize; i++) {
            theArray[i]=(int)(Math.random()*10)+10;
        }//end for
    }
    public void printArray(int[] array){
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            System.out.print("  "+i+" |");
//            System.out.println(" "+array[i]+" |");
        }
        for (int i = 10; i < arraySize; i++) {
            System.out.print(" "+i+" |");
        }
        System.out.println();
        System.out.print("-");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("-----");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(" "+theArray[i]+" |");
        }
        System.out.println();
    }
    public int getValueAtIndex(int index){
        if(index<arraySize){
            return theArray[index];
        }return 0;
    }
    public boolean doesArrayContainThisValue(int value) {
        boolean contains = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                contains = true;
            }
        }//ends for
        return contains;
    }
    public void deleteIndex(int index){
        if(index<arraySize){
            for(int i = index; i<=arraySize-1; i++){
                theArray[i]=theArray[i+1];
            }
            arraySize--;
        }
    }
    public void insertValue(int value){
        arraySize++;
        theArray[arraySize]=value;
    }
    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexsWithValue = "";
        System.out.print("The Value was found in the following: ");
        for (int i = 0; i <= arraySize; i++) {
            if(theArray[i]==value){
                valueInArray = true;
                System.out.print(i + " ");
                indexsWithValue += i+" ";
            }
        }//end for
        if(!valueInArray){
            indexsWithValue = "None";
            System.out.print(indexsWithValue);
        }
        System.out.println();
        return indexsWithValue;
    }
    public void bubbleSort(){
        int replace;
        for(int i = 0; i<arraySize; i++){
            for (int j = 0; j <arraySize; j++) {
                if(theArray[j+1]<theArray[j]){
                    replace = theArray[j];
                    theArray[j]=theArray[j+1];
                    theArray[j+1]=replace;
                }
            }
        }
    }
    public void binarySearchForValue(int value){
        int infinityDestructor = arraySize;
        int lowIndex = 0;
        int highIndex = arraySize-1;
        while(infinityDestructor>=0){
            if(infinityDestructor==0){
                System.out.println("Value was not found.");
                break;
            }
            int midIndex = (lowIndex+highIndex)/2;
            if(theArray[midIndex]<value) {
                lowIndex=midIndex+1;
                infinityDestructor--;
            }
            else if(theArray[midIndex]>value) {
                highIndex=midIndex-1;
                infinityDestructor--;
            }else{
                System.out.println("\nFound a Match for "+value+" at index "+midIndex);
                break;
            }
        }//ends while
    }
    public void selectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = i; j < arraySize; j++) {
                if(theArray[j]<theArray[minimum]){
                    minimum=j;
                }
            }//ends j for
            int temp = theArray[i];
            theArray[i]=theArray[minimum];
            theArray[minimum]=temp;
        }//ends i for
    }
    public void insertionSort(){
        for (int i = 1; i < arraySize; i++) {
            int placeOfMin = i-1;
            int minimum=i-1;
            for (int j = i; j < arraySize; j++) {
                if(theArray[j]<theArray[minimum]) minimum=j;
            }
            theArray[placeOfMin]=theArray[minimum];
        }
    }

    public static void main(String[] args) {
        JavaSortSearchAlgorithms newArray = new JavaSortSearchAlgorithms();
        newArray.generateRandomArray();
//        newArray.printTowers(newArray.theArray);
//        System.out.println(newArray.getValueAtIndex(3));
//        System.out.println(newArray.doesArrayContainThisValue(21));
//        newArray.deleteIndex(5);
//        newArray.insertValue(55);
        newArray.bubbleSort();
//        newArray.printTowers(newArray.theArray);
//        System.out.println("****************************************************************************");
//        newArray.binarySearchForValue(12);
//        newArray.linearSearchForValue(55);
//        newArray.selectionSort();
//        newArray.selectionSort();
        newArray.printArray(newArray.theArray);
    }
}

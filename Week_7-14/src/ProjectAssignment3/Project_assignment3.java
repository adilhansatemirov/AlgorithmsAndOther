package ProjectAssignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Project_assignment3 {
    public static void main(String[] args) {
        //Part 1
//        int arr2d[][] = {{9, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//        int arr1dd[]={1,2,3,4,5};
//       int arr1d[]=randFill(6,10,20);
//        int[][] arr2d = randFill(4,6,0,20);
//       arrayPrint(">>Initial Array2D",arr2d);
//        System.out.println(">> Array has " + rows(arr2d) + " rows.");
//        System.out.println(">> Array has " + cols(arr2d) + " columns.");
//        System.out.println(">> Number of elements: " + numOfElements(arr2d));
//        System.out.println(">> Max in array: " + arrayMax(arr2d));
//        System.out.println(">> Min in array: " + arrayMin(arr2d));
//        System.out.println(">> Array range: " + arrayRange(arr2d));
//        System.out.println(">> Sum of elements: " + arraySum(arr2d));
//        arrayPrint(">> Sum of elements per row", sumRows(arr2d));
//        arrayPrint(">> Sum of elements per column", sumCols(arr2d));
//        System.out.println(">> Ave in array (rounded up to 3 decimal points): " + arrayAve(arr2d));
//        arrayPrint(">> Odd elements", arrayOdds(arr2d));
//        arrayPrint(">> Even elements", arrayEvens(arr2d));
//        arrayPrint(">> Prime elements", arrayPrimes(arr2d));
//        arrayPrint(">>Before shuffle",arr2d);
//        arrayShuffle(arr2d);
//        arrayPrint(">>After first shuffle",arr2d);
//        arrayShuffle(arr2d);
//        arrayPrint(">> After 2nd shuffle", arr2d);
        arrayPrint("Array filled in clockwise order", clockwiseFill(5, 5));
//        int[][] ones = fillArray(3, 3, 1);
//        arrayPrint("Array filled with 1s", ones);


        // PART TWO
//        System.out.println();
//        int[] arr1d = randFill(11, 0, 20);
//        int[] arr1d = {7,6,5,4,3,2,0};
//        arrayPrint("Not sorted",arr1d);
//        reverse(arr1d);
//        arrayPrint("Reversed", arr1d);
//        bubbleSort(arr1d);
//        arrayPrint("Sorted", arr1d);
    }

    public static int rows(int[][] array) {
        int counter = 0;
        for (int[] anArray : array) {
            counter++;
        }
        return counter;
    }

    private static int cols(int[][] array) {
        int numOfCol = 0;
        for(int[] smallArrayInsideArray: array)         //for every array inside the array
            if(smallArrayInsideArray.length>numOfCol){  //if length of small array is bigger than the length of the previous
            numOfCol=smallArrayInsideArray.length;      //new number of columns is that array length
            }
        return numOfCol;
    }

    public static int[][] fillArray(int n, int m, int num) {
        int[][] newArr = new int[n][m];                             //create a new array n*m
        for (int row = 0; row < newArr.length; row++) {             //big array length times do this
            for (int col = 0; col < newArr[row].length; col++) {    //small inside array times
                newArr[row][col] = num;                             //assign the value to num
            }
        }
        return newArr;
    }

    public static int[][] randFill(int n, int m, int from, int to) {
        Random rand = new Random();
        int[][] newArr = new int[n][m];
        for (int row = 0; row < newArr.length; row++) {
            for (int col = 0; col < newArr[row].length; col++) {                //the same thing as above
                newArr[row][col] = rand.nextInt(to - from + 1) + from;   //but put random values from
            }
        }
        return newArr;
    }

    public static int[] randFill(int n, int from, int to) {
        Random rand = new Random();
        int newArr[] = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rand.nextInt(to - from + 1) + from;
        }
        return newArr;
    }

    public static void arrayPrint(String name, int[][] array) {
        System.out.println(name);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayPrint(String name, int[] array) {
        System.out.println(name + "\n" + Arrays.toString(array));
    }

    public static int arrayMax(int[][] array) {
        int arrMax = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (arrMax < array[row][col])
                    arrMax = array[row][col];
            }
        }
        return arrMax;
    }

    public static int arrayMin(int[][] array) {
        int arrMin = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col]<arrMin)
                    arrMin = array[row][col];
            }
        }
        return arrMin;
    }

    public static int arrayRange(int[][] array) {
        return arrayMax(array) - arrayMin(array);
    }

    public static int arraySum(int[][] array) {
        int arrSum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                arrSum += array[row][col];
            }
        }
        return arrSum;
    }

    public static int[] sumRows(int[][] array) {
        List<Integer> list1 = new ArrayList<>();
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int row_el = 0; row_el < array[row].length; row_el++) {
                sum += array[row][row_el];
                if (row_el == array[row].length - 1)
                    list1.add(sum);
            }
        }
        return list1.stream().mapToInt(i -> i).toArray();
    }

    public static int[] sumCols(int[][] array) {
        List<Integer> list1 = new ArrayList<>();
        for (int col = 0; col < cols(array); col++) {
            int sum_col_el = 0;
            for (int row = 0; row < array.length; row++) {
                sum_col_el += array[row][col];
                if (row == array.length - 1)
                    list1.add(sum_col_el);
            }
        }
        return list1.stream().mapToInt(i -> i).toArray();
    }

    public static double arrayAve(int[][] array) {
        return Math.round((double) arraySum(array) / (double) numOfElements(array) * 1000.0) / 1000.0;
    }

    public static int numOfElements(int[][] array) {
        int numOfEl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                numOfEl++;
            }
        }
        return numOfEl;
    }

    public static int[] arrayOdds(int[][] array) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] % 2 != 0 && !list1.contains(array[row][col])){
                    list1.add(array[row][col]);
                }
            }
        }
        return list1.stream().mapToInt(i -> i).toArray();
    }

    public static int[] arrayEvens(int[][] array) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] % 2 == 0 && !list1.contains(array[row][col]))
                    list1.add(array[row][col]);
            }
        }
        return list1.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 1)
            isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int[] arrayPrimes(int[][] array) {
        List<Integer> list1 = new ArrayList<>();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (isPrime(array[row][col]))
                    list1.add(array[row][col]);
            }
        }
        return list1.stream().mapToInt(i -> i).toArray();
    }

    public static void arrayShuffle(int[][] array) {
        Random rand = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int rand_row = rand.nextInt(array.length);
                int rand_col = rand.nextInt(array[row].length);

                int new_el = array[row][col];
                array[row][col] = array[rand_row][rand_col];
                array[rand_row][rand_col] = new_el;

            }
        }
    }

    public static void reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
    }

    public static void bubbleSort(int[] array) {
        int replace;
        for(int j=0; j<array.length;j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    replace = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = replace;
                }
            }
        }
    }

    public static int[][] clockwiseFill(int n, int m) {
        int[][] resArr = new int[n][m];
        int value = 0;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;
        while(value<n*m){
            for(int i = startCol;i<=endCol; i++){
               resArr[startRow][i]=++value;
            }
            for(int i=startRow+1;i<=endRow;i++){
                resArr[i][endCol]=++value;
            }
            for(int i=endCol-1;i>=startCol;i--){
                resArr[endRow][i]=++value;
            }
            for(int i=endRow-1;i>startRow;i--){
                resArr[i][startCol]=++value;
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return resArr;
    }
}


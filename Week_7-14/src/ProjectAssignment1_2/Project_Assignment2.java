package ProjectAssignment1_2;

import java.util.Random;
import java.util.*;

public class Project_Assignment2 {
    public static void main(String[] args) {
        int[] arr = randFill(5, 0, 90);
        int[] exampleArr = {2,4,12,44,50};
        arrayPrint(">>Initial array\n",arr);
        System.out.println(">>Max in array: "+arrayMax(arr));
        System.out.println(">>Min in array: "+arrayMin(arr));
        System.out.println(">>Array range: "+arrayRange(arr));
        System.out.println(">>Sum of elements: "+arraySum(arr));
        System.out.println(">>Number of elements: "+arr.length);
        System.out.println(">>Average in array(rounded up to 3 decimal points): "+arrayAve(arr));
        arrayPrint(">>Odd elements: ",arrayOdds(arr));
        arrayPrint(">>Even elements: ",arrayEvens(arr));
        arrayPrint(">>Prime elements: ",arrayPrimes(arr));

        arrayPrint(">>Before shuffle:", arr);
        arrayShuffle(arr);
        arrayPrint(">>After first shuffle: ",arr);
        arrayShuffle(arr);
        arrayPrint(">>After second shuffle: ",arr);
    }

    public static int[] randFill(int n, int from, int to) {
        Random rand = new Random();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(to - from + 1) + from;
        }
        return x;
    }
    public static void arrayPrint(String name, int[] array){
        System.out.println(name + Arrays.toString(array));
    }
    public static int arrayMax(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i]>max)
                max = array[i];
        }
       return max;
    }
    public static int arrayMin(int[] array){
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
    public static int arrayRange(int[] array){
        return arrayMax(array)-arrayMin(array);
    }
    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static double arrayAve(int[] array){
        return Math.round(arraySum(array)/(double)array.length*1000.0)/1000.0;
    }
    public static int[] arrayOdds(int[] array){
        List<Integer> list1 = new ArrayList<>();
        for(int x: array){
            if(x%2!=0)
            list1.add(x);
        }
        return list1.stream().mapToInt(i->i).toArray();
    }
    public static int[] arrayEvens(int[] array){
        /*List<Integer> list1 = new ArrayList<Integer>();
        for(int x: array){
            if(x%2==0)
                list1.add(x);
        }
        return list1.stream().mapToInt(i->i).toArray();*/
        int[] a = new int[0];
        for (int x : array)
            if (x%2==0) {
                a = Arrays.copyOf(a,a.length+1);
                a[a.length-1] = x;
            }
        return a;
    }
    public static int[] arrayPrimes(int[] array){
        List<Integer> list1 = new ArrayList<Integer>();
        for(int x: array){
            boolean isPrime = true;
            for(int i=2; i<x;i++){
                if(x%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list1.add(x);
            }
        }
        return list1.stream().mapToInt(i->i).toArray();
    }
    public static int[] arrayShuffle (int[] array){
        Random rand = new Random();
        int intNum;
        for(int i=0; i<array.length; i++){
            int randNum = rand.nextInt(array.length);
            if (i != randNum) {
                intNum = array[i];
                array[i] = array[randNum];
                array[randNum]=intNum;
            }
        }
        return array;

    }
}



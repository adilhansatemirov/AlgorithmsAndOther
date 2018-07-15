package ICT;

import java.util.Arrays;

public class MinMax {
    static int result;
    public static void main(String[] args) {
        int[] array = {1,2,2,5,4,3,3,1};
        minMax(array,"max");
        System.out.println(result);
    }
    public static void minMax(int[] array,String minOrMaxGoesFirst){
        /*The principle that makes this algorithm work:
        * Initially we are given an array, that contains the lowest part of the tree.
        * Also we have the string of who goes first(first from the lowest part[max or min])
        * 1. First of all we need to check whether it is possible to execute algorithm.
        *       We do it by checking length of array given. If it is not the number like
        *       [2,4,8,16,32...] then it is not possible to make an appropriate tree.
        * 2. Since it is a recursive algorithm the 'base case' here is the case when the
        *       length of array is 2. Then we just need to find minimum/maximum of 2 numbers
        *       and it will be the result.
        * 3. If the length is appropriate, bigger than 2 and first goes 'min', we go through the whole
        *       array and find minimum in each pair and store the results in 'arrayLevelUpper'. Then we
        *       call the same method, but with opposite value of 'min/max'.
        * */

        //checks validity of length of array
        if(Math.log(array.length)/Math.log(2)%1!=0){
            System.out.println("Input is invalid");
            return; //stop the method
        }

        //if array has only two elements
        if(array.length==2){
            if(minOrMaxGoesFirst.equals("max")) {
                result = maximum(array[0], array[1]);
            }else
                result = minimum(array[0], array[1]);
            return; //stop the method
        }

        //create a sub array, which contains the results of the minimizing/maximizing
        int[] arrayLevelUpper = new int[array.length/2];
        if(minOrMaxGoesFirst.equals("min")) {
            //minimizing each pair of array
            for (int i = 0; i < array.length; i += 2) {
                //saving them in sub array
                arrayLevelUpper[i / 2] = minimum(array[i], array[i + 1]);
            }
            //giving the opposite player(max) take a move
            minMax(arrayLevelUpper, "max");
        }else{
            //minimizing each pair of array
            for (int i = 0; i < array.length; i += 2) {
                //saving them in sub array
                arrayLevelUpper[i / 2] = maximum(array[i], array[i + 1]);
            }
            //giving the opposite player(min) take a move
            minMax(arrayLevelUpper, "min");
        }
    }
    public static int minimum(int num1, int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static int maximum(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}

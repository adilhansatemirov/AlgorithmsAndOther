package Homecoding;

public class Array2 {
    public static void main(String[] args) {
        int new_one[]= {12,32,34,54,56,76};
        int sum = 0;
        for(int i = 0; i< new_one.length; i++ ){
            sum+=new_one[i];
        }
        System.out.println(sum);
    }
}

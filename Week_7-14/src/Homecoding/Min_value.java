package Homecoding;
import java.util.Scanner;
public class Min_value {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = my.nextInt();
        int b = my.nextInt();
        int c = my.nextInt();
        System.out.println("The smallest number is: " + min_value(a,b,c) + ".")  ;
    }
    public static int min_value(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}

package ACMP;


import java.util.Scanner;

public class Tasks {
    static int n;
    static int result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        find(n);

        System.out.println(result+" "+((n-result*5)/3));
    }
    public static void find(int number){
        if((n -((number/5)*5))%3==0){
            result = number/5;
        }else{
            number-=5;
            find(number);
        }
    }
}

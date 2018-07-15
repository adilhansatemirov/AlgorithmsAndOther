package ACMP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int value = 3;
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if(in.nextInt()==1){
                sum+=value;
                value++;
            }else{
                if(value-3>=3){
                    value-=3;
                }else
                    value=3;
            }
        }

        if(number<=10000 && sum>=70){
            System.out.println(70);
        }else{
            System.out.println(sum);
        }

    }
}
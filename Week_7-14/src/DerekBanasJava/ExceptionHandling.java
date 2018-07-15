package DerekBanasJava;
import java.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
//        divideByZero(2);

//        System.out.println("How old are you?");
//        int age = checkValidAge();
//        if (age != 0) {
//            System.out.println("So, your age is: " + age);
    getFile("\\textThatDoesn'tExist.txt");

    }

    public static void divideByZero(int number){
        try{
            System.out.println(number/0);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero!");
            System.out.println(e.getMessage());
        }

    }
    public static int checkValidAge(){
        try{
            return in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid data input");
            return 0;
        }
    }
    public static void getFile(String fileAdress){
        try{
            FileInputStream reader = new FileInputStream(fileAdress);
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}


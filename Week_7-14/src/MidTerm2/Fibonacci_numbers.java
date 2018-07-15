package MidTerm2;

public class Fibonacci_numbers {
    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//        for (int i = 0; i < 20; i++) {
//            num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//            System.out.println(num3);
//        }
        fibonacciNumbersTill(100);
    }

    public static void fibonacciNumbersTill(int tillThisNumber){
        int num1 = 0;
        int num2 = 1;
        int num3;

        for (int i = 0; i < tillThisNumber; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}

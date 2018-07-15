package MidTerm2;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
//        for(int i = 2; i<=100; i++){
//            for (int j = 2; j<=i; j++){
//                if(i==j){
//                    System.out.println(i);
//                }
//                if(i%j==0){
//                    break;
//                }
//            }
//        }
//        primeUpToNumber(99);
        System.out.println(isPrime(43));
    }

    public static void primeUpToNumber(int number){
        ArrayList<Integer> primes = new ArrayList<>();

        for (int counter1 = 2; counter1 < number; counter1++) {
            for (int counter2 = 2; counter2 <= counter1; counter2++) {
                if(counter1==counter2){
                    primes.add(counter1);
                }
                if(counter1%counter2==0){
                    break;
                }
            }
        }
        System.out.println(primes);
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int counter = 2; counter < number; counter++) {
            if(number%counter==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
}

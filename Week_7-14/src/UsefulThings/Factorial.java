package UsefulThings;

public class Factorial {
    public static void main(String[] args) {

    }
    private static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }//ends method
}

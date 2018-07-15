package MidTerm2;

public class PowerMethod {
    public static void main(String[] args) {
        System.out.println(power(4,2));
    }
    public static int power(int number, int power){
        int num = number;
        int result = number;

        for (int i = 1; i < power; i++) {
            result*=num;
        }
        return result;
    }
}

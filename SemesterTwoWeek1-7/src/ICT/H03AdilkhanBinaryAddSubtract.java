package ICT;

public class H03AdilkhanBinaryAddSubtract {
    public static void main(String[] args) {
        binaryAddSubtract(10001, 1001110110);
    }

    public static void binaryAddSubtract(long num1, long num2){
        int sumDecimal = binaryToDecimal(num1)+binaryToDecimal(num2);
        int diffDecimal = binaryToDecimal(num1)-binaryToDecimal(num2);
        long sumBinary = decimalToBinary(sumDecimal);
        long diffBinary;
        if(diffDecimal<0)
            diffBinary = Math.negateExact(decimalToBinary(diffDecimal));
        else
            diffBinary = decimalToBinary(diffDecimal);
        System.out.println("Sum: "+sumBinary + "  ("+sumDecimal+")");
        System.out.println("Difference: "+diffBinary + "  ("+diffDecimal+")");

    }
    public static int binaryToDecimal(long number){ //long is chosen, so that it can take larger binary number
        int result = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            //take the last number and multiply it by 2^(0,1,2,3,4,5)
            result+=(number%10)*Math.pow(2,i);
            //just make it less by one point dividing by 10
            number/=10;
        }
        return result;
    }
    public static long decimalToBinary(int number){
        number = Math.abs(number);
        //so that it works with negative numbers
        StringBuilder reverseResult = new StringBuilder();
        while (number!=0){
            //the remainder is added to reverse stringBuilder
            reverseResult.append(number%2);
            //divide by two in order to go to the next step
            number/=2;
        }
        //reverse our string to get final result
        StringBuilder result = new StringBuilder();
        for (int i = reverseResult.length()-1; i >= 0; i--) {
            result.append(reverseResult.charAt(i));
        }
        return Long.parseLong(result.toString());
    }
}
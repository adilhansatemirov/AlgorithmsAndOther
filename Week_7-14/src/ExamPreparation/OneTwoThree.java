package ExamPreparation;

public class OneTwoThree {
    public static void main(String[] args) {
        oneTwoThree(2234);
    }

    public static void oneTwoThree(int number) {
        int result = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            result+=number%10;
            number/=10;
        }
        System.out.println(result);
    }
}

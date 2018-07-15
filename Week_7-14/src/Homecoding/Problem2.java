package Homecoding;

public class Problem2 {
    public static void main(String[] args) {
        for(int i = 0; i<=2;i++) {
            System.out.print(my_new_string("HelloWorld"));
        }
    }public static String my_new_string(String str){
        char one = str.charAt(str.length() - 1);
        char two = str.charAt(str.length() - 2);
        String opt = "" + one;
        String opt2 = "" + two;
        return opt2 + opt;
    }
}

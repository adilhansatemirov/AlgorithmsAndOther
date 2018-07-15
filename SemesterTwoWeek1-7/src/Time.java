import java.util.Arrays;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
    public static int ordinalIndexOf(String str, String substr, int n) {
        int pos = str.indexOf(substr);
        while (--n > 0 && pos != -1)
            pos = str.indexOf(substr, pos + 1);
        return pos;
    }
}

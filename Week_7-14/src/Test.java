import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "";
        while (in.hasNextLine()){
            if(in.next().equals("stop")){

            }
            text+=in.nextLine();
        }

        String charToCountStr = in.next();
        char charToCount = charToCountStr.charAt(0);

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == charToCount)
                counter++;
        }
        System.out.println(text);
        System.out.println(counter);

    }
}

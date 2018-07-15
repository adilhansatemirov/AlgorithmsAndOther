package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Messages {
    public static void main(String[] args) {
        String message1 = "Hello my friend. My name is Zhangir. I am from Aktobe. I like apples.";
        String message2 = "Welcome to SDU. You are student now. Enjoy time here";
        occurrencesOfWords(message1);
    }

    public static void howMany(String mess){
        String[] words = mess.split(" ");
        int numberOfLetters = 0;
        int numberOfDigits = 0;
        for (int i = 0; i < mess.length(); i++) {
            if(mess.charAt(i)>=97 && mess.charAt(i)<=122 || mess.charAt(i)>=65 && mess.charAt(i)<=90)
                numberOfLetters++;
            if(mess.charAt(i)>=48 && mess.charAt(i)<=57)
                numberOfDigits++;
        }
        System.out.println("Number of words: "+words.length+"\nNumber of letters: "+numberOfLetters+"\nNumber of digits: "+numberOfDigits);
    }

    public static void vowelWin(String mess1, String mess2) {
        String mess1Lower = mess1.toLowerCase();
        int vowelsOfFirst = 0;
        for (int i = 0; i < mess1Lower.length(); i++) {
            char thisChar = mess1Lower.charAt(i);
            if(thisChar=='a' || thisChar=='e' || thisChar=='i' || thisChar=='u' || thisChar=='o')
                vowelsOfFirst++;
        }

        String mess2Lower = mess2.toLowerCase();
        int vowelsOfSecond = 0;
        for (int i = 0; i < mess2Lower.length(); i++) {
            char thisChar = mess2Lower.charAt(i);
            if(thisChar=='a' || thisChar=='e' || thisChar=='i' || thisChar=='u' || thisChar=='o')
                vowelsOfSecond++;
        }

        System.out.println("First: "+vowelsOfFirst+"\nSecond: "+vowelsOfSecond+"\n");
        if(vowelsOfFirst>vowelsOfSecond)
            System.out.println("First wins!");
        else
            System.out.println("Second wins!");
    }

    public static void occurrencesOfWords(String message) {
        String[] words = message.split("[ ]");
        for (int i = 0; i < words.length; i++) {
            if(words[i].charAt(words[i].length()-1)=='.')
                words[i]=words[i].substring(0,words[i].length()-1);
        }

        int likeCounter = 0;
        for (int i = 0; i < words.length; i++) {
            if(Objects.equals(words[i],"like"))
                likeCounter++;
        }

        int theCounter = 0;
        for (int i = 0; i < words.length; i++) {
            if(Objects.equals(words[i],"the"))
                theCounter++;
        }

        System.out.println(Arrays.toString(words));
        System.out.println("Like: "+likeCounter+"\nThe: "+theCounter);

    }
}

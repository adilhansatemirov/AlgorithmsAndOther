package ExamPreparation;

import java.util.Objects;

public class ContainsSubstring {
    public static void main(String[] args) {
        System.out.println(containsSubstring("home", "mm"));
    }

    public static int containsSubstring(String text, String substring){
        int index = -1;
        for (int i = 0; i <= text.length() - substring.length(); i++) {
            if(Objects.equals(substring, text.substring(i,i+substring.length()))){
                index = i;
            }
        }
        return index;
    }
}

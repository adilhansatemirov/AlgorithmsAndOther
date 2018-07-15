package MidTerm2;

import java.util.ArrayList;

public class RepeatingWords {
    public static void main(String[] args) {
        String example = "hello my friend hello my life";
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counters = new ArrayList<>();

        String[] allTheWordsArray = example.split(" ");
        for (int i = 0; i < allTheWordsArray.length; i++) {
            if(!words.contains(allTheWordsArray[i])){
                words.add(allTheWordsArray[i]);
                counters.add(1);
            }else if(words.contains(allTheWordsArray[i])){
                int current = counters.get(words.indexOf(allTheWordsArray[i]));
                current++;
                counters.set(words.indexOf(allTheWordsArray[i]),current);
            }
        }
        System.out.println(words);
        System.out.println(counters);
    }
}

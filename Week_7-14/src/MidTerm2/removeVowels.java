package MidTerm2;


import java.util.ArrayList;

public class removeVowels {
    public static void main(String[] args) {
        System.out.println(removeVowels1("combo"));
    }

    public static String removeVowels(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                result+="";
            }else{
                result+=word.charAt(i);
            }
        }//ends for
    return result;
    }
    public static String removeVowels1(String word){
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');
        StringBuilder wordWithoutVow = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))){
                wordWithoutVow.append("");
            }else{
                wordWithoutVow.append(word.charAt(i));
            }
        }
        return wordWithoutVow.toString();
    }

}

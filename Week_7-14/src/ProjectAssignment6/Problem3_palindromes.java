package ProjectAssignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3_palindromes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\words_ru.txt"));
        StringBuilder words_ru_SB = new StringBuilder();
        while(reader.hasNext()){
            words_ru_SB.append(reader.next()).append(" ");
        }
        reader.close();
        String words_ru_String = words_ru_SB.toString();
        String[] words_in_array = words_ru_String.split(" ");
        ArrayList<String> palindromes = new ArrayList<>();

        for (int word = 1; word < words_in_array.length; word++) {
            StringBuilder wordSB = new StringBuilder();
            for (int i = 0; i<words_in_array[word].length(); i++){
                wordSB.append(words_in_array[word].charAt(words_in_array[word].length()-i-1));
                }
            if(wordSB.toString().equals(words_in_array[word])){
                palindromes.add(words_in_array[word]);
            }
        }
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem3_palindromes\\palindromes.txt"));
        for (String palindrome : palindromes) {
            writer.println(palindrome);
        }writer.close();
    }
}

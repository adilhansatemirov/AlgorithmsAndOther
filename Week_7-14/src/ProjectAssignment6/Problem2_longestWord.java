package ProjectAssignment6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2_longestWord {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\words_ru.txt"));
        StringBuilder longestWordFinder = new StringBuilder();
        while (reader.hasNext()){
            longestWordFinder.append(reader.next()).append(" ");                    //collect everything to the StringBuilder
        }
        reader.close();
        String longestWordFinderString = longestWordFinder.toString();
        String[] arrOfWords = longestWordFinderString.split("[\uFEFF ]");     //split words with regular expression " " and
        String longest = arrOfWords[0];                                             //"﻿"(little dash that is counted as a symbol)
                                                                                    //and makes troubles while finding the longest word
        for (int i = 0; i < arrOfWords.length; i++) {
            if(arrOfWords[i].length()>longest.length()){                            //looks for longest word with well-known algorithm
                longest = arrOfWords[i];
            }
        }//ends for
        ArrayList<String> holderOfTheLongestWords = new ArrayList<>();              //in case we have more that one long words
        for (int i = 0; i < arrOfWords.length; i++) {
            if(arrOfWords[i].length()==longest.length())                            //looks for the words with the same length
                holderOfTheLongestWords.add(arrOfWords[i]);                         //as our found one
        }
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem2_longestWord\\output2.txt"));
            for (int i = 0; i < holderOfTheLongestWords.size(); i++) {
                writer.println(holderOfTheLongestWords.get(i));         //prints found longest word(words)
            }
        writer.close();
    }
}

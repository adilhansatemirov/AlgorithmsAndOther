package ProjectAssignment6;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
        I'm sure that you know about this algorithm but anyway I will say a few words about it.

        This algorithm works by mapping every Russian word to a prime number.
        Then using Fundamental Theory of Arithmetic (the product of any prime numbers combination never repeats)
        we multiply every character of the word(calculating individual code of the word)
        and save every code to array.
        After comparing every individual codes of the words we can find anagrams
        if the codes are the same.
*/

public class Problem5_anagrams {

    static int[] primes =   {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137};
    //prime numbers that correspond every letter of Russian alphabet

    public static void main(String[] args) throws FileNotFoundException{
        String[] words_arr = readFileAndSaveResultToArray("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\words_ru.txt");
        ArrayList<Long> keyArrayList = individualKeyOfWords(words_arr);
        ArrayList<String> anagrams = findAnagrams(keyArrayList,words_arr);
//        saveResultInFile(anagrams,"C:\\Users\\Пользователь\\Desktop\\Project 5\\problem5_anagrams\\anagrams.txt");
        printAnagrams(anagrams);
    }

    public static String[] readFileAndSaveResultToArray(String path) throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream(path));
        StringBuilder words_ru_SB = new StringBuilder();
        while (reader.hasNext()){
            words_ru_SB.append(reader.next()).append(" ");
        }
        reader.close();
        String words_ru = words_ru_SB.toString();                                                             //String of our words
        return  words_ru.split("[ ]");
    }
    //reads file and saves every word into array

    public static ArrayList<Long> individualKeyOfWords(String[] arrOfStrings){
        ArrayList<Long> resultOfMultiplication = new ArrayList<>();
        //ArrayList which will hold the values of multiplication primes (size = 34010)

        for (int word = 0; word < arrOfStrings.length; word++) {                                              //reading each word in array
            long productOfLetters = 1;                                                                        //key of the word
            for (int symbol = 0; symbol < arrOfStrings[word].length(); symbol++) {                            //reading each character
                if(arrOfStrings[word].charAt(symbol)>=1072 && arrOfStrings[word].charAt(symbol)<=1077){       //if the character is between 'a' and 'e'
                    productOfLetters *= primes[arrOfStrings[word].charAt(symbol)-1072];                       //multiply the key by the corresponding prime number of a letter
                }else if(arrOfStrings[word].charAt(symbol)==1105){                                            //if the character is 'ё'
                    productOfLetters *= primes[6];                                                            //multiply the key by the corresponding prime number of a letter
                }else if(arrOfStrings[word].charAt(symbol)>1077 && arrOfStrings[word].charAt(symbol)<=1103){  //if the character is from 'ж' to 'я'
                    productOfLetters *= primes[arrOfStrings[word].charAt(symbol)-1071];                       //multiply the key by the corresponding prime number of a letter
                }
            }//ends symbol for
            resultOfMultiplication.add(productOfLetters);
        }//ends word for
        return resultOfMultiplication;
    }
    //finds individual key of every word

    public static ArrayList<String> findAnagrams(ArrayList<Long> keyOfEveryWord, String[] words){
        ArrayList<String> anagrams = new ArrayList<>();
        for (int i = 0; i < keyOfEveryWord.size(); i++) {              //checks every word
            for (int j = 0; j < keyOfEveryWord.size(); j++) {          //for every word
                if(i!=j && keyOfEveryWord.get(i).equals(keyOfEveryWord.get(j))){
              //if the words are not the same BUT the products of multiplication are the same(letters are the same)
                    anagrams.add(words[i]); //add the word that we check
                    anagrams.add(words[j]); //add right after it the word that we found
                }
            }
        }
        return anagrams;
    }
    //finds anagrams comparing the individual keys of the words

    public static void saveResultInFile(ArrayList<String> words, String path) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(new FileOutputStream(path));
        writer.println(" Анаграммы");
        for (int i = 0; i < words.size(); i+=2) {               //checks the pair of the words
            writer.println(words.get(i)+" - "+words.get(i+1));
        }
        writer.close();
    }
    //for saving result to the file

    public static void printAnagrams(ArrayList<String> words){
        for (int i = 0; i < words.size(); i+=2) {               //checks the pair of the words
            System.out.println(words.get(i)+" - "+words.get(i+1));
        }
    }
    //for printing the to the console

}

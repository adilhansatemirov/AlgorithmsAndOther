package ProjectAssignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4_histogram {

    static int[] counters = new int[33];    //creating our static counters

    public static void main(String[] args) throws FileNotFoundException{
        String words_ru = readFileAndReturnText("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\words_ru.txt");
        //save the text of the file in String variable

        String forTesting = "ааабвгдеёёёжзийклмнопрстуфхцчшщъыьэюя";
        //just an String for testing with two 'ё' and 'я'

        countingLetters(words_ru);
        //calling method putting String as an argument

        System.out.println(countPercentage());
        //for printing result on the console

        countAndSaveResultInFile("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\Problem4_histogram\\Percentage.txt");
        //for saving the same result in the file

    }
    public static void countingLetters(String textForCounting){
        for (int i = 0; i < textForCounting.length(); i++) {//reading each character
            if(textForCounting.charAt(i)>=1072 && textForCounting.charAt(i)<=1077){         //if the character is between 'a' and 'e'
                counters[(int)textForCounting.charAt(i)-1072]++;                            //increase counter to 1

            }else if(textForCounting.charAt(i)==1105){                                      //if the character is 'ё'
                counters[6]++;

            }else if(textForCounting.charAt(i)>1077 && textForCounting.charAt(i)<=1103){    //if the character is from 'ж' to 'я'
                counters[(int)textForCounting.charAt(i)-1071]++;
            }
        }//ends for
    }

    public static String readFileAndReturnText(String address) throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream(address));
        StringBuilder words_ru_SB = new StringBuilder();
        while(reader.hasNext()){
            words_ru_SB.append(reader.next());
        }
        reader.close();
        return words_ru_SB.toString();
    }

    /*=====Two separate methods====
        first: to print result on console
        second: to save result to the file

        P.S. I had to make another method for saving result
        because even if some String that we want to save
        has the sign '\n', compiler doesn't see it
        and saves the String to the one long line
    */
    public static String countPercentage(){
        int sum = 0;
        for(int elementsOfArray: counters){         //find sum of the occurrences of each
            sum +=elementsOfArray;
        }
        char[] letters = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т',
                'у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        StringBuilder result = new StringBuilder();  //our result String
        for(int i = 0; i<counters.length; i++){      //foreach
            /*======Formula======
                    sum = 100%
            letterOccur = x%
            x = letterOccur*100/sum
                                    */
            result.append(letters[i]).append(" = ").append(Math.round((double)counters[i]*100.0/(double)sum*100.0)/100.0)
            .append("%").append("\n");
        }//ends for
        return result.toString();
    }

    public static void countAndSaveResultInFile(String address) throws FileNotFoundException {
        int sum = 0;
        for(int elementsOfArray: counters){
            sum +=elementsOfArray;
        }
        char[] letters = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т',
                'у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        PrintWriter writer = new PrintWriter(new FileOutputStream(address));
        writer.println("Percentage of each letter occurrences.");
        writer.println();
        for(int i = 0; i<counters.length; i++){      //foreach
            writer.print(letters[i] + " = " + Math.round((double)counters[i]*100.0/(double)sum*100.0)/100.0 + "%");
            writer.println();
        }//ends for
        writer.close();
    }
}

//Thank you, teacher for giving this kind of exercises.
//It motivates and makes you love programming
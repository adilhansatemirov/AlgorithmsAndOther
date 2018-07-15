package ProjectAssignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem6_grades {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\Problem6_grades\\grades.txt"));
        StringBuilder builder = new StringBuilder();
        while (reader.hasNextLine()){
            builder.append(reader.next()).append(" ");              //read and collect everything to a single String
        }
        reader.close();

        String[] words_ru = builder.toString().split(" ");    //separates everything and collect to an array
        double sum = 0;
        double counterMarks = 0;
        for (int i = 2; i < words_ru.length; i+=3){                 //counts every third element(every double)
            sum+=Double.parseDouble(words_ru[i]);
            counterMarks++;
        }
        double average = Math.round(sum/counterMarks*100.0)/100.0;  //calculating the average
        ArrayList<String> studentsAboveAverage = new ArrayList<>();
        for (int i = 2; i < words_ru.length; i+=3) {                //every mark(double value)
            if(Double.parseDouble(words_ru[i])>average){            //if greater than average
                studentsAboveAverage.add(words_ru[i-2]+" "+words_ru[i-1]);  //add to list corresponding name and surname
            }
        }
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\Problem6_grades\\output6.txt"));
        writer.println(" Students taken over average(73.71)");
        for (String student: studentsAboveAverage) {
            writer.println(student);
        }
        writer.close();
    }
}

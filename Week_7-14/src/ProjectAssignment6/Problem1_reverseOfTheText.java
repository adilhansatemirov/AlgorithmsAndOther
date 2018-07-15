package ProjectAssignment6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1_reverseOfTheText {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader =  new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem1_reverse\\input.txt"));
        ArrayList<String> test = new ArrayList<>(); //arrayList that will hold a words
        while (reader.hasNext()){                   //while there are words
            test.add(reader.next());                //add it to our arrayList
        }
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem1_reverse\\output.txt"));
        for (int i = 0; i < test.size(); i++) {
            writer.print((test.get(test.size()-1-i))+" ");    //prints everything starting from the end
        }
        writer.close();
    }
}
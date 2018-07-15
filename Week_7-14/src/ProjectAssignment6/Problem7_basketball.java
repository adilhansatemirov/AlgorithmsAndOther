package ProjectAssignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem7_basketball {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem7_basketball\\basketball.txt"));
        ArrayList<String> players = new ArrayList<>();
        while (reader.hasNextLine()){
            players.add(reader.next());
        }
        reader.close();
        double maxHeight = Double.parseDouble(players.get(2));
        int indexOfTallestPlayer = 0;
        for (int i = 2; i < players.size(); i+=3){
            if(Double.parseDouble(players.get(i))>maxHeight) {
                maxHeight = Double.parseDouble(players.get(i));
                indexOfTallestPlayer = i-2;
            }
        }
        double minHeight = Double.parseDouble(players.get(2));
        int indexOfShortest = 0;
        for (int i = 2; i < players.size(); i+=3){
            if(Double.parseDouble(players.get(i))<minHeight){
                minHeight = Double.parseDouble(players.get(i));
                indexOfShortest = i-2;
            }
        }
        System.out.println(players.get(indexOfTallestPlayer)+" "+players.get(indexOfTallestPlayer+1)+": "+maxHeight);
        System.out.println(players.get(indexOfShortest)+" "+players.get(indexOfShortest+1)+": "+minHeight);

        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem7_basketball\\output7.txt"));
        writer.println("The tallest player: "+players.get(indexOfTallestPlayer)+" "+players.get(indexOfTallestPlayer+1)+" ("+maxHeight+" sm)");
        writer.println("The shortest player: "+players.get(indexOfShortest)+" "+players.get(indexOfShortest+1)+" ("+minHeight+" sm)");
        writer.close();
    }
}

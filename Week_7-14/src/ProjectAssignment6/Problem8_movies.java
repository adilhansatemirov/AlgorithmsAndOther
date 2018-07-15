package ProjectAssignment6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

//Sorry didn't have time to comment this file

public class Problem8_movies {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem8_movies\\movies.txt"));
        ArrayList<ArrayList> hold2 = new ArrayList<>();
        for (int row = 0; row < 30; row++) {
            ArrayList<String> hold1 = new ArrayList<>();
            String[] actors = reader.nextLine().split(", ");
            hold1.add(actors[0]);
            for (int column = 1; column <actors.length; column++) {
                hold1.add(actors[column]);
            }//ends column for
            hold2.add(hold1);
        }//end row for
        reader.close();
        ArrayList<ArrayList> result2 = new ArrayList<>();
        for (int row = 0; row < 30; row++) {
            for (int col = 1; col < hold2.get(row).size(); col++) {
                ArrayList<String> result1 = new ArrayList<>();
                    result1.add((String)hold2.get(row).get(col));
                for (int row1 = 0; row1 < 30; row1++) {
                    for (int col2 = 1; col2 < hold2.get(row1).size(); col2++) {
                        if(Objects.equals(hold2.get(row).get(col),hold2.get(row1).get(col2))){
                            result1.add((String)hold2.get(row1).get(0));
                        }
                    }
                }
                result2.add(result1);
            }
        }
//        for (int i = 0; i < result2.size(); i++) {
//            for (int j = 0; j < result2.get(i).size(); j++) {
//                if(result2.get(i).equals(result2.get(j))){
//                    result2.remove(result2.get(j));
//                }
//            }
//        }
        Set<ArrayList> noRepetition = new HashSet<>();
        noRepetition.addAll(result2);
        result2.clear();
        result2.addAll(noRepetition);

        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Project Assignment 6\\problem8_movies\\output8.txt"));
        for (int row = 0; row < result2.size(); row++) {
            for (int col = 0; col < result2.get(row).size(); col++) {
                if(col==0){
                    writer.print(result2.get(row).get(col)+": ");
                }else if(col==result2.get(row).size()-1){
                    writer.print(result2.get(row).get(col)+".");
                }else{
                    writer.print(result2.get(row).get(col)+", ");
                }
            }
            writer.println();
        }//ends row for
        writer.close();
    }
}

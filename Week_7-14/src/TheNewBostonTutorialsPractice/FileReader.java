package TheNewBostonTutorialsPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private Scanner reader;
    public void readTheFile() throws FileNotFoundException {
        reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\TheNewBoston\\Names.txt"));
        while(reader.hasNext()){
            String index = reader.next();
            String name = reader.next();
            String surName = reader.next();
            System.out.printf("%s %s %s\n", index, name, surName);

        }//end while
    }//end method
    public void closeTheFile(){
        reader.close();
    }
}

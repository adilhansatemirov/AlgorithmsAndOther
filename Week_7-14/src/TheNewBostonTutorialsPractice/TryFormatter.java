package TheNewBostonTutorialsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

import static java.awt.SystemColor.text;


public class TryFormatter {
    private Formatter justTry;
        public void createFile () {

            try{
                justTry = new Formatter("C:\\Users\\Пользователь\\Desktop\\TheNewBoston\\TryFormatter.txt");
                System.out.println("File created.");
            }
            catch(Exception exc){
                System.out.println("Error! Try again!");
            }
        }

    public void writeSomething(String yourText){
        justTry.format(yourText);

    }
    public void closeTheFile(){
        justTry.close();
    }
}


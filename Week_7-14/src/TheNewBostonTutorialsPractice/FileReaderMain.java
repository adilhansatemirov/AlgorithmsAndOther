package TheNewBostonTutorialsPractice;

import java.io.FileNotFoundException;

public class FileReaderMain {
    public static void main(String[] args)throws FileNotFoundException {
        FileReader newOne = new FileReader();
        newOne.readTheFile();
        newOne.closeTheFile();
    }
}

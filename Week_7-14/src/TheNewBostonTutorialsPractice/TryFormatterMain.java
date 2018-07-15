package TheNewBostonTutorialsPractice;

public class TryFormatterMain {
    public static void main(String[] args) {
        TryFormatter newOne = new TryFormatter();
        newOne.createFile();
        newOne.writeSomething("Don't care!");
        newOne.closeTheFile();
    }
}

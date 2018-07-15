package ProjectAssignment4;

import java.io.FileNotFoundException;

public class CaesCipherMain {
    public static void main(String[] args) throws FileNotFoundException {
        int key = 1;

        //encryption
//        String pt = CaesarCipher.readFileAndSaveResultToArray("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\ProjectAssignment4\\plaintext.txt");
//        String ct = CaesarCipher.encrypt(pt,key);
//        System.out.println(ct);
//        CaesarCipher.writeFile(ct,"C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\ProjectAssignment4\\ciphertext.txt" );
//        System.out.println(pt);

        // decryption
//        String ctt = CaesarCipher.readFileAndSaveResultToArray("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\ProjectAssignment4\\ciphertext.txt");
//        String ptt = CaesarCipher.decrypt(ct, key);
//        CaesarCipher.writeFile(ptt, "C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\ProjectAssignment4\\plaintext.txt");
//        System.out.println(ptt);

        //example
        String example = "Programming is fun! ABC XYZ";
        System.out.println("Initial: "+example);
        String exampleEncrypted = CaesarCipher.encrypt(example, key);
        System.out.println("\nEncrypted: "+exampleEncrypted);
        String exampleDecrypted = CaesarCipher.decrypt(exampleEncrypted,key);
        System.out.println("\nDecrypted: "+exampleDecrypted);
    }
}

package ProjectAssignment4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
    public static String readFile(String path) throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream(path));
        StringBuilder myStrBld = new StringBuilder();
        while(reader.hasNext()){
            myStrBld.append(reader.next()).append(" ");
        }
        return myStrBld.toString();
    }
    public static String encrypt(String pt, int k) {
        if(k>26){       //simplifies the key, if needed
            k=k%26;
        }
    StringBuilder chipLetSb = new StringBuilder();           //so that we have no string concatenation
    for (int letter = 0; letter < pt.length(); letter++){
        if(!(pt.charAt(letter)>96 && pt.charAt(letter)<123) && !(pt.charAt(letter)>64 && pt.charAt(letter)<91)){
            //if the symbol is neither capital english letter nor small, we don't change symbol
            chipLetSb.append(pt.charAt(letter));
        }else if(pt.charAt(letter)>96 && pt.charAt(letter)<123){
            //in case of small letter
            char letNew = (char)(pt.charAt(letter)+k);
            if(letNew>122){
                letNew = (char)(96 + (letNew - 122));
            }
            chipLetSb.append(letNew);
        }else if(pt.charAt(letter)>64 && pt.charAt(letter)<91){
            char letNew = (char)(pt.charAt(letter)+k);
            if(letNew>90){
                letNew = (char)(64 + (letNew - 90));
            }
            chipLetSb.append(letNew);
        }
    }//end for
        return chipLetSb.toString();
    }
    public static String decrypt(String ct, int k) {
        if(k>26){
            k=k%26;
        }
            StringBuilder chipLetSb = new StringBuilder();
        for (int letter = 0; letter < ct.length(); letter++){
            if(!(ct.charAt(letter)>96 && ct.charAt(letter)<123) && !(ct.charAt(letter)>64 && ct.charAt(letter)<91)){
                chipLetSb.append(ct.charAt(letter));
            }else if(ct.charAt(letter)>96 && ct.charAt(letter)<123){
                char letNew = (char)(ct.charAt(letter)-k);
                if(letNew<97){
                    letNew = (char)(123-(97-letNew));
                }
                chipLetSb.append(letNew);
            }else if(ct.charAt(letter)>64 && ct.charAt(letter)<91){
                char letNew = (char)(ct.charAt(letter)-k);
                if(letNew<65){
                    letNew = (char)(91-(65 - letNew));
                }
                chipLetSb.append(letNew);
            }
        }//end for
        return chipLetSb.toString();
    }
    public static void writeFile(String text, String path) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new FileOutputStream(path));
        writer.println(text);
        writer.close();
    }
}

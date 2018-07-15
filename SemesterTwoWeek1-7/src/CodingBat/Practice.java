package CodingBat;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
//        System.out.println(stringYak("yakxxxyak"));
        stringYak("yakxxxyak");
    }
    public boolean stringE(String str) {
        int countE = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e')
                countE++;
        }

        if(countE>=1 && countE<=3) {
            return true;
        }else{
            return false;
        }
    }

    public static String endUp(String str) {
        if(str.length()>=4){
            String end = str.substring(str.length()-3).toUpperCase();
            return str.substring(0,str.length()-3)+end;
        }else{
            return str.toUpperCase();
        }
    }
    public static void stringYak(String str) {
        int counter  = 0;
        for(int i = 0; i<=str.length()-3; i++){
            if(str.substring(i,i+3).equals("yak"))
                counter++;
        }
        System.out.println(counter);
        String result = "";
        if(counter <= 1){
            for(int i = 0; i<=str.length()-3; i++){
                if(str.substring(i,i+3).equals("yak")){
                    result += str.substring(0,i);
                    result += str.substring(i+3);
                }
            }
        }else{
            for(int i = 0; i<=str.length()-3; i++){
                if(str.substring(i,i+3).equals("yak")){
                    result += str.substring(0,i);
                    result += str.substring(i+3);
                    break;
                }
            }
            for(int i = 0; i<=str.length()-3; i++){
                if(str.substring(i,i+3).equals("yak")){
                    result += str.substring(0,i);
                    result += str.substring(i+3);
                }
            }
        }
//        return result;
    }
    public boolean linearIn(int[] outer, int[] inner) { //[1,2,3,4,5] [2,4]
        int counter = 0;
        for(int i = 0; i<outer.length; i++){
            if(inner[counter]==outer[i]){
                counter++;
            }
        }
        return counter==inner.length;
    }
}

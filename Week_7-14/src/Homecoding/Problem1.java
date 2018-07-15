package Homecoding;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(nakon("<<(({{}}))>>","soso"));
    }
    public static String nakon (String out, String word){
        String first ="";
        String last = "";
       for(int i=0; i< out.length();i++){
           if(i< out.length()/2){
               first += out.charAt(i);
           }
           else{
                last += out.charAt(i);
           }
       }
       return first + word + last;
    }
}

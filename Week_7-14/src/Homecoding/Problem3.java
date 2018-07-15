package Homecoding;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(my("Hw"));
    }public static String my (String str){
        if (str.length() <= 2){
            return str;
        }
        String fin = ""+str.charAt(0)+str.charAt(1);
        return fin;
    }
}

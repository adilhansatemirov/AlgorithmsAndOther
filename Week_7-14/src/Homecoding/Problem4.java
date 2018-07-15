package Homecoding;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(my("WooHo"));
    }public static String my (String str){
        if(str.length()%2==0){
            return str.substring(0,str.length()/2);
        }
        return "Invalid input";
    }
}

package CodingBat;

import java.util.Map;
import java.util.Objects;

public class Practice {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }
    public static String missingChar(String str, int n){
        String front = str.substring(0,n);
        String end = str.substring(n+1,str.length());
        return front+end;
    }
    public static String exchange(String str){
        if(str.length()<=1){
            return str;
        }
        String mid = str.substring(1,str.length()-1);
        return str.charAt(str.length()-1)+mid+str.charAt(0);
    }
    public static String front3(String str) {
        if(str.length()<=3){
            return str+str+str;
        }
        String toReturn = str.substring(0,3);
        return toReturn+toReturn+toReturn;
    }
    public static String backAround(String str) {
        if(str.length()==1){
            return str+str+str;
        }
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }
    public static boolean startHi(String str) {
        if(str.length()<=1){
            return false;
        }else{
            return Objects.equals(str.substring(0,2),"hi");
        }
    }
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.remove("ice cream");
            map.put("ice cream","cherry");
        }
        map.put("bread", "butter");
        return map;
    }

}

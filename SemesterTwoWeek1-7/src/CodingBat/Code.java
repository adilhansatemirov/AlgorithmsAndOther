package CodingBat;

import java.util.ArrayList;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

    }
    public static void taxi(String input){
        Scanner in = new Scanner(input);
        ArrayList<Integer> groups = new ArrayList<>();
        while (in.hasNextInt()){
            groups.add(in.nextInt());
        }
        int taxies = 0;

        int need1more = 0;
        int couples = 0;
        int lonelyes = 0;
        ArrayList<Integer> taxis = new ArrayList<>();
        for (int i = 1; i < groups.size(); i++) {
            if(groups.get(i)==4){
                taxies++;
                groups.remove(i);
            }
            if(groups.get(i)==3){
                need1more++;
                groups.remove(i);
            }
            if(groups.get(i)==2){
                couples++;
                groups.remove(i);
            }
            if(groups.get(i)==1) {
                lonelyes++;
                groups.remove(i);
            }
        }
        taxies+=Math.min(need1more,lonelyes);
        need1more-=Math.min(need1more,lonelyes);
        lonelyes-=Math.min(need1more,lonelyes);

    }
}

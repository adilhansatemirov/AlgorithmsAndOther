package Week13;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();    //we create ArrayLists
        arr1.add(1);                                    //then add some elements
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        ArrayList<Integer> arr2 = new ArrayList<>();    //do it once again
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        MySet set1 = new MySet(arr1);
        MySet set2 = new MySet(arr2);


        System.out.println("===Equals method===");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2)+"\n"+"\n");


        System.out.println("===Subset===");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.subset(set2)+"\n"+"\n");  //prints whether "set1" is subset of "set2"


        System.out.println("===Clear method===");
        System.out.println("Initial: "+set2);
        set1.clear();
        System.out.println("Cleared: "+set1);
    }
}

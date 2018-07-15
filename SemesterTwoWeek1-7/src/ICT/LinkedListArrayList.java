package ICT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayList {
    static LinkedList<Integer> linkedList = new LinkedList<>();
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
//*************WORKING WITH LINKED LIST*************************************************************
//        fillLinkedWithElements(10);
//        fillLinkedWithElements(1000);
        fillLinkedWithElements(1000000);

//        System.out.println("Merging number in the center of LinkedList");
//        mergeInCenterLinked();

        System.out.println("Sorting LinkedList");
        sortLinkedPrintResult();

//        System.out.println("Deleting element from the beginning of LinkedList");
//        deleteElementFromBeginningLinked();

//        System.out.println("Deleting element from the end of LinkedList");
//        deleteElementFromEndLinked();

//**************WORKING WITH ARRAY LIST*************************************************************
//        fillArrayWithElements(10);
//        fillArrayWithElements(1000);
        fillArrayWithElements(10000000);

//        System.out.println("Merging number in the center of ArrayList");
//        mergeInCenterArray();

        System.out.println("Sorting ArrayList");
        sortArrayPrintResult();

//        System.out.println("Deleting element from the beginning of ArrayList");
//        deleteElementFromBeginningArray();

//        System.out.println("Deleting element from the end of ArrayList");
//        deleteElementFromEndArray();
    }
    public static void fillLinkedWithElements(int numberOfElements){
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add((int)(Math.random()*100));
        }
    }
    public static void fillArrayWithElements(int numberOfElements){
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add((int)(Math.random()*100));
        }
    }

    public static void sortLinkedPrintResult(){
        long time = System.nanoTime();
        Collections.sort(linkedList);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to sort LinkedList");
    }

    public static void sortArrayPrintResult(){
        long time = System.nanoTime();
        Collections.sort(arrayList);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to sort ArrayList");
    }

    public static void mergeInCenterArray(){
        long time = System.nanoTime();
        arrayList.add(arrayList.size()/2,99);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to insert an number into ArrayList");
    }
    public static void mergeInCenterLinked(){
        long time = System.nanoTime();
        linkedList.add(linkedList.size()/2,99);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to insert an number into LinkedList");
    }
    public static void deleteElementFromBeginningLinked(){
        long time = System.nanoTime();
        linkedList.remove(2);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to delete an element from the beginning of a LinkedList");
    }
    public static void deleteElementFromEndLinked(){
        long time = System.nanoTime();
        linkedList.remove(linkedList.size()-1);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to delete an element from the end of a LinkedList");
    }
    public static void deleteElementFromBeginningArray(){
        long time = System.nanoTime();
        linkedList.remove(1);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to delete an element from the beginning of a ArrayList");
    }
    public static void deleteElementFromEndArray(){
        long time = System.nanoTime();
        linkedList.add(arrayList.size()-2);
        long elapsed = System.nanoTime()-time;
        System.out.println(elapsed+" nanoseconds passed, "+elapsed/1000000000+" seconds passed to delete an element from the end of a ArrayList");
    }
}


package DerekBanasJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("John Smith");
        arrayListOne.add("Artur McGregor");
        arrayListOne.add("Aaron James");

        arrayListOne.add(2, "Jack Brian");    //to 2 place put Jack Brian
        arrayListOne.set(0,"Professor McGonadal");         //remove item with index zero and put there Professor
        arrayListOne.remove(3);                      //just remove item with index 3

        for (String anArrayListOne : arrayListOne) {      //go through all the values in arrayList
            System.out.println(anArrayListOne);           //and print them out
        }
        System.out.println("//for loop prints every element\n");

        System.out.println(arrayListOne);
        System.out.println("//sout prints the arrayList in the array view\n");

        Iterator individItems = arrayListOne.iterator();  //перебиратель of values
        while(individItems.hasNext()){                    //пока есть что перебирать
            System.out.println(individItems.next());      //print the next element
        }
        System.out.println("//iterator prints\n");

        ArrayList nameCopy = new ArrayList();           //new arrayList (don't have to declare a String)
        nameCopy.addAll(arrayListOne);                  //add all the elements from arrayListOne
        System.out.println(nameCopy);                   //print it
        System.out.println("//name copy(sout prints)\n");

        String paul = "Paul Young";
        nameCopy.add(paul);             //add paul to the end
        System.out.println(nameCopy);   //print it
//        nameCopy.remove( "Paul Young");
        if(nameCopy.contains(paul))
            System.out.println("Paul is here.\n");

        Object[] moreNames = new Object[arrayListOne.size()];   //create a regular array of Strings
        moreNames = arrayListOne.toArray();                     //assign it as arrayListOne converted to Array (typecast it to String array)
        System.out.println(Arrays.toString(moreNames)+"\n//Converted to array arrayListOne");
    }
}

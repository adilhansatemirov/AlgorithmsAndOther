package Week13;

import java.util.ArrayList;
import java.util.Objects;


public class MySet {
    private ArrayList<Integer> numbers = new ArrayList<>();

    MySet(ArrayList<Integer> arrayList){
        numbers = arrayList;
    }


    public void clear(){
        numbers = new ArrayList<>(0);

    }
    public boolean equals(MySet other){
        boolean equal = true;
        if(numbers.size()!=other.numbers.size()){        //checks if the number of elements in 2 arrayLists are equal
        equal=false;                                     //if not they are definitely not equal
        }else{                                                              //if they have the same number of elements
            for (int i = 0; i < numbers.size(); i++) {                      //goes through all the numbers
                if(!Objects.equals(numbers.get(i), other.numbers.get(i))){  //even if one of them is not equal to it corresponding element
                    equal = false;                                          //sets the "equal" to false
                    break;                                                  //and breaks the loop
                }
            }
        }
        return equal;
    }
    public boolean subset(MySet isItASubset){
        boolean subset = false;
        if(isItASubset.numbers.containsAll(numbers)){       //if a
            subset = true;
        }
        return subset;
    }
    public String toString(){
        return numbers.toString();
    }
}

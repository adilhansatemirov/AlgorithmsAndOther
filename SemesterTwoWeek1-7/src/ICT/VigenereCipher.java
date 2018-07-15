package ICT;

import java.util.ArrayList;
import java.util.HashMap;

public class VigenereCipher{

    static HashMap<Character,Integer> mapOfLettersAndValues= new HashMap<>();
    static char[] letters = {'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args) {
        fillTheMap();
        encrypt("The territory of Kazakhstan was inhabited by nomadic tribes!","passkey");

    }
    public static void encrypt(String inputText, String keyWord){
        //changing the case of elements
        inputText = inputText.toUpperCase();
        keyWord = keyWord.toUpperCase();

        //looking for the symbols(spaces, commas)
        ArrayList<Integer> indexesOfSymbols = new ArrayList<>(); //indexes of them
        ArrayList<Character> symbols = new ArrayList<>();        //actual symbols

        for (int symbol = 0; symbol < inputText.length(); symbol++) {
            if(!(inputText.charAt(symbol)>=65 && inputText.charAt(symbol)<=90)){

                indexesOfSymbols.add(symbol);
                symbols.add(inputText.charAt(symbol));
            }
        }

        //keyword that is written so that it corresponds the inputText (hello - keyke)
        StringBuilder keyWordRespectToInput = new StringBuilder();
        //we need counter, so that we can correspond every letter from keyword with input text
        //when counter reaches the length of the keyword
        int counter = 0;
        for (int i = 0; i < inputText.length(); i++) {
            //go through the text
            if(inputText.charAt(i)>=65 && inputText.charAt(i)<=90) {
                //recognize the letters
                keyWordRespectToInput.append(keyWord.charAt(counter));
                //adapt the keyword to the input
                counter++;
                if(counter==keyWord.length()){
                    //we assign it to zero, so that keyword repeats
                    counter=0;
                }
            }else{
                //if it is not letter we add that symbol
                keyWordRespectToInput.append(inputText.charAt(i));
            }
        }

        String keyWordRespectInputString = keyWordRespectToInput.toString();

        //arrayList to store the ciphered message in terms of numbers
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < inputText.length(); i++) {
            if(inputText.charAt(i)>=65 && inputText.charAt(i)<=90) {
                //actual ciphering. adding numbers that correspond the letters
                resultArray.add(mapOfLettersAndValues.get(inputText.charAt(i))
                        + mapOfLettersAndValues.get(keyWordRespectInputString.charAt(i)));
            }
        }

        for (int i = 0; i < resultArray.size(); i++) {
            //mod 26 for elements that are larger than 26
            if(resultArray.get(i)>25){
                resultArray.set(i,resultArray.get(i)%26);
            }
        }

        //string of ciphered letters
        StringBuilder resultNoSymbols = new StringBuilder();
        for (int i = 0; i < resultArray.size(); i++) {
            //take the current element out of the array that holds ciphered text in terms of numbers (0-A,1-B)
            resultNoSymbols.append(letters[resultArray.get(i)]);
        }
        StringBuilder result = new StringBuilder();
        int counterText = 0;
        int counterSymbols = 0;
        //combining the letters and symbols(spaces, commas)
        for (int i = 0; i < inputText.length(); i++) {
            if(inputText.charAt(i)>=65 && inputText.charAt(i)<=90){
                result.append(resultNoSymbols.charAt(counterText));
                counterText++;
            }else{
                result.append(symbols.get(counterSymbols));
                counterSymbols++;
            }
        }
        System.out.println(result);
    }
    public static void fillTheMap(){
        mapOfLettersAndValues.put('A',0);
        mapOfLettersAndValues.put('B',1);
        mapOfLettersAndValues.put('C',2);
        mapOfLettersAndValues.put('D',3);
        mapOfLettersAndValues.put('E',4);
        mapOfLettersAndValues.put('F',5);
        mapOfLettersAndValues.put('G',6);
        mapOfLettersAndValues.put('H',7);
        mapOfLettersAndValues.put('I',8);
        mapOfLettersAndValues.put('J',9);
        mapOfLettersAndValues.put('K',10);
        mapOfLettersAndValues.put('L',11);
        mapOfLettersAndValues.put('M',12);
        mapOfLettersAndValues.put('N',13);
        mapOfLettersAndValues.put('O',14);
        mapOfLettersAndValues.put('P',15);
        mapOfLettersAndValues.put('Q',16);
        mapOfLettersAndValues.put('R',17);
        mapOfLettersAndValues.put('S',18);
        mapOfLettersAndValues.put('T',19);
        mapOfLettersAndValues.put('U',20);
        mapOfLettersAndValues.put('V',21);
        mapOfLettersAndValues.put('W',22);
        mapOfLettersAndValues.put('X',23);
        mapOfLettersAndValues.put('Y',24);
        mapOfLettersAndValues.put('Z',25);
    }
}

package ExamPreparation;

import java.util.*;

public class QuestionBank {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        time();
    }
    //<< 3 >>
    public static void PEMDAS(){ //parenthesis exponential multiplication division addition subtraction
        double testPEMDAS = Math.pow((2+1),2)/3+10;
        System.out.println(testPEMDAS);
    }
    //<< 5 >>
    public static void areaOfTriangle(){
        System.out.println("Enter a height: ");
        int height = in.nextInt();
        System.out.println("Enter a base: ");
        int base = in.nextInt();
        System.out.println("Area is: "+0.5*height*base);
    }
    //<< 6 >>
    public static void average(){
        System.out.println("Enter five numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();

        System.out.println("Average: "+(num1+num2+num3+num4+num5)/5);
    }
    //<< 7 >>
    public static void failedOrNot(){
        System.out.println("Hello, enter your name, please: ");
        String name = in.nextLine();
        System.out.println("Alright, "+name+". Enter the number of points that you got: " );
        int points = in.nextInt();
        if(points>=50){
            System.out.println("You passed, congratulations!");
        }else{
            System.out.println("I'm sorry, but you failed.");
        }
    }
    //<< 8 >>
    public static void pyramid(){
        System.out.println("   *   \n  * *  \n *   * \n*     *");
    }
    //<< 9 >>
    public static void areaAndCircumference(){
        System.out.println("Enter the radius.");
        int radius = in.nextInt();
        double area = Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius;
        System.out.println("The area is: "+area);
        System.out.println("The circumference is: "+circumference);
    }
    //<< 10 >>
    public static void hasSquareRoot(){
        System.out.println("Enter a number: ");
        double num = in.nextDouble();
        if(Math.sqrt(num)%1==0){
            System.out.println("Yes. Number "+num+" has a square root and equals: "+Math.sqrt(num));
        }else{
            System.out.println("No. This number has no rational square root.");
        }
    }
    //<< 11 >>
    public static void pythagoreanNumbers(){
        System.out.println("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1*num1+num2*num2==num3*num3){
            System.out.println("Yes numbers: "+num1+", "+num2+", "+num3+ " are Pythagorean numbers.");
        }else{
            System.out.println("No. These are not Pythagorean numbers.");
        }
    }
    //<< 12 >>
    public static void trueOrFalse(){
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if(number1>=number2){
            System.out.println("You are clever!");
        }else{
            System.out.println("Try hard.");
        }
    }
    //<< 13 >>
    public static void evenOrOdd(){
        System.out.println("Enter '-1' to exit.");
        while (true){
            System.out.println("Enter number: ");
            int num = in.nextInt();
            if(num==-1){
                System.out.println("Bye.");
                break;
            }
            if (num % 2 == 0) {
                System.out.println("Number " + num + " is even.");
            } else {
                System.out.println("Number " + num + " is odd.");
            }
        }
    }
    //<< 14 >>
    public static void theGreatestNumber(){
        System.out.println("Enter three numbers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(in.nextInt());
        }
        int theGreatestNumber = numbers.get(0);
        for (int i = 1; i < 3; i++) {
            if(theGreatestNumber<numbers.get(i)){
                theGreatestNumber=numbers.get(i);
            }
        }
        System.out.println("The greatest number from these three is: "+theGreatestNumber);
    }
    //<< 15 >>
    public static void squareDraw(){
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {       //square
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {       //triangle1
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {       //triangle2
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j > 0; j--){       //triangle3
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j > 0; j--){       //triangle4
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        int counter = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = n-1; j > i; j--){
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= counter; j++) {
//                System.out.print("*");
//            }
//            counter+=2;
//            for (int j = n-1; j > i; j--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n ; i++) {
            for (int t = 0; t < n-i; t++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //<< 18 >>
    public static void fibonacciFor(){
        long num1 = 0;
        long num2 = 1;
        long num3;
        for (int i = 0; i < 150; i++) {
            num3 = num1+num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }
    public static void fibonacciWhile(){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int till = 100;
        while (num3<till){
            num3 = num1+num2;
            if(num3>till)
                break;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }

    public static int fibonacciRecursion(int n){
        if(n==2){
            return 1;
        }else if(n==1){
            return 1;
        }else{
            return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
        }
    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    //<< 21 >>
    public static void multiplicationTable(){
        int num = in.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    //<< 22 >>
    public static void swapValues(){
        int num1 = 5;
        int num2 = 10;
        System.out.println("first number: "+num1+"\nsecond number: "+num2+"\n");

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("first number: "+num1+"\nsecond number: "+num2);
    }
    //<< 27 >>
    public static void algebra(){
        double sin0 = Math.sin(0);
        double cos0 = Math.cos(0);
        System.out.println("Sin of 0: "+sin0);
        System.out.println("Cos of 0: "+cos0);
    }
    //<< 28 >>
    public static void time(){
        System.out.println("Input number of seconds: ");
        int seconds = in.nextInt();
        int minutes = 0;
        int hours = 0;

        if(seconds>=60){
            minutes+=seconds/60;  // minutes = minutes+seconds/60
            seconds%=60;
        }
        if(minutes>=60){
            hours+=minutes/60;
            minutes%=60;
        }
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    //<< 29 >>
    public static void from_Cel_to_Fah(){
        System.out.println("Enter degrees in Celsius: ");
        double CelFag = in.nextDouble();
        System.out.println(9.0/5.0 * CelFag + 32);
    }
    public static void from_Fah_to_Cel(){
        System.out.println("Enter degrees in Fahrenheit: ");
        double FahCel = in.nextDouble();
        System.out.println(5.0 / 9.0 * (FahCel - 32));
    }
    //<< 30 >>
    public static void getCharacter() {
        System.out.println("Enter an index of character that you want to get: ");
        int characterToGet = in.nextInt();
        String text = "Keep the blue flag flying high.";
        System.out.println("Character of index "+characterToGet+" is "+"'"+text.charAt(characterToGet)+"'");
    }
    //<< 31 >>
    public static void equalStrings(){
        System.out.println("Enter two words that you want to compare: ");
        String firstOne = in.nextLine();
        String secondOne = in.nextLine();

        if(firstOne.length()!=secondOne.length()){
            System.out.println("Words are not the same.");
        }else{
            boolean equal = true;
            for (int i = 0; i < firstOne.length(); i++) {
                if(firstOne.charAt(i)!=secondOne.charAt(i)){
                    equal=false;
                    break;
                }
            }
            if(equal)
                System.out.println("Words are the same.");
            else
                System.out.println("Words are not the same.");
        }
    }
    //<< 32 >>
    public static void factorialCalculator(){
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        int factorial = 1;
        while(number>0){
            factorial*=number--;
        }
        System.out.println(factorial);
    }
    //<< 33 >>
    public static void cozaLozaWoza(){
        for (int i = 1; i < 130; i++) {
            if(i%3==0 && i%5==0 && i%7==0){
                System.out.print("CozaLozaWoza ");
            }else if(i%3==0 && i%5==0){
                System.out.print("CozaLoza ");
            }else if(i%5==0 && i%7==0){
                System.out.print("LozaWoza ");
            }else if(i%3==0 && i%7==0){
                System.out.print("CozaWoza ");
            }else if(i%3==0){
                System.out.print("Coza ");
            }else if(i%5==0){
                System.out.print("Loza ");
            }else if(i%7==0){
                System.out.print("Woza ");
            }else{
                System.out.print(i+" ");
            }

            if(i%11==0){
                System.out.println();
            }
        }//ends for
    }
    //<< 34 >>
    public static void nameSurname() {
        char[] nameAndSurname = {'a','d','i','l','k','h','a','n','s','a','t','e','m','i','r','o','v'};

        System.out.print("Name: ");
        for (int i = 0; i <= 7; i++) {
            System.out.print(nameAndSurname[i]);
        }
        System.out.println();
        System.out.print("Surname: ");
        for (int i = 8; i < nameAndSurname.length; i++) {
            System.out.print(nameAndSurname[i]);
        }
    }
    //<< 35 >>
    public static void password(){
        System.out.println("Enter password: ");
        String password = in.nextLine();
        int countCapLetters = 0;
        int countSmallLetters = 0;
        int countSymbols = 0;
        int countNumbers = 0;

        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>=65 && password.charAt(i)<=90)
                countCapLetters++;
            else if(password.charAt(i)>=97 && password.charAt(i)<=122)
                countSmallLetters++;
            else if(password.charAt(i)>=48 && password.charAt(i)<=57)
                countNumbers++;
            else
                countSymbols++;
        }
//        System.out.println("Capital letters: "+countCapLetters);
//        System.out.println("Small letters: "+countSmallLetters);
//        System.out.println("Numbers: "+countNumbers);
//        System.out.println("Symbols: "+countSymbols);
        if(countCapLetters==0){
            System.out.println("Password should contain at least one capital letter, small letter, number and symbol.");
            password();
        }else if(countSmallLetters==0) {
            System.out.println("Password should contain at least one capital letter, small letter, number and symbol.");
            password();
        }else if(countNumbers==0) {
            System.out.println("Password should contain at least one capital letter, small letter, number and symbol");
            password();
        }else if(countSymbols==0) {
            System.out.println("Password should contain at least one capital letter, small letter, number and symbol");
            password();
        }else
            System.out.println("Password accepted.");
    }
    //<< 36 >>
    public static void createPassword(){
        int[] numbers = new int[2];
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*10);
            password.append(numbers[i]);
        }
        char[] smallLetters = new char[6];
        for (int i = 0; i < smallLetters.length; i++){
            smallLetters[i]=(char)((int)((Math.random()*(122-96))+97));
            password.append(smallLetters[i]);
        }
        char[] capitalLetters = new char[3];
        for (int i = 0; i < capitalLetters.length; i++){
            capitalLetters[i]=(char)((int)((Math.random()*(90-64))+65));
            password.append(capitalLetters[i]);
        }
        char[] symbols = new char[1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i]=(char)((int)((Math.random()*(47-32))+33));
            password.append(symbols[i]);
        }
        System.out.println(password.toString());
    }
    //<< 37 >>
    public static void countVowels(){
        String words = in.nextLine();
        int counter = 0;
        for (int i = 0; i < words.length(); i++) {
            if(words.charAt(i)=='a' || words.charAt(i)=='e' || words.charAt(i)=='u' || words.charAt(i)=='o' || words.charAt(i)=='i'){
                counter++;
            }
        }
        System.out.println("Words contains "+counter+" vowels.");
    }
    //<< 38 >>
    public static void palindromes(){
        StringBuilder wordForPalindrome = new StringBuilder();
        String word = in.nextLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            wordForPalindrome.append(word.charAt(word.length()-1-i));
        }
        if(Objects.equals(word, wordForPalindrome.toString())){
            System.out.println("Word "+word+" is a palindrome.");
        }else{
            System.out.println("Words "+word+" is not a palindrome.");
        }

    }
    //<< 39 >>
    public static void numberOfWords(){
        System.out.println("Enter a text: ");
        String textRead = in.nextLine();
        String text = textRead.toLowerCase();
        String[] arrOfWords = text.split(" ");
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counters = new ArrayList<>();

        for (int i = 0; i < arrOfWords.length; i++) {
            if(!words.contains(arrOfWords[i])){
                words.add(arrOfWords[i]);
                counters.add(1);
            }else{
                int temp = counters.get(words.indexOf(arrOfWords[i]));
                temp++;
                counters.set(words.indexOf(arrOfWords[i]),temp);
            }
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i)+": "+counters.get(i)+"\n");
        }
    }

    public static void messages() {

    }

}

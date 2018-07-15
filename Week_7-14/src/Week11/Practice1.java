package Week11;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Practice1 {
    public static void main(String[] args) throws FileNotFoundException {
        problem1();  //works well
//        problem2();  //works well
//        problem3();  //works well
//        problem4();  //works well
//        problem5();  //works well
//        problem6();  //works well
//        problem7();  //works well
//        problem8(2,10,20); //works well
//        problem9(11); //works well
    }
    public static void problem1() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\input.txt"));
        int sum = 0;
        while (reader.hasNextInt()) {
//            int num = reader.nextInt();
//            sum += num;
            sum += reader.nextInt();
        }
        reader.close();
        System.out.println(sum);
    }

    public static void problem2() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\input1.txt"));
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }
        reader.close();
        System.out.println(Arrays.toString(array));
    }

    public static void problem3() throws FileNotFoundException {
        Scanner reader1 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vector1.txt"));
        Scanner reader2 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vector2.txt"));
        int[] array1 = new int[10];
        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            array1[i]= reader1.nextInt();
            sum1 += array1[i];              //259
        }
        reader1.close();
//        System.out.println(sum1);
//        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[10];
        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            array2[i]=reader2.nextInt();
            sum2 += array2[i];              //425
        }
        reader2.close();
        System.out.println(sum1+sum2);
//        System.out.println(sum2);
//        System.out.println(Arrays.toString(array2));
    }

    public static void problem4() throws FileNotFoundException{
        Scanner reader1 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vecDouble1.txt"));
        Scanner reader2 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vecDouble2.txt"));
        double[] vecArr1 = new double[10];
        for (int i = 0; i < 10; i++) {
            vecArr1[i]=reader1.nextDouble();
        }reader1.close();
        System.out.println(Arrays.toString(vecArr1));
        double[] vecArr2 = new double[10];
        for (int i = 0; i < 10; i++) {
            vecArr2[i]=reader2.nextDouble();
        }reader2.close();
        System.out.println(Arrays.toString(vecArr2));
    }

    public static void problem5() throws FileNotFoundException {
        Scanner reader1 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vecDouble1.txt"));
        Scanner reader2 = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\vecDouble2.txt"));
        double[] vecArr1 = new double[10];
        for (int i = 0; i < 10; i++) {
            vecArr1[i]=reader1.nextDouble();
        }reader1.close();
        double[] vecArr2 = new double[10];
        for (int i = 0; i < 10; i++) {
            vecArr2[i]=reader2.nextDouble();
        }reader2.close();
        double result = 0;
        for (int i = 0; i < 10; i++) {
            result+=vecArr1[i]*vecArr2[i];
        }
//        System.out.println(result);
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\output.txt"));
        writer.println(result);
        writer.println("I can't believe it works!");
        writer.println("//Calculations was tested via actual calculator.");
        writer.close();
    }

    public static void problem6() throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\contains10.txt"));
        int counter = 0;
        List<Integer>list1=new ArrayList<>();
        while(reader.hasNextInt()) {
            list1.add(reader.nextInt());
        }
//        while(reader.hasNextInt()){
//            if(reader.nextInt()==10){
//                counter++;
//            }
//        }
        int[]fileArr = list1.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < fileArr.length; i++) {
            if(fileArr[i]==10)
                counter++;
        }
        reader.close();
        System.out.println(Arrays.toString(fileArr));
        System.out.println("Number '10' repeats is file "+counter + " times.");
    }

    public static void problem7() throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\WordBuff.txt"));
        int counter = 0;
        while(reader.hasNext()){
            String element = reader.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < element.length(); i++) {
                result.append(element.charAt(element.length()-i-1));
            }
            if(element.equals(result.toString())) {
                System.out.print(element + " ");
                counter++;
            }
        }//end while
        System.out.println("\n"+"Amount of palindromes in the text file: "+counter);
        reader.close();
    }

    public static void problem8(int n, int from, int to) throws FileNotFoundException{
        Random rand = new Random();
        int randNumbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            randNumbers[i] = rand.nextInt(to - from + 1) + from;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < randNumbers.length; i++) {
           result.append(randNumbers[i]).append(" ");
        }
        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\problem8.txt"));
        writer.println(result.toString());
        writer.close();
    }

    public static void problem9(int yourNumber)throws FileNotFoundException{
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\problem8.txt"));
        boolean itIs = false;
        while(reader.hasNextInt()){
            int number = reader.nextInt();
            if(number==yourNumber){
                itIs = true;
            }
        }
        if(itIs){
            System.out.printf("Number %d is in file\n",yourNumber);
        }else{
            System.out.printf("Number %d is not in file\n",yourNumber);
        }
        reader.close();
    }
    public static void problem10() throws FileNotFoundException{
//        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\problem10.txt"));
//        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\PracticeTasks\\problem10.txt"));
        int number=0;
        while(number<9){
            number=1;
            String numberStr;
            switch(number) {
                case 1:
                    numberStr = "one";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 2:
                    numberStr = "two";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 3:
                    numberStr = "three";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 4:
                    numberStr = "four";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 5:
                    numberStr = "five";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 6:
                    numberStr = "six";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 7:
                    numberStr = "seven";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 8:
                    numberStr = "eight";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 9:
                    numberStr = "nine";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
                case 0:
                    numberStr = "zero";
                    System.out.print(number+" "+numberStr+"\n");
                    break;
            }
            number++;
        }
    }
}

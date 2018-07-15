package ExamPreparation;
//Importing needed classes for the program
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class NotUnderstoodCode {
    public static void main(String[] args) {
        //Needed variables
        double[] class_gpas; //Array which holds class GPAs
        int students_no=0;

        //Code to get students numbers
        Scanner getValue= new Scanner(System.in);

        //Check point ensures that user enters the right parameter value
        while(students_no==0){
            System.out.print("Enter the number of students in the class:");
            students_no=getValue.nextInt();

            if(students_no<0 || students_no==0){
                students_no=0;
                continue;
            }
        }

        //System.out.println("No of students:"+students_no);

        //initialize the class in order to get gpas
        class_gpas = new double[students_no];
        int index=0, max_limit=4, min_limit=0; //setting the gpa limits
        //Creating an instance of random class,
        //where the process is called instatiation
        Random rndGen = new Random();

        //Randomly generate GPA values and store them inside array
        do{
            //get value between 0.0 - 4.0
            class_gpas[index]=(max_limit-min_limit)*rndGen.nextDouble();
            index++;
        } while(index <= class_gpas.length-1);

        //Display array contents and provide option (1>-sort array, 0<=not sort array)
        System.out.print("Do you want to sort array yes-1/no-0:");
        displayClassGPAContents(class_gpas, getValue.nextInt());
        //Claculate average, std (population), min and max
        displayClassStatistics(class_gpas);
    }

    public static void displayClassStatistics(double[] gpas){
        double total_sum_gpas=0;
        for(int counter=0; counter<gpas.length; counter++){
            total_sum_gpas=total_sum_gpas+gpas[counter];
        }

        double gpa_mean=total_sum_gpas/gpas.length;
        System.out.println("=== CLASS X GPA STATISTICS ===");
        System.out.println("Class X average is:"+(gpa_mean));

        //Calculate STDP=Sqrt((pow(sum(value-mean),2))/N)
        double pow_sum_gpas=0;
        for(int counter=0; counter<gpas.length; counter++){
            pow_sum_gpas=pow_sum_gpas+Math.pow((gpas[counter]-gpa_mean),2);
        }

        //calculating population standard deviation of the gpas for the class
        double gpas_std=Math.sqrt(pow_sum_gpas/gpas.length);
        System.out.println("Class X STDP is:"+(gpas_std));
        System.out.println("Ration of STDP/Mean is:"+(gpas_std/gpa_mean));

        //System.out.println("Modulo power:"+Math.pow(4, 2));

        System.out.println("=== CLASS PERFORMANCE ===");
        if(gpa_mean>=0 && gpa_mean<1.88)
            System.out.println("Class X performance is VERY LOW");
        else if(gpa_mean>=1.88 && gpa_mean<2.32)
            System.out.println("Class X performance is LOW");
        else if(gpa_mean>=2.32 && gpa_mean<2.88)
            System.out.println("Class X performance is NORMAL");
        else if(gpa_mean>=2.88 && gpa_mean<3.25)
            System.out.println("Class X performance is GOOD");
        else
            System.out.println("Class X performance is PERFECT");

        //Getting the maximum gpa value from the array
        int counter=1;
        double max_gpa=gpas[0];
        while(counter<gpas.length){
            //check and substitude
            if(max_gpa<gpas[counter]){
                max_gpa=gpas[counter];
            }
            counter++;
        }

        //Getting the minimum gpa value from the array
        counter=1;
        double min_gpa=gpas[0];
        while(counter<gpas.length){
            //check and substitute
            if(min_gpa>gpas[counter]){
                min_gpa=gpas[counter];
            }
            counter++;
        }

        System.out.println("Class X, max gpa value : "+max_gpa);
        System.out.println("Class X, min gpa value : "+min_gpa);
    }

    public static void displayClassGPAContents(double[] gpas, int option){
        //In order to sort the gpa array in ascending order-small to big
        if(option>=1)
            Arrays.sort(gpas); //=>gpas=Arrays.sort(gpas)

        System.out.println("\n=== CLASS X GPA List ===");
        for(int counter=0; counter<gpas.length; counter++){
            System.out.println((counter+1)+" student gpa is:"+gpas[counter]);
        }
    }
}
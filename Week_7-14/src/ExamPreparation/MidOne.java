package ExamPreparation;

import java.util.Random;

public class MidOne {
    public static void main(String[] args) {
        int my_arr[] = new int[997];
        prime(my_arr);
    }

    public static int num_of_even_101_210(int x[]) {
        Random rand = new Random();
        int counter = 0;
        for (int i = 0; i < 997; i++) {
            x[i] = rand.nextInt(529) + 29;
            if (x[i] % 2 == 0 && x[i] >= 101 && x[i] <= 210) {
                counter++;
            }
        }
        return counter;
    }

    public static void num_divid_9() {
        Random rand = new Random();
        int my_arr[] = new int[997];
        for (int i = 0; i < 997; i++) {
            my_arr[i] = rand.nextInt(559) + 29;
            if (my_arr[i] % 9 == 0) {
                System.out.println(my_arr[i]);
            }
        }
    }
    public static void sum_of_even_odd(){
        Random rand = new Random();
        int my_arr[] = new int[997];
        int total_even = 0;
        int total_odd = 0;
        for (int i = 0; i < 997; i++) {
            my_arr[i] = rand.nextInt(529) + 29;
            if (my_arr[i] % 2 == 0) {
                total_even += my_arr[i];
            }
            if (my_arr[i] % 2 !=0){
                total_odd+=my_arr[i];
            }
        }
        System.out.println("The sum of even values is: " + total_even+ "\n" + "The sum of odd values is: " + total_odd);
    }
    public static void prime(int x[]){
        Random rand = new Random();
        for (int i = 0; i<997; i++){
            x[i] = rand.nextInt(530)+29;
            for (int j = 29; j<=530; j++){
                if(x[i]==j && x[i]>50){
                    if(x[i]%j==0) {
                        break;
                    }else{
                        System.out.print(x[i] + " ");
                    }
                }
            }
        }
    }
}

package Week7;
import java.util.Scanner;
public class Date {
    int day, month, year;

    public void read_input(){
        Scanner my = new Scanner(System.in);
        System.out.println("Enter day: ");
        day = my.nextInt();
        System.out.println("Enter month: ");
        month = my.nextInt();
        System.out.println("Enter the year: ");
        year = my.nextInt();
    }public void print_date() {
        System.out.println(day + "/" + month + "/" + "/" + year);
    }
}


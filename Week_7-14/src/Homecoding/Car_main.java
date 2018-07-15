package Homecoding;
import  java.util.Scanner;
public class Car_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car Adilkhan_s_car = new Car();
        Adilkhan_s_car.mark = "Audi";
        Adilkhan_s_car.colour = "Red";
        Adilkhan_s_car.max_speed = 220;
        Adilkhan_s_car.weight = 1000;
        Adilkhan_s_car.year_of_release = 2007;
        System.out.println("Adilkhan's "+Adilkhan_s_car.mark+ " has been on road for "+ Adilkhan_s_car.years_on_roads()+" years.");
 //       System.out.println("Adilkhan, please, enter the price for your " + Adilkhan_s_car.mark + " in dollars.");
 //       int input_of_Adilkhan = in.nextInt();
 //       Adilkhan_s_car.setPrice(input_of_Adilkhan);

        Car Sultan_s_car = new Car();
        Sultan_s_car.mark = "BMW";
        Sultan_s_car.colour = "Black";
        Sultan_s_car.max_speed = 230;
        Sultan_s_car.weight = 1100;
        Sultan_s_car.year_of_release = 2009;
        System.out.println("Sultan's "+Sultan_s_car.mark+ " on has been on road for "+Sultan_s_car.years_on_roads()+" years.");
 //       System.out.println("Sultan, please, enter the price for your " + Sultan_s_car.mark +" in dollars.");
 //       int input_of_Sultan = in.nextInt();
 //       Sultan_s_car.setPrice(input_of_Sultan);

    }
}

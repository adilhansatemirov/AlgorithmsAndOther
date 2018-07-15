package DerekBanasJava.Interfaces;

public class MainClass {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4,200);
//        System.out.println("Car has "+car.getWheel());
//        System.out.println("Car drives "+car.getSpeed()+" km/h");
        car.setCarStrength(100);
        System.out.println("Car strength is: "+car.getCarStrength());
    }
}

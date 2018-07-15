package Week8;

import Week8.Vehicle;

public class Vehicle11 {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle();
        truck.setEfficiency(30);
        truck.setFuel_in_tank(80);
        truck.setTank_size(100);

        System.out.println("Truck need:" + truck.add_petrol() + " litters.");
        System.out.println("Truck can drive: " + truck.drive_to() + " kilometers.");
        truck.drove(30);
        System.out.println("Truck need:" + truck.add_petrol() + " litters.");
        System.out.println("Truck can drive: " + truck.drive_to() + " kilometers.");
    }
}

package Week8;

public class Vehicle {
    private double tank_size;
    private double efficiency;
    private double fuel_in_tank;

    public void setTank_size(double new_tank_size) {
        tank_size = new_tank_size;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public void setFuel_in_tank(double fuel) {
        fuel_in_tank = fuel;
    }

    public double add_petrol() {
        return tank_size - fuel_in_tank;
    }

    public double drive_to() {
        return fuel_in_tank *100/ efficiency;
    }

    public void drove(int km) {
        fuel_in_tank = fuel_in_tank - efficiency*km/100;
    }

}
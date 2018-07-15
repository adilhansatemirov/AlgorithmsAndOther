package DerekBanasJava.Interfaces;

public class Vehicle extends Crashable implements Drivable{
    int numberOfWheels = 2;
    double speed = 0;
    int carStrength = 0;

    @Override
    public int getWheel() {
        return this.numberOfWheels;
    }

    @Override
    public void setWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public Vehicle(){
    }
    public Vehicle(int numberOfWheels, double speed){
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }
    public Vehicle(int numberOfWheels, double speed, int carStrength){
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
        this.carStrength = carStrength;
    }

    //@Override
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }
    //@Override
    public int getCarStrength(){
       return this.carStrength;
    }
}

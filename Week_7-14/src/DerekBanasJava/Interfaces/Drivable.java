package DerekBanasJava.Interfaces;

public interface Drivable {
    //values cannot be changed
    final double PI = 3.14;

    public abstract int getWheel();

    void setWheels(int numberOfWheels);

    double getSpeed();

    void setSpeed(double speed);

}

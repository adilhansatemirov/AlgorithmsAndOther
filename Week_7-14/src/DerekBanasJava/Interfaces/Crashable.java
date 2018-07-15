package DerekBanasJava.Interfaces;

public abstract class Crashable {
    boolean CarDrivable = true;

    public void youCrashed(){
        this.CarDrivable = false;

    }
    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();
}

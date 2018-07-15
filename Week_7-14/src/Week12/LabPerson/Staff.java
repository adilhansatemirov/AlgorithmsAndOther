package Week12.LabPerson;

public class Staff extends Person{
    protected String school;
    protected double pay;

    Staff(String name, String address, String school, double fee){
        super(name,address);
        this.school = school;
        this.pay = fee;
    }

    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }

    public String toString(){
        return "Staff[Person[name = "+this.name+", address = "+this.address+"], school = "+this.school+", pay = "+this.pay+"]";
    }
}

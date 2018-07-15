package Week12.LabPerson;

public class Student extends Person{
    protected String program;
    protected int year;
    protected double fee;

    Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return this.program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int  year){
        this.year = year;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    public String toString(){
        return "Student[Person[name = "+this.name+", "+"address = "+this.address+"]," +
                " "+"program = "+ this.program+", year = "+this.year+", fee = "+this.fee+"]";
    }
}

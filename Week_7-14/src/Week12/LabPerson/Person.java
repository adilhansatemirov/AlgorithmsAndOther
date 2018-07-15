package Week12.LabPerson;

public class Person {
    protected String name;
    protected String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public String toString(){
        return "Person[name = "+this.name+","+" address = "+this.address+"]";
    }
}

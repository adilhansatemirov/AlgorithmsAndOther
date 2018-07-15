package Week12.Human;

public class Person {
    protected String firstName;
    protected String lastName;

    Person(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public void setFirstName(String s){
        this.firstName = s;
    }
    public void setLastName(String s){
        this.lastName = s;
    }
    public void displayDetails(){
        System.out.println(this.firstName+" "+this.lastName);
    }
}

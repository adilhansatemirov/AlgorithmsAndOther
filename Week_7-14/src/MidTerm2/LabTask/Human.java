package MidTerm2.LabTask;

public class Human {
    protected String name;
    protected int age;

    Human(){
        name = "no name";
        age = 0;
    }
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String toString() {
        return "Name: "+name+"\nAge: "+age;
    }
}

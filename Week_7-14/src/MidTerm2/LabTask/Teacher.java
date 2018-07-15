package MidTerm2.LabTask;

public class Teacher extends Human {
    private String subject;
    private Student student1;
    private Student student2;
    private Student student3;

    Teacher(){
        super();
        subject = "no subject";
    }
    Teacher(String name, int age, String subject, Student student1, Student student2, Student student3){
        super(name, age);
        this.subject = subject;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
    }
    public String toString() {
        return "Name: "+name+"\nAge: "+age+"\nSubject: "+subject+"\nStudent 1: "+student1.name+"\nStudent 2: "+student2.name+"\nStudent 3: "+student3.name;
    }
}

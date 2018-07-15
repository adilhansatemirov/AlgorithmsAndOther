package Week12.Human;


public class Student extends Person {
    protected String studentID;
    protected String course;
    protected String teacherName;

    public Student(String fn, String ln){
        super(fn,ln);
        this.studentID = "N/A";
        this.course = "N/A";
        this.teacherName = "N/A";
    }
    public Student(String fn, String ln, String course, String ID,String techName){
        super(fn,ln);
        this.course = course;
        this.studentID = ID;
        this.teacherName = techName;
    }
    public void displayDetails(){
        System.out.println(this.firstName+" "+this.lastName);
        System.out.println("ID: " + this.studentID);
        System.out.println("Course: " + this.course);
        System.out.println("Teacher name: " + this.teacherName);
    }
}

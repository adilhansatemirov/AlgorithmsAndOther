package Week3;

import java.util.HashMap;

//STUDENT CLASS
public class Student {
    //attributes of student
    private String nameSurname;
    private int sID;
    private HashMap<String, Course> courses = new HashMap<>();

    Student(){}
    //simple constructor(will put courses later)
    Student(String nameSurname, int sID) {
        this.nameSurname = nameSurname;
        this.sID = sID;
    }

    //add course method
    public void addCourse(Course course){
        courses.put(course.getCid(),new Course(course.getCid(),course.getTitle(),course.getTeacher()));
    }
    public Course getCourse(String courseCid){
        return courses.get(courseCid);
    }

    public HashMap<String, Course> getMapOfCourses() {
        return courses;
    }

    //Name and Surname setter and getter for Name and Surname(public)
    public String getNameSurname() {
        return nameSurname;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    //Student ID setter and getter for Student ID(protected)
    public int getsID() {
        return sID;
    }
    public void setsID(int sID) {
        this.sID = sID;
    }

    //shows information about student
    public String showInfo(){
        return String.format("Student information:\n\tName and Surname: %s\n\tStudent ID: %d\n", nameSurname, sID);
    }
}

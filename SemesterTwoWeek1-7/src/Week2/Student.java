package Week2;

import java.util.HashMap;

//STUDENT CLASS
public class Student {
    //attributes of student
    private String nameSurname;
    private int sID;
    private HashMap<String, Course> courses = new HashMap<>();

    //simple constructor(will put courses later)
    Student(String nameSurname, int sID) {
        this.nameSurname = nameSurname;
        this.sID = sID;
    }

    //add course method
    public void addCourse(Course course){
        courses.put(course.getCid(),new Course(course.getCid(),course.getTitle(),course.getTeacher(),
                course.getGrades().get('Q'),course.getGrades().get('H'),course.getGrades().get('M'),course.getGrades().get('F')));
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("==Info about student==").append("\n")
                     .append("Name and Surname: ").append(nameSurname).append("\n")
                     .append("Student ID: ").append(sID).append("\n");
        return stringBuilder.toString();
    }

    //COURSE CLASS
    public class Course {
        private String cid;
        private String title;
        private String teacher;
        private HashMap<Character,Integer> grades;

        //constructor for the course
        Course(String cid, String title,String teacher, int quizGrade, int homeworkGrade, int midtermsGrade, int finalGrade){
            this.cid = cid;
            this.title = title;
            this.teacher = teacher;
            //hashMap for the grades
            grades = new HashMap<>();
            this.grades.put('Q', checkValidity(quizGrade));
            this.grades.put('H', checkValidity(homeworkGrade));
            this.grades.put('M', checkValidity(midtermsGrade));
            this.grades.put('F', checkValidity(finalGrade));
        }
        public int checkValidity(int grade){
            if(grade>=0 && grade<=100){
                return grade;
            }
            System.out.println("Grade must be greater than 0 and lower than 100, please enter the grade again("+getCid()+")");
            return 0;
        }

        //calculate average method
        public double calculateAverage(){
            return 0.1*grades.get('Q')+0.1*grades.get('H')+0.3*grades.get('M')+0.5*grades.get('F');
        }

        //just setters and getters for each attribute
        public String getCid() {
            return cid;
        }
        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }

        public HashMap<Character, Integer> getGrades() {
            return grades;
        }
        public void setGrades(HashMap<Character, Integer> grades) {
            this.grades = grades;
        }

        public String getTeacher() {
            return teacher;
        }
        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }

        //shows information about the course
        public String showInfo(){
            return  "==Info about course==" +"\n"+
                    "Course ID: " + getCid() + "\n" +
                    "Title: " + getTitle() + "\n" +
                    "Teacher: " + getTeacher() + "\n" +
                    "Quiz grade: " + grades.get('Q') + "\n" +
                    "Homework grade: " + grades.get('H') + "\n" +
                    "Midterm grade: " + grades.get('M') + "\n" +
                    "Final grade: " + grades.get('F') + "\n" +
                    "Average grade: " + calculateAverage();
        }
    }
}

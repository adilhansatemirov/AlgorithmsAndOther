package Week3;

import java.util.HashMap;

//COURSE CLASS
public class Course {
    private String cid;
    private String title;
    private String teacher;
    //database for the students and the grades of this course
    private HashMap<Student,HashMap<Character,Integer>> grades = new HashMap<>();
    //storage of grades
    private HashMap<Character,Integer> studentGrades;


    Course(){}
    //constructor for the course
    Course(String cid, String title,String teacher){
        this.cid = cid;
        this.title = title;
        this.teacher = teacher;
    }
    //declaring the grades for particular student
    public void setGradesForStudent(Student student,int quizGrade, int homeworkGrade,
                                    int midtermGrade, int finalGrade){
        //creating storage of grades
        studentGrades = new HashMap<>();

        //putting the grades in the storage
        studentGrades.put('Q',checkValidity(quizGrade));
        studentGrades.put('H',checkValidity(homeworkGrade));
        studentGrades.put('M',checkValidity(midtermGrade));
        studentGrades.put('F',checkValidity(finalGrade));
        studentGrades.put('A',calculateAverage());

        //putting the student and his grades to the database
        grades.put(student,studentGrades);
    }
    public int checkValidity(int grade){
        if(grade>=0 && grade<=100){
            return grade;
        }
        System.out.println("Grade must be greater than 0 and lower than 100, please enter the grade again("+getCid()+")");
        return 0;
    }

    //getting grades for particular student
    public HashMap<Character, Integer> getGradesForStudent(Student student) {
        return grades.get(student);
    }

    //calculate average method
    public int calculateAverage(){
        return (int)(0.1*studentGrades.get('Q')+0.1*studentGrades.get('H')+0.3*studentGrades.get('M')+0.5*studentGrades.get('F'));
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

    public HashMap<Character, Integer> getStudentGrades() {
        return studentGrades;
    }

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    //shows information about the course
    public String showInfo(){
        return  "Course information: \n" +
                "\tCourse ID: " + getCid() + "\n" +
                "\tTitle: " + getTitle() + "\n" +
                "\tTeacher: " + getTeacher() + "\n";
    }
    public String showGradesOfStudent(Student student){
        return "\tGrades: \n" +
                "\t\tQuiz: " + grades.get(student).get('Q') + "\n" +
                "\t\tHomework: " + grades.get(student).get('H') + "\n" +
                "\t\tMidterm: " + grades.get(student).get('M') + "\n" +
                "\t\tFinal: " + grades.get(student).get('F') + "\n" +
                "\t\tAverage: " + calculateAverage()+"\n";
    }
}

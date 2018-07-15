package Week2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    static HashMap<Student,HashMap<String,Student.Course>> data;
    static PrintWriter writer;
    public static void main(String[] args) {
        try {
            writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\Desktop\\Programming Task\\LabTask(31.01.2018).txt"));
        }catch (FileNotFoundException e){
            System.out.println("File wasn't found.");
        }
        //hashMap 'data' that holds the 'students' and the set of 'courses' they took
        //we could use HashSet instead, but it doesn't contain 'get' method, which seems to be useful
        data = new HashMap<>();

        //student Sultan Tazhbayev
        Student tazhibayevS = new Student("Sultan Tazhibayev", 170103001);

        //courses that Sultan took and the grades he got
        Student.Course inf104Tazibayev = tazhibayevS.new Course("INF-104", "Programming Technologies", "Shahriyar Shamilulu", 50, 60, 70, 100);
        Student.Course inf105Tazibayev = tazhibayevS.new Course("INF-105", "ICT", "Ardak Shalkarbayuly", 76, 80, 46, 99);
        Student.Course inf106Tazibayev = tazhibayevS.new Course("INF-106", "Introduction to Python", "Satbek Abdyldayev", 88, 90, 66, 50);

        //putting everything into a map in order to operate the data in future
        tazhibayevS.addCourse(inf104Tazibayev);
        tazhibayevS.addCourse(inf105Tazibayev);
        tazhibayevS.addCourse(inf106Tazibayev);

        //putting that in the database
        data.put(tazhibayevS, tazhibayevS.getMapOfCourses());

        try {//tries to show info about the course
            System.out.println(tazhibayevS.showInfo() + tazhibayevS.getCourse("INF-104").showInfo());
            System.out.println(tazhibayevS.getCourse("INF-105").showInfo());
            System.out.println(tazhibayevS.getCourse("INF-106").showInfo());
            System.out.println();
        } catch (NullPointerException e) {//if it is not found, prints that the student didn't take this course
            System.out.println("Student " + tazhibayevS.getNameSurname() + " didn't chose the course you entered");
            System.out.println();
        }
        try {//tries to show info about the course
            writer.println(tazhibayevS.showInfo());
            writer.println(tazhibayevS.getCourse("INF-104").showInfo());
            writer.println(tazhibayevS.getCourse("INF-105").showInfo());
            writer.println(tazhibayevS.getCourse("INF-106").showInfo());
            writer.println();
        } catch (NullPointerException e) {//if it is not found, prints that the student didn't take this course
            writer.println("Student " + tazhibayevS.getNameSurname() + " didn't chose the course you entered");
            writer.println();
        }
//**********************************************************************************************************************

        //another student
        Student baybekovM = new Student("Marat Baybekov", 170103002);
        //courses and his grades
        Student.Course inf104Baybekov = baybekovM.new Course("INF-104", "Programming Technologies", "Shahriyar Shamilulu", 50, 60, 70, 100);
        Student.Course mat100Baybekov = baybekovM.new Course("MAT-100", "Calculus 1", "Larisa Bazarbayeva", 100, 100, 100, 100);
        Student.Course mat101Baybekov = baybekovM.new Course("MAT-101", "Linear Algebra", "Mariya Nemchenko", 90, 90, 89, 100);

        baybekovM.addCourse(inf104Baybekov);
        baybekovM.addCourse(mat100Baybekov);
        baybekovM.addCourse(mat101Baybekov);
        //saving it in data base
        data.put(baybekovM, baybekovM.getMapOfCourses());
        try {
            //displaying info about Marat Baybekov and 'MAT-101' course he took
            System.out.println(baybekovM.showInfo() + baybekovM.getCourse("INF-104").showInfo());
            System.out.println(baybekovM.getCourse("MAT-100").showInfo());
            System.out.println(baybekovM.getCourse("MAT-101").showInfo());
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Student " + baybekovM.getNameSurname() + " didn't chose the course you entered");
            System.out.println();
        }
        try {
            //displaying info about Marat Baybekov and 'MAT-101' course he took
            writer.println(baybekovM.showInfo());
            writer.println(baybekovM.getCourse("INF-104").showInfo());
            writer.println(baybekovM.getCourse("MAT-100").showInfo());
            writer.println(baybekovM.getCourse("MAT-101").showInfo());
            writer.println();
        } catch (NullPointerException e) {
            writer.println("Student " + baybekovM.getNameSurname() + " didn't chose the course you entered");
            writer.println();
        }
//**********************************************************************************************************************

        Student almasovT = new Student("Talgat Almasov", 170103003);

        Student.Course inf104Almasov = almasovT.new Course("INF-104", "Programming Tachnologies", "Shahriyar Shamilulu", 90, 91, 92, 100);
        Student.Course mat100Almasov = almasovT.new Course("MAT-100", "Calculus 1", "Larisa Bazarbayeva", 100, 90, 80, 90);
        Student.Course tr108Almasov = almasovT.new Course("TR-108", "Principals of Translation", "Oksana Surmen", 100, 100, 100, 100);

        almasovT.addCourse(inf104Almasov);
        almasovT.addCourse(mat100Almasov);
        almasovT.addCourse(tr108Almasov);
        data.put(almasovT, almasovT.getMapOfCourses());
        try {
            System.out.println(almasovT.showInfo() + almasovT.getCourse("INF-104").showInfo());
            System.out.println(almasovT.getCourse("MAT-100").showInfo());
            System.out.println(almasovT.getCourse("TR-108").showInfo());
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Student " + almasovT.getNameSurname() + " didn't chose the course you entered");
            System.out.println();
        }
        try {
            writer.println(almasovT.showInfo());
            writer.println(almasovT.getCourse("INF-104").showInfo());
            writer.println(almasovT.getCourse("MAT-100").showInfo());
            writer.println(almasovT.getCourse("TR-108").showInfo());
            writer.println();
        } catch (NullPointerException e) {
            writer.println("Student " + almasovT.getNameSurname() + " didn't chose the course you entered");
            writer.println();
        }

//**********************************************************************************************************************

        //CALCULATING THE PERFORMANCE
        //INF-104 COURSE
        System.out.println("CALCULATING AVERAGE GRADE IN THE COURSE INF-104");
        System.out.println("Average INF-104 of Sultan Tazibayev: " + tazhibayevS.getCourse("INF-104").calculateAverage());
        System.out.println("Average INF-104 of Marat Baybekov: " + baybekovM.getCourse("INF-104").calculateAverage());
        System.out.println("Average INF-104 of Talgat Almasov: " + almasovT.getCourse("INF-104").calculateAverage());
        System.out.println("INF-104 Average: " + performanceOfCourse("INF-104"));
        System.out.println();
//**********************************************************************************************************************
        //MAT-100 COURSE
        System.out.println("CALCULATING AVERAGE GRADE IN THE COURSE MAT-104");
        System.out.println("Average MAT-100 of Marat Baybekov: " + baybekovM.getCourse("MAT-100").calculateAverage());
        System.out.println("Average MAT-100 of Talgat Almasov: " + almasovT.getCourse("MAT-100").calculateAverage());
        System.out.println("MAT-100 Average: " + performanceOfCourse("MAT-100"));
        System.out.println();
//**********************************************************************************************************************

        //CALCULATING PERFORMANCE OF STUDENTS
        System.out.println("CALCULATING PERFORMANCE OF STUDENTS STEP");
        System.out.println("Sultan Tazhibaev's average of course 'INF-104': " + tazhibayevS.getCourse("INF-104").calculateAverage());
        System.out.println("Sultan Tazhibaev's average of course 'INF-105': " + tazhibayevS.getCourse("INF-105").calculateAverage());
        System.out.println("Sultan Tazhibaev's average of course 'INF-106': " + tazhibayevS.getCourse("INF-106").calculateAverage());

        System.out.println("Performance of Sultan Tazhibayev: " + performanceOfStudent(tazhibayevS));
        System.out.println();
//**********************************************************************************************************************
        //MARAT BAYBEKOV'S PERFOMANCE
        System.out.println("Marat Baybekov's average of course 'INF-104': " + baybekovM.getCourse("INF-104").calculateAverage());
        System.out.println("Marat Baybekov's average of course 'MAT-100': " + baybekovM.getCourse("MAT-100").calculateAverage());
        System.out.println("Marat Baybekov's average of course 'MAT-101': " + baybekovM.getCourse("MAT-101").calculateAverage());

        System.out.println("Average of Baybekov Marat: " + performanceOfStudent(baybekovM));
        System.out.println();
//**********************************************************************************************************************
        //TALGAT OMAROV'S PERFOMANCE
        System.out.println("Talgat Almasov's average of course 'INF-104': " + almasovT.getCourse("INF-104").calculateAverage());
        System.out.println("Talgat Almasov's average of course 'MAT-100': " + almasovT.getCourse("MAT-100").calculateAverage());
        System.out.println("Talgat Almasov's average of course 'TR-108': " + almasovT.getCourse("TR-108").calculateAverage());

        System.out.println("Average of Almasov Talgat: " + performanceOfStudent(almasovT));
        System.out.println();
    }
    public static double performanceOfStudent(Student student){
        ArrayList<Double> toCalculatePerform = new ArrayList<>();
        for(Map.Entry<String, Student.Course> iterate1: student.getMapOfCourses().entrySet()){
            toCalculatePerform.add(iterate1.getValue().calculateAverage());
        }
        double performance = 0;
        for (int i = 0; i < toCalculatePerform.size(); i++) {
            performance+=toCalculatePerform.get(i);
        }
        performance = Math.round(performance/toCalculatePerform.size()*100.0)/100.0;
        return performance;
    }

    public static double performanceOfCourse(String courseCID){
        //we hold here average grades of students of this course
        ArrayList<Double> toCalculatePerformance = new ArrayList<>();

        //iterating through the map looking for course with the given CID
        for(Map.Entry<Student,HashMap<String,Student.Course>> iterate1: data.entrySet()){
            if(iterate1.getValue().containsKey(courseCID)){
                toCalculatePerformance.add(iterate1.getValue().get(courseCID).calculateAverage());
            }
        }

        double performance = 0;
        for (int i = 0; i < toCalculatePerformance.size(); i++) {
            performance+=toCalculatePerformance.get(i);
        }
        performance = Math.round(performance/toCalculatePerformance.size()*100.0)/100.0;
        return performance;
    }

}

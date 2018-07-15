package Week3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoWritingToFile {
    static HashMap<Student,HashMap<String,Course>> data;
    static PrintWriter writer;
    public static void main(String[] args) {
        StringBuilder toWrite = new StringBuilder();
        //hashMap 'data' that holds the 'students' and the set of 'courses' they took
        //we could use HashSet instead, but it doesn't contain 'get' method, which seems to be useful
        data = new HashMap<>();

        //student Sultan Tazhbayev
        Student tazhibayevS = new Student("Sultan Tazhibayev", 170103001);
        Student baybekovK = new Student("Kyran Baybekov", 170103002);
        Student almasovT = new Student("Talgat Almasov", 170103003);


        //courses
        Course inf104 = new Course("INF-104", "Programming Technologies", "Shahriyar Shamilulu");
        Course inf105 = new Course("INF-105", "ICT", "Ardak Shalkarbayuly");
        Course inf106 = new Course("INF-106", "Introduction to Python", "Satbek Abdyldayev");
        Course mat100 = new Course("MAT-100", "Calculus 1", "Larisa Bazarbayeva");
        Course mat101 = new Course("MAT-101", "Linear Algebra", "Mariya Nemchenko");
        Course tr108 = new Course("TR-108", "Principals of Translation", "Oksana Surmen");


        //putting everything into a map in order to operate the data in future
        tazhibayevS.addCourse(inf104);
        tazhibayevS.addCourse(inf105);
        tazhibayevS.addCourse(inf106);

        baybekovK.addCourse(inf104);
        baybekovK.addCourse(mat100);
        baybekovK.addCourse(mat101);

        almasovT.addCourse(inf104);
        almasovT.addCourse(mat100);
        almasovT.addCourse(tr108);

        //grades for students INF-104
        inf104.setGradesForStudent(tazhibayevS,100,100,100,100);
        inf104.setGradesForStudent(baybekovK,90,90,90,90);
        inf104.setGradesForStudent(almasovT,80,80,80,80);

        ////grades for students INF-105
        mat100.setGradesForStudent(baybekovK,70,70,70,70);

        //putting that in the database
        data.put(tazhibayevS, tazhibayevS.getMapOfCourses());

        System.out.println(inf104.getGradesForStudent(tazhibayevS).get('Q'));
        System.out.println(inf104.getGradesForStudent(baybekovK).get('Q'));
        System.out.println(inf104.getGradesForStudent(almasovT).get('H'));
        System.out.println(mat100.getGradesForStudent(baybekovK).get('F'));
        System.out.println(tazhibayevS.showInfo());
        System.out.println(inf104.showInfo());
        System.out.println(inf104.showGradesOfStudent(tazhibayevS));


        /*try {//tries to show info about the course
            toWrite.append(tazhibayevS.showInfo());
            toWrite.append(tazhibayevS.getCourse("INF-104").showInfo());
            toWrite.append(tazhibayevS.getCourse("INF-105").showInfo());
            toWrite.append(tazhibayevS.getCourse("INF-106").showInfo()).append("\n");

        } catch (NullPointerException e) {//if it is not found, prints that the student didn't take this course
            toWrite.append("Student ").append(tazhibayevS.getNameSurname()).append(" didn't chose the course you entered");
            toWrite.append("\n");
        }
//**********************************************************************************************************************

        //another student
        Student baybekovM = new Student("Marat Baybekov", 170103002);
        //courses and his grades
        Course inf104Baybekov = new Course("INF-104", "Programming Technologies", "Shahriyar Shamilulu");
        Course mat100Baybekov = new Course("MAT-100", "Calculus 1", "Larisa Bazarbayeva");
        Course mat101Baybekov = new Course("MAT-101", "Linear Algebra", "Mariya Nemchenko");

        baybekovM.addCourse(inf104Baybekov);
        baybekovM.addCourse(mat100Baybekov);
        baybekovM.addCourse(mat101Baybekov);
        //saving it in data base
        data.put(baybekovM, baybekovM.getMapOfCourses());

        try {
            //displaying info about Marat Baybekov and 'MAT-101' course he took
            toWrite.append(baybekovM.showInfo());
            toWrite.append(baybekovM.getCourse("INF-104").showInfo());
            toWrite.append(baybekovM.getCourse("MAT-100").showInfo());
            toWrite.append(baybekovM.getCourse("MAT-101").showInfo());
            toWrite.append("\n");
        } catch (NullPointerException e) {
            toWrite.append("Student ").append(baybekovM.getNameSurname()).append(" didn't chose the course you entered");
            toWrite.append("\n");
        }
//**********************************************************************************************************************

        Student almasovT = new Student("Talgat Almasov", 170103003);

        Course inf104Almasov = new Course("INF-104", "Programming Tachnologies", "Shahriyar Shamilulu");
        Course mat100Almasov = new Course("MAT-100", "Calculus 1", "Larisa Bazarbayeva");
        Course tr108Almasov = new Course("TR-108", "Principals of Translation", "Oksana Surmen");

        almasovT.addCourse(inf104Almasov);
        almasovT.addCourse(mat100Almasov);
        almasovT.addCourse(tr108Almasov);
        data.put(almasovT, almasovT.getMapOfCourses());

        try {
            toWrite.append(almasovT.showInfo());
            toWrite.append(almasovT.getCourse("INF-104").showInfo());
            toWrite.append(almasovT.getCourse("MAT-100").showInfo());
            toWrite.append(almasovT.getCourse("TR-108").showInfo());
            toWrite.append("\n");
        } catch (NullPointerException e) {
            toWrite.append("Student ").append(almasovT.getNameSurname()).append(" didn't chose the course you entered");
            toWrite.append("\n");
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

        toWrite.append(" CALCULATING AVERAGE GRADE IN THE COURSE INF-104").append("\n");
        toWrite.append("Average INF-104 of Sultan Tazibayev: ").append(tazhibayevS.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("Average INF-104 of Marat Baybekov: ").append(baybekovM.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("Average INF-104 of Talgat Almasov: ").append(almasovT.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("INF-104 Average: ").append(performanceOfCourse("INF-104")).append("\n");
        toWrite.append("\n");

//**********************************************************************************************************************
        //MAT-100 COURSE
        System.out.println(" CALCULATING AVERAGE GRADE IN THE COURSE MAT-104");
        System.out.println("Average MAT-100 of Marat Baybekov: " + baybekovM.getCourse("MAT-100").calculateAverage());
        System.out.println("Average MAT-100 of Talgat Almasov: " + almasovT.getCourse("MAT-100").calculateAverage());
        System.out.println("MAT-100 Average: " + performanceOfCourse("MAT-100"));
        System.out.println();

        toWrite.append(" CALCULATING AVERAGE GRADE IN THE COURSE MAT-104").append("\n");
        toWrite.append("Average MAT-100 of Marat Baybekov: ").append(baybekovM.getCourse("MAT-100").calculateAverage()).append("\n");
        toWrite.append("Average MAT-100 of Talgat Almasov: ").append(almasovT.getCourse("MAT-100").calculateAverage()).append("\n");
        toWrite.append("MAT-100 Average: ").append(performanceOfCourse("MAT-100")).append("\n");
        toWrite.append("\n");
//**********************************************************************************************************************

        //CALCULATING PERFORMANCE OF STUDENTS
        System.out.println(" CALCULATING PERFORMANCE OF STUDENTS STEP");
        System.out.println("Sultan Tazhibaev's average of course 'INF-104': " + tazhibayevS.getCourse("INF-104").calculateAverage());
        System.out.println("Sultan Tazhibaev's average of course 'INF-105': " + tazhibayevS.getCourse("INF-105").calculateAverage());
        System.out.println("Sultan Tazhibaev's average of course 'INF-106': " + tazhibayevS.getCourse("INF-106").calculateAverage());

        System.out.println("Performance of Sultan Tazhibayev: " + performanceOfStudent(tazhibayevS));
        System.out.println();

        toWrite.append(" PERFORMANCE OF SULTAN TAZHIBAYEV").append("\n");
        toWrite.append("Sultan Tazhibaev's average of course 'INF-104': ").append(tazhibayevS.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("Sultan Tazhibaev's average of course 'INF-105': ").append(tazhibayevS.getCourse("INF-105").calculateAverage()).append("\n");
        toWrite.append("Sultan Tazhibaev's average of course 'INF-106': ").append(tazhibayevS.getCourse("INF-106").calculateAverage()).append("\n");

        toWrite.append("Performance of Sultan Tazhibayev: ").append(performanceOfStudent(tazhibayevS)).append("\n");
        toWrite.append("\n");

//**********************************************************************************************************************
        //MARAT BAYBEKOV'S PERFOMANCE
        System.out.println("Marat Baybekov's average of course 'INF-104': " + baybekovM.getCourse("INF-104").calculateAverage());
        System.out.println("Marat Baybekov's average of course 'MAT-100': " + baybekovM.getCourse("MAT-100").calculateAverage());
        System.out.println("Marat Baybekov's average of course 'MAT-101': " + baybekovM.getCourse("MAT-101").calculateAverage());

        System.out.println("Average of Baybekov Marat: " + performanceOfStudent(baybekovM));
        System.out.println();

        toWrite.append(" PERFORMANCE OF MARAT BAYBEKOV").append("\n");
        toWrite.append("Marat Baybekov's average of course 'INF-104': ").append(baybekovM.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("Marat Baybekov's average of course 'MAT-100': ").append(baybekovM.getCourse("MAT-100").calculateAverage()).append("\n");
        toWrite.append("Marat Baybekov's average of course 'MAT-101': ").append(baybekovM.getCourse("MAT-101").calculateAverage()).append("\n");

        toWrite.append("Average of Baybekov Marat: ").append(performanceOfStudent(baybekovM)).append("\n");
        toWrite.append("\n");
//**********************************************************************************************************************
        //TALGAT OMAROV'S PERFOMANCE
        System.out.println("Talgat Almasov's average of course 'INF-104': " + almasovT.getCourse("INF-104").calculateAverage());
        System.out.println("Talgat Almasov's average of course 'MAT-100': " + almasovT.getCourse("MAT-100").calculateAverage());
        System.out.println("Talgat Almasov's average of course 'TR-108': " + almasovT.getCourse("TR-108").calculateAverage());

        System.out.println("Average of Almasov Talgat: " + performanceOfStudent(almasovT));
        System.out.println();

        toWrite.append(" PERFORMANCE OF TALGAT ALMASOV").append("\n");
        toWrite.append("Talgat Almasov's average of course 'INF-104': ").append(almasovT.getCourse("INF-104").calculateAverage()).append("\n");
        toWrite.append("Talgat Almasov's average of course 'MAT-100': ").append(almasovT.getCourse("MAT-100").calculateAverage()).append("\n");
        toWrite.append("Talgat Almasov's average of course 'TR-108': ").append(almasovT.getCourse("TR-108").calculateAverage()).append("\n");

        toWrite.append("Average of Almasov Talgat: ").append(performanceOfStudent(almasovT)).append("\n");
        toWrite.append("\n");


        //actually write the info to the file
        try {
            writeToFile(toWrite.toString());
        }catch (Exception e){}
    }
    public static double performanceOfStudent(Student student){
        ArrayList<Integer> toCalculatePerform = new ArrayList<>();
        for(Map.Entry<String, Course> iterate1: student.getMapOfCourses().entrySet()){
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
        ArrayList<Integer> toCalculatePerformance = new ArrayList<>();

        //iterating through the map looking for course with the given CID
        for(Map.Entry<Student,HashMap<String,Course>> iterate1: data.entrySet()){
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

    public static void writeToFile(String input){
        try {
            writer = new PrintWriter(new FileOutputStream("C:\\Users\\Пользователь\\IdeaProjects\\SemesterTwoWeek1-7\\src\\Week3\\TextToWrite.txt"));
        }catch (FileNotFoundException e){
            System.out.println("File wasn't found.");
        }
        writer.println(input);
        writer.close();
        */
    }
}
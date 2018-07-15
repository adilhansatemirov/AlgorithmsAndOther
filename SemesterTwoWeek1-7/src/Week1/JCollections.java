package Week1;

//importing everything we need
import java.util.*;

public class JCollections {

    public static void main(String[] args) {
        //Create three students
        Student std1 = new Student("Karim Ibrahimov",101, 3.5);
        Student std2 = new Student("Almas Kades",102, 3.6);
        Student std3 = new Student("Arystan Nutbolatov",103, 3.7);
        Student std4 = new Student("Madiyar Balgabaev",104, 3.8);
        Student std5 = new Student("Isatay Armanov",105, 3.9);
        Student std6 = new Student("Alpamys Serkebayev",105, 4.0);
        //Creating ArrayLists of students
        ArrayList<Student> EN03A = new ArrayList<>();
        EN03A.add(std1);
        EN03A.add(std2);
        EN03A.add(std3);
        ArrayList<Student> EN03H = new ArrayList<>();
        EN03H.add(std4);
        EN03H.add(std5);
        EN03H.add(std6);


        ArrayList<ArrayList<Student>> groupsOfStudents = new ArrayList<>();
        groupsOfStudents.add(EN03A);
        groupsOfStudents.add(EN03H);

        HashMap<String,ArrayList<Student>> map1 = new HashMap<>();
        map1.put("EN03A",groupsOfStudents.get(0));
        map1.put("EN03H",groupsOfStudents.get(1));

        System.out.println(map1.get("EN03A").get(0).getsID());

//        for (int counterOne = 0; counterOne < groupsOfStudents.size(); counterOne++) {
//            for (int counterTwo = 0; counterTwo < groupsOfStudents.get(counterOne).size(); counterTwo++) {
//                groupsOfStudents.get(counterOne).get(counterTwo).showDetails();
//            }
//        }

    }

    //Creating a Student class
    static class Student {

        public String nameSurname;
        protected int sID;
        private double gpa;

        Student(String nameSurname, int sID, double gpa) {
            this.nameSurname = nameSurname;
            this.sID = sID;
            this.gpa = gpa;
        }

        public void showDetails() {
            System.out.println("=== STUDENT DETAILS ===");
            System.out.println("Name and Surname: " + nameSurname);
            System.out.println("Student ID: " + sID);
            System.out.println("Students GPA: " + gpa);
            System.out.println();
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


        //GPA setter and getter for GPA(private)
        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            //check point for GPA
            if (gpa >= 0.0 && gpa <= 4.0)
                this.gpa = gpa;
            else {
                System.out.println("Wrong GPA range.");
                this.gpa = 0.0;
            }
        }

        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Name and Surname: " + nameSurname).append("\n");
            stringBuilder.append("Student ID: " + sID).append("\n");
            stringBuilder.append("Students GPA: " + gpa).append("\n");
            return stringBuilder.toString();
        }
    }

}
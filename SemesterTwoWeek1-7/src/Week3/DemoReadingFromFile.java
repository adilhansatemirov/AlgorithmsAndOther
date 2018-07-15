package Week3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DemoReadingFromFile {
    //lists with information that we want to retrieve
    private static ArrayList<String> studentNames;
    private static ArrayList<Integer> studentIDs;
    private static ArrayList<String> courseIDs;
    private static ArrayList<String> courseTitles;
    private static ArrayList<String> courseTeachers;
    private static ArrayList<HashMap<Character, Integer>> courseGrades;

    public static void main(String[] args) {
        /*try {
            //try to read the file
            readFromFile("C:\\Users\\Пользователь\\IdeaProjects\\SemesterTwoWeek1-7\\src\\Week3\\TextToWrite.txt");
        } catch (Exception e) {
            //concrete exceptions are written in the method 'readFromFile'
            System.out.println();
        }

        //STUDENT 1 AND COURSES HE TOOK
        try {
            //construct objects using info that we fetched from file
            Student tazhibayev = new Student(studentNames.get(0), studentIDs.get(0));
            Course inf104Tazhibayev = new Course(courseIDs.get(0), courseTitles.get(0), courseTeachers.get(0),
                    courseGrades.get(0).get('Q'), courseGrades.get(0).get('H'),
                    courseGrades.get(0).get('M'), courseGrades.get(0).get('F'));
            Course inf105Tazhibayev = new Course(courseIDs.get(1), courseTitles.get(1), courseTeachers.get(1),
                    courseGrades.get(1).get('Q'), courseGrades.get(1).get('H'),
                    courseGrades.get(1).get('M'), courseGrades.get(1).get('F'));
            Course inf106Tazhibayev = new Course(courseIDs.get(2), courseTitles.get(2), courseTeachers.get(2),
                    courseGrades.get(2).get('Q'), courseGrades.get(2).get('H'),
                    courseGrades.get(2).get('M'), courseGrades.get(2).get('F'));

            //adding courses to student
            tazhibayev.addCourse(inf104Tazhibayev);
            tazhibayev.addCourse(inf105Tazhibayev);
            tazhibayev.addCourse(inf106Tazhibayev);

            //printing info about students and courses
            System.out.println(tazhibayev.showInfo());
            System.out.println("1." + inf104Tazhibayev.showInfo());
            System.out.println("2." + inf105Tazhibayev.showInfo());
            System.out.println("3." + inf106Tazhibayev.showInfo());
        } catch (Exception exceptionStudent1) {
            //just prevents the exception
            //concrete problem is shown in method 'readFromFile'
            System.out.println();
        }

        try {
            //STUDENT 2 AND COURSES HE TOOK
            Student baybekov = new Student(studentNames.get(1), studentIDs.get(1));
            Course inf104Baybekov = new Course(courseIDs.get(3), courseTitles.get(3), courseTeachers.get(3),
                    courseGrades.get(3).get('Q'), courseGrades.get(3).get('H'),
                    courseGrades.get(3).get('M'), courseGrades.get(3).get('F'));
            Course mat100Baybekov = new Course(courseIDs.get(4), courseTitles.get(4), courseTeachers.get(4),
                    courseGrades.get(4).get('Q'), courseGrades.get(4).get('H'),
                    courseGrades.get(4).get('M'), courseGrades.get(4).get('F'));
            Course mat101Baybekov = new Course(courseIDs.get(5), courseTitles.get(5), courseTeachers.get(5),
                    courseGrades.get(5).get('Q'), courseGrades.get(5).get('H'),
                    courseGrades.get(5).get('M'), courseGrades.get(5).get('F'));
            baybekov.addCourse(inf104Baybekov);
            baybekov.addCourse(mat100Baybekov);
            baybekov.addCourse(mat101Baybekov);

            System.out.println(baybekov.showInfo());
            System.out.println("1." + inf104Baybekov.showInfo());
            System.out.println("2." + mat100Baybekov.showInfo());
            System.out.println("3." + mat101Baybekov.showInfo());
        } catch (Exception exceptionStudent2) {
            System.out.println();
        }

        try {
            //STUDENT 3 AND COURSES HE TOOK
            Student almasov = new Student(studentNames.get(2), studentIDs.get(2));
            Course inf104Almasov = new Course(courseIDs.get(6), courseTitles.get(6), courseTeachers.get(6),
                    courseGrades.get(6).get('Q'), courseGrades.get(6).get('H'),
                    courseGrades.get(6).get('M'), courseGrades.get(6).get('F'));
            Course mat100Almasov = new Course(courseIDs.get(7), courseTitles.get(7), courseTeachers.get(7),
                    courseGrades.get(7).get('Q'), courseGrades.get(7).get('H'),
                    courseGrades.get(7).get('M'), courseGrades.get(7).get('F'));
            Course tr108Almasov = new Course(courseIDs.get(8), courseTitles.get(8), courseTeachers.get(8),
                    courseGrades.get(8).get('Q'), courseGrades.get(8).get('H'),
                    courseGrades.get(8).get('M'), courseGrades.get(8).get('F'));
            almasov.addCourse(inf104Almasov);
            almasov.addCourse(mat100Almasov);
            almasov.addCourse(tr108Almasov);

            System.out.println(almasov.showInfo());
            System.out.println("1." + inf104Almasov.showInfo());
            System.out.println("2." + mat100Almasov.showInfo());
            System.out.println("3." + tr108Almasov.showInfo());
        } catch (Exception exceptionStudent3) {
            System.out.println();
        }
    }

    public static void readFromFile(String path) {
        //trying to create a scanner with a given path
        Scanner reader = null;
        try {
            reader = new Scanner(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            System.out.println("File wasn't found.");
        }

        //putting every line that file has into the ArrayList
        ArrayList<String> lines = new ArrayList<>();
        try {
            //we check whether the file is not empty
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch (NullPointerException e) {
            System.out.println("File found is empty.");
        }

        //lists of the information that we want to retrieve
        studentNames = new ArrayList<>();
        studentIDs = new ArrayList<>();
        courseIDs = new ArrayList<>();
        courseTitles = new ArrayList<>();
        courseTeachers = new ArrayList<>();
        courseGrades = new ArrayList<>();

        //to put it in th HashMap of grades
        char[] lettersForGrades = {'Q', 'H', 'M', 'F'};

        //STUDENTS INFO
        //loop goes through the lines where the info about students is stored
        for (int lineWithNameAndSID = 1; lineWithNameAndSID <= 69; lineWithNameAndSID += 34) {
            try {
                String[] splitName = lines.get(lineWithNameAndSID).split(": ");
                //gets the line, splits it into 2 elements by regex, making an array of two elements
                studentNames.add(splitName[1]);
                //adds second element(name) to the arrayList of names

                //the same operation with SID, but here we need to parse to integer
                String[] splitSIDs = lines.get(lineWithNameAndSID + 1).split(": ");
                studentIDs.add(Integer.parseInt(splitSIDs[1]));
            } catch (ArrayIndexOutOfBoundsException e) {
                //catches error when the info is not written
                //indicates the line where the exception is found
                System.out.println("An error occurred in line " + (lineWithNameAndSID + 1)+" or " +
                        + (lineWithNameAndSID + 2)+". Please correct the information.");
                //adds the empty elements to the ArrayLists of Info
                studentNames.add("N/A");
                studentIDs.add(0);
            }
        }

        //COURSES INFO
        //adding info about courses of student 1
        for (int line = 4; line <= 24; line += 10) {
            try {
                String[] splitCID = lines.get(line).split(": ");            //gets CIDs
                courseIDs.add(splitCID[1]);
                String[] splitTitles = lines.get(line + 1).split(": ");     //gets title
                courseTitles.add(splitTitles[1]);
                String[] splitTeachers = lines.get(line + 2).split(": ");   //gets teacher
                courseTeachers.add(splitTeachers[1]);

                HashMap<Character, Integer> grades = new HashMap<>();             //gets grades
                int counter = 0;
                for (int lineWithGrade = line + 4; lineWithGrade <= line + 7; lineWithGrade++) {
                    //goes through the lines where the grades are written
                    String[] splitGrades = lines.get(lineWithGrade).split(": ");
                    grades.put(lettersForGrades[counter], Integer.parseInt(splitGrades[1]));
                    counter++;
                }
                courseGrades.add(grades);
            } catch (Exception exceptionWithCourse1) {
                System.out.println("Data error occurred in while reading information about courses of student 1. Please correct the information.");
                courseIDs.add("N/A");
                courseTitles.add("N/A");
                courseTeachers.add("N/A");
                courseGrades.add(null);
                break;
            }
        }

        for (int line = 38; line <= 58; line += 10) {
            try {
                String[] splitCID = lines.get(line).split(": ");            //gets CIDs
                courseIDs.add(splitCID[1]);
                String[] splitTitles = lines.get(line + 1).split(": ");     //gets title
                courseTitles.add(splitTitles[1]);
                String[] splitTeachers = lines.get(line + 2).split(": ");   //gets teacher
                courseTeachers.add(splitTeachers[1]);

                HashMap<Character, Integer> grades = new HashMap<>();
                int counter = 0;
                for (int lineWithGrade = line + 4; lineWithGrade <= line + 7; lineWithGrade++) {
                    String[] splitGrades = lines.get(lineWithGrade).split(": ");
                    grades.put(lettersForGrades[counter], Integer.parseInt(splitGrades[1]));
                    counter++;
                }
                courseGrades.add(grades);
            } catch (Exception exceptionWithCourse2) {
                System.out.println("Data error occurred while reading the information about courses of student 2 Please correct the information.");
                courseIDs.add("N/A");
                courseTitles.add("N/A");
                courseTeachers.add("N/A");
                courseGrades.add(null);
                break;
            }
        }

        for (int line = 72; line <= 92; line += 10) {
            try {
                String[] splitCID = lines.get(line).split(": ");          //gets CIDs
                courseIDs.add(splitCID[1]);
                String[] splitTitles = lines.get(line + 1).split(": ");   //gets title
                courseTitles.add(splitTitles[1]);
                String[] splitTeachers = lines.get(line + 2).split(": "); //gets teacher
                courseTeachers.add(splitTeachers[1]);

                HashMap<Character, Integer> grades = new HashMap<>();
                int counter = 0;
                for (int lineWithGrade = line + 4; lineWithGrade <= line + 7; lineWithGrade++) {
                    String[] splitGrades = lines.get(lineWithGrade).split(": ");
                    grades.put(lettersForGrades[counter], Integer.parseInt(splitGrades[1]));
                    counter++;
                }
                courseGrades.add(grades);
            } catch (Exception exceptionWithCourse3) {
                System.out.println("Data error occurred while reading the information about courses of student 3 Please correct the information.");
                courseIDs.add("N/A");
                courseTitles.add("N/A");
                courseTeachers.add("N/A");
                courseGrades.add(null);
                break;
            }
        }


//        System.out.println(studentNames.toString() + "\n" + studentIDs.toString() + "\n" + courseIDs.toString() + "\n"
//                + courseTitles.toString() + "\n" + courseTeachers.toString());
//        System.out.println(courseGrades);
//        System.out.println("\n");
*/
    }
}

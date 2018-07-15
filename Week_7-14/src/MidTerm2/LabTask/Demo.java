package MidTerm2.LabTask;

public class Demo {
    public static void main(String[] args) {
        Human human1 = new Human("John", 20);
        System.out.println(human1);
        System.out.println();

        Student student1 = new Student("Arman", 18, 50,60,70,80);
        Student student2 = new Student("Maksat", 20, 50,50,50,50);
        Student student3 = new Student("Salamat", 19, 90,60,100,80);
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();
        System.out.println(student3);
        System.out.println();

        Teacher teacher1 = new Teacher("Kevin", 40,"Biology", student1,student2,student3);
        System.out.println(teacher1);
    }
}

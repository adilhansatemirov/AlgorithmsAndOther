package Week12.LabPerson;

public class Demo {
    public static void main(String[] args) {
        Person myPerson = new Person("Nursultan","Ak Orda");
        Student myStudent = new Student("Zhakizhan","Abylaikhana 1/1", "Informational Systems",
                2,400.5);
        Staff myStaff = new Staff("Sultan", "Zheleznodarozhnaya 41", "Gymnazium #3", 200.5);

        System.out.println(myPerson.toString());
        System.out.println();
        System.out.println(myStudent.toString());
        System.out.println();
        System.out.println(myStaff.toString());
    }
}

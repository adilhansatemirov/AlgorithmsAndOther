package MidTerm2.LabTask;

public class Student extends Human {
    private int quizGrade;
    private int homeworkGrade;
    private int midtermGrade;
    private int finalGrade;

    Student(String name, int age, int quizGrade, int homeworkGrade, int midtermGrade, int finalGrade){
        super(name, age);
        this.quizGrade = quizGrade;
        this.homeworkGrade = homeworkGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public void setQuizGrade(int quizGrade){
        this.quizGrade = quizGrade;
    }
    public int getQuizGrade(){
        return quizGrade;
    }
    public int getHomeworkGrade() {
        return homeworkGrade;
    }

    public void setHomeworkGrade(int homeworkGrade) {
        this.homeworkGrade = homeworkGrade;
    }

    public int getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(int midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getAverage(){
        return 0.1*quizGrade+0.1*homeworkGrade+0.3*midtermGrade+0.5*finalGrade;
    }

    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nQuiz Grade: "+quizGrade+"\nHomework Grade: "+
                homeworkGrade+"\nMidterm Grade: "+midtermGrade+"\nFinal Grade: "+finalGrade+"\nAverage Score: "+getAverage();
    }
}

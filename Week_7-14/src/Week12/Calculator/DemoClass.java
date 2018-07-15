package Week12.Calculator;

public class DemoClass {
    public static void main(String[] args) {
        SimpleCalculator newOne = new SimpleCalculator(1.5,2.5);
        System.out.println(newOne.additionDouble());
        newOne.showDetails();
    }
}

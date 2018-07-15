package Week12.Calculator;

public class SimpleCalculator {
    protected int numInt1, numInt2;
    protected double numDouble1, numDouble2;

    SimpleCalculator(){
        numInt1 = 0;
        numInt2 = 0;
        numDouble1 = 0;
        numDouble2 = 0;
        System.out.println("Object with empty parameters called.\n");
    }
    SimpleCalculator(int num1, int num2){
        this.numInt1 = num1;
        this.numInt2 = num2;
        System.out.println("Object with 'int' parameters was created.\n");
    }
    public int additionInt(){
        return this.numInt1+this.numInt1;
    }
    SimpleCalculator(double num1, double num2){
        this.numDouble1 = num1;
        this.numDouble2 = num2;
        System.out.println("Object with 'float' parameters was created.\n");
    }
    public double additionDouble(){
        return this.numDouble1+this.numDouble2;
    }
    public void showDetails(){
        System.out.println("\n===DETAILS===");
        System.out.println("Integer 1: "+this.numInt1);
        System.out.println("Integer 2: "+this.numInt2);
        System.out.println("Float 1: "+this.numDouble1);
        System.out.println("Float 2: "+this.numDouble2);
    }
}

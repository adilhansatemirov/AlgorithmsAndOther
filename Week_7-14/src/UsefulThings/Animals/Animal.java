package UsefulThings.Animals;

public class Animal implements animalAction{
    public String colour;
    public int numberOfEyes;
    public int numberOfLegs;
    public int numberOfEars;

    protected int weight;
    protected int height;

    private String typeOfFood;
    private int hoursOfSleep;
    private float kmToMove;

    Animal(){

    }
    Animal(String colour, int numberOfEyes, int numberOfEars, int numberOfLegs, int weight, int height){
        this.colour = colour;
        this.numberOfEars = numberOfEars;
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
        this.height = height;
    }

    public void eat(String typeOfFood){
        System.out.println("Animal eats "+ typeOfFood);
    }
    public void sleep(int hoursOfSleep){
        System.out.println("Animal sleeps "+hoursOfSleep);
    }
    public void run(float kmToMove){
        System.out.println("Animal sleeps "+kmToMove);
    }

    public void showDetails() {
        System.out.println("Animal: ");
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+colour);
    }
}

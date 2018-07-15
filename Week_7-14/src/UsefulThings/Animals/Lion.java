package UsefulThings.Animals;

public class Lion extends Animal implements animalAction{
    int numberOfTeeth;

    Lion(){

    }

    Lion(String colour, int numberOfEyes, int numberOfEars, int numberOfLegs, int weight, int height, int numberOfTeeth){
        super(colour, numberOfEyes, numberOfEars, numberOfLegs, weight, height);
        this.numberOfTeeth = numberOfTeeth;
    }

    public void eat(String typeOfFood){
        System.out.println("Lion eats "+ typeOfFood);
    }
    public void sleep(int hoursOfSleep){
        System.out.println("Lion sleeps "+hoursOfSleep);
    }
    public void run(float kmToMove){
        System.out.println("Lion sleeps "+kmToMove);
    }

    public void showDetails(){
        System.out.println("This is a lion. \nNumber of teeth: "+numberOfTeeth);
    }
}

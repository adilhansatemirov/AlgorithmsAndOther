package UsefulThings.Animals;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("Black",2,2,4,150,200);
        animal.showDetails();
        animal.eat("Bread.");
        Lion lion = new Lion("Orange",2,2,4,100,120,40);
        lion.showDetails();
        lion.eat("Meat");
    }
}




package DerekBanasJava.Inheriatnce;

public class MainClass {
    public static void main(String[] args) {
        Animals genericAnimal = new Animals();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        System.out.println();

        Cats morris = new Cats("Moris", "Tuna","Mouse");
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);
        System.out.println(morris.getFavToy());

        Animals tabby = new Cats("Tabby", "Salmon", "Ball");
        acceptAnimal(tabby);
//        System.out.println();
//        genericAnimal.walkAround();
    }

    public static void acceptAnimal(Animals randAnimal){
        System.out.println();
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println();
        randAnimal.walkAround();
        System.out.println();
        Cats tempCat = (Cats) randAnimal;
        System.out.println(tempCat.favToy);
    }
}

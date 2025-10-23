package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Mochii", 4, "Choco");
        Bird myBird = new Bird("Pretty", 2, 25.5);

        myDog.displayPetDetails();
        System.out.println();
        myCat.displayPetDetails();
    }
}
package Dog;

public class DogMain {
    //kani nga iro kay sa imagination lng po sir <3
    public static void main(String[] args) {
        Dog dog1 = new Dog(" Bobby ", " Husky");
        Dog dog2 = new Dog(" Mochi ", " K9 ");
        System.out.println(dog1.getName() + " is " + dog1.getBreed());
        System.out.println(dog2.getName() + " is " + dog2.getBreed());

        dog1.setName(" Milky ");
        dog1.setBreed(" Husky ");
         System.out.println(dog1.getName() + " is " + dog1.getBreed());
         dog2.setName(" Baddy ");
         dog2.setBreed(" Bulldog ");
         System.out.println(dog2.getName() + " is " + dog2.getBreed());



        
    }
    
}
    


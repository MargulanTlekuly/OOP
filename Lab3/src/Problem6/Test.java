package Problem6;
import Lab2.Person;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", 5);
        Dog dog2 = new Dog("Buddy", 3);

        System.out.println("--- Dog Tests ---");
        dog1.makeSound();
        dog1.play();

        Dog[] dogs = {dog1, dog2};
        Arrays.sort(dogs);
        System.out.println("Dogs sorted by age: " + Arrays.toString(dogs));

        System.out.println("\n--- PetOwner Tests ---");
        PetOwner owner1 = new PetOwner("Margulan", 20);

        owner1.play();

        owner1.assignPet(dog1);
        owner1.play();

        try {
            PetOwner clonedOwner = owner1.clone();
            System.out.println("Cloned owner name: " + clonedOwner.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

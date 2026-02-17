package pr3.animal.app;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Generic animal", 5));
        animals.add(new Dog("Alabay","Moynak",4));
        animals.add(new Dog("Tobet","Ayu",5));

        for(Animal a : animals){
            a.getInfo();
            a.makeSound();

            System.out.println("----------------------");
        }
    }


}

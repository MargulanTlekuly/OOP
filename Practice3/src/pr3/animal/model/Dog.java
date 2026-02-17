package pr3.animal.model;

public class Dog extends Animal{
    private String breed;

    public Dog(String breed, String name, int age){
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("The dog is barking...");
        System.out.println("Woof, woof!");
    }
    @Override
    public void eat(){
        System.out.println("The dog is eating...");
    }
    @Override
    public void eat(String food){
        System.out.println("The dog is eating " + food);
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(", Breed: " + breed);
    }
}

package Problem6;
import Lab2.Animal;

public class Dog extends Animal implements Comparable<Dog>, Cloneable, SoundMaker, Playable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof-woof!";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound());
    }

    @Override
    public void play() {
        System.out.println(getName() + " is running and catching a frisbee!");
    }

    @Override
    public int compareTo(Dog other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }
}

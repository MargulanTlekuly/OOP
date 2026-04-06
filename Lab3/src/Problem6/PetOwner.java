package Problem6;
import Lab2.Person;
public class PetOwner extends Person implements Comparable<PetOwner>, Cloneable, Playable{
    public PetOwner(String name, int age) {
        super(name, age);
    }

    @Override
    public String getOccupation() {
        return "Software Engineer";
    }

    @Override
    public void play() {
        if (hasPet()) {
            System.out.println(name + " is playing with their pet.");
        } else {
            System.out.println(name + " has no pet to play with.");
        }
    }

    @Override
    public int compareTo(PetOwner other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public PetOwner clone() throws CloneNotSupportedException {
        return (PetOwner) super.clone();
    }
}

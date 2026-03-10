package Problem5;

public class Fish extends Animal{
    public Fish(String name, int age){
        super(name, age);
    }

    public String getSound(){
        return "Blub";
    }

    public String toString(){
        return "Fish: " + super.toString();
    }
}

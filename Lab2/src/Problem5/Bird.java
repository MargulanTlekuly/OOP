package Problem5;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    public String getSound(){
        return "Tweet";
    }

    public String toString(){
        return "Bird: " + super.toString();
    }
}

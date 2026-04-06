package Problem2;

public class Bird implements Flyable{
    @Override
    public void move(){
        System.out.println("Bird is moving");
    }

    @Override
    public void fly() {
        System.out.println("Bird id flying");
    }
}

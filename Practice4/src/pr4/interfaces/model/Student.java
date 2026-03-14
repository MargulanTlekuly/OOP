package pr4.interfaces.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Comparable<pr4.interfaces.model.Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public int compareTo(pr4.interfaces.model.Student other) {
        return Double.compare(this.getGpa(), other.getGpa());
    }
    @Override
    public String toString() {
        return name + ": " + gpa;
    }
    @Override
    public void eatPizza(){
        System.out.println("Student eats Pizza...");
    }
}

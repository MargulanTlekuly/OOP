package Problem5;

public class Chocolate implements Comparable<Chocolate>{
    private String name;
    private double weight;

    public Chocolate(String name, double weight){
        this.name=name;
        this.weight=weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return "Name: " + name + " | Weight: " + weight;
    }
    @Override
    public int compareTo(Chocolate other){
        return Double.compare(this.weight, other.weight);
    }

}

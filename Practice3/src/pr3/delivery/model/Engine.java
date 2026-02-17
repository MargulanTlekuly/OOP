package pr3.delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    public Engine(String type, double horsePower){
        this.type=type;
        this.horsePower=horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void getEngineInfo(){
        System.out.println("Type: " + type + ", Horse Power: " + horsePower);
    }
}

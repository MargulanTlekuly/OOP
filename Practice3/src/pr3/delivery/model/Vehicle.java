package pr3.delivery.model;

public class Vehicle {
    private String model;
    private double baseCost;
    private Engine engine;

    public Vehicle(String model, double baseCost, Engine engine){
        this.model=model;
        this.baseCost=baseCost;
        this.engine=engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Engine getEngine() {
        return engine;
    }

    public double calculateDeliveryCost(){
        return baseCost;
    }

    public String getVehicleInfo(){
        return "Model: " + model + ", Base Cost: " + baseCost + " | Engine: [" + engine.getType() + ", " + engine.getHorsePower() + " HP]";
    }
}

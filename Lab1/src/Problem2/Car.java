package Problem2;
enum FuelType{
    PETROL,
    DIESEL,
    ELECTRIC
}
public class Car {
    private final String model;
    private FuelType fuelType;
    private static int carCount = 0;
    private final int id;

    {
        carCount++;
        id = carCount;
    }
    public Car(String model, FuelType fuelType){
        this.model = model;
        this.fuelType = fuelType;
    }
    public void setFuelType(FuelType fuelType){
        this.fuelType = fuelType;
    }
    public void printInfo(){
        System.out.println("Car " + this.id + ":" + model + "(" + fuelType + ")");
    }
    public void drive(){
        System.out.println(model + "is driving...");
    }
    public void drive(int speed){
        System.out.println(model + " is driving at " + speed + " km/h...");
    }

    public static int getCarCount(){
        return carCount;
    }
}

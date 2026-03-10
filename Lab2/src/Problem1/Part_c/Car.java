package Problem1.Part_c;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model){
        super(brand,year);
        this.model=model;
    }

    @Override
    public boolean equals(Object o){
        if (!super.equals(o)){
            return false;
        }
        Car car = (Car) o;

        return model.equals(car.model);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(super.hashCode(), model);
    }
}

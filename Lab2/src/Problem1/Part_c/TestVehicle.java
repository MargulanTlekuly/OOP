package Problem1.Part_c;

import java.util.HashSet;

public class TestVehicle {
    public static void main(String[] args){
        HashSet<Car> carSet = new HashSet<>();

        Car car1 = new Car("Toyota", 2022, "Camry");
        Car car2 = new Car("Toyota", 2022, "Camry");

        carSet.add(car1);
        carSet.add(car2);

        System.out.println("Count of car: " + carSet.size());
    }
}

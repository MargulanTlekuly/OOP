package Problem2;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Toyota",FuelType.DIESEL);
        Car car2 = new Car("BMW", FuelType.PETROL);

        car1.printInfo();
        car1.drive();
        car1.drive(120);

        car2.printInfo();
        car2.drive();
        car2.drive(160);

        System.out.println("Count of cars: " + Car.getCarCount());
    }
}

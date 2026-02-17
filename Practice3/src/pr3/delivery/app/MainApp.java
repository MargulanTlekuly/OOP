package pr3.delivery.app;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args){
        Engine petrolEngine = new Engine("V6 Petrol", 300);
        Engine dieselEngine = new Engine("V8 Diesel", 500);

        Car myCar = new Car(5,"BMW M5", 1000, petrolEngine);
        Truck myTruck = new Truck(20000,"Volvo FH16", 2000, dieselEngine);

        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(myCar);
        fleet.add(myTruck);

        DeliveryService service = new DeliveryService();

        System.out.println("--- Fleet Info ---");
        service.printAllVehicles(fleet);

        System.out.println("\n--- Individual Costs ---");
        service.calculateAllDeliveries(fleet);

        System.out.println("\n--- Total ---");
        service.calculateTotalCost(fleet);

        // Overload жасалған әдісті тексеру
        System.out.println("\nTruck with distance (500km, 2.5$): " + myTruck.calculateDeliveryCost(500, 2.5));
    }
}

package pr3.delivery.service;

import pr3.delivery.model.Vehicle;

import java.util.List;
import java.util.Vector;

public class DeliveryService {
    public void printAllVehicles(List<Vehicle> vehicles){
        for (Vehicle v: vehicles){
            System.out.println(v.getVehicleInfo());
        }
    }
    public void calculateAllDeliveries(List<Vehicle> vehicles){
        for (Vehicle v: vehicles){
            System.out.println(v.getModel() + " delivery cost: " + v.calculateDeliveryCost());
        }
    }
    public void  calculateTotalCost(List<Vehicle> vehicles){
        double total=0;
        for (Vehicle v: vehicles) {
           total=total+v.calculateDeliveryCost();
        } System.out.println("Total delivery cost for all vehicles: " + total);
    }
}

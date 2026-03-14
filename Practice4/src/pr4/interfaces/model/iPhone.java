package pr4.interfaces.model;

public class iPhone implements SellableAndPluggable {
    @Override
    public void setPrice(double price){
        System.out.println("iPhone price: " + price);
    }
    @Override
    public void plugIn(){
        System.out.println("iPhone is charging...");
    }
}

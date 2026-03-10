package Problem1.Part_c;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand=brand;
        this.year=year;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setYear(int year){
        this.year=year;
    }

    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        } else if(getClass() != o.getClass()){
            return false;
        }
        Vehicle vehicle = (Vehicle) o;

        return year == vehicle.year && brand.equals(vehicle.brand);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(brand, year);
    }
}

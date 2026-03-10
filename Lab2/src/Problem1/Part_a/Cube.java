package Problem1.Part_a;

public class Cube extends Shape3D {
    private double rib;

    public Cube(double rib){
        this.rib=rib;
    }

    @Override
    public double volume(){
        return rib*rib*rib;
    }
    @Override
    public double surfaceArea(){
        return 6*(rib*rib);
    }
}

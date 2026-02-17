package Problem3;

public class TemperatureTest {
    public static void main(String[] args){
        Temperature temp = new Temperature(100, 'F');
        System.out.println("Celsius: " + temp.getCelsius() + " C");
        System.out.println("Fahrenheit: " + temp.getFahrenheit() + " F" );
    }
}

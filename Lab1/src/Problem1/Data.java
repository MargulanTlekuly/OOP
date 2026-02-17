package Problem1;

public class Data {
    private double sum;
    private int count;
    private double max;

    public Data(){
        sum = 0;
        count = 0;
        max = 0;
    }
    public void addValue(double value){
        sum += value;
        count++;
        if(value>max){
            max = value;
        }
    }
    public double getAverage(){
        if(count == 0){
            return 0;
        }else{
            return sum/count;
        }
    }
    public double getMax(){
        if(count == 0){
            return 0;
        }else{
            return max;
        }
    }
}

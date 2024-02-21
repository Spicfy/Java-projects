public class Arithmetic extends AbstractSeries {
    private int value = 1;
    private double count = 0;
    public double next(){
        count = count + value;
        value ++;
        return count;
    }
}

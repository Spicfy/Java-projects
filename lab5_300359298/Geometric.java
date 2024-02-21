public class Geometric extends AbstractSeries{
    int i = 0;
    double count = 1;
    double mult = 0.5;
    public double next(){

        if(i >= 1){
            count = count + mult;
            mult /= 2;
            
        }
        else{

        }
        i ++;
        return count;
    }
    public static void main(String[] args) {
        Geometric geo = new Geometric();
        System.out.println(geo.next());
        System.out.println(geo.next());
        System.out.println(geo.next());
    }
}

public abstract class AbstractSeries implements Series{

    public double[] take(int k){
        double[] partialSums = new double[k];
        for(int i = 0; i<k; i++){
            partialSums[i] = next();
        }
        return partialSums;
    }
}

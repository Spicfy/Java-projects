public class Q3_SquareArray {
    public static int[] createArray(int size) {
        int[] sqrarray;
        sqrarray = new int[size + 1];
        for (int i = 0; i <= size; i ++){
            sqrarray[i] = i * i;

        }
        return sqrarray;
    }
    public static void main(String[] args) {
        int[] twelvearr = createArray(12);
        for(int i = 0; i <= 12; i ++){
            System.out.println("The square of " + i + " is "+ twelvearr[i]);
        }
    }

}

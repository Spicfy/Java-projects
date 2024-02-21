import java.util.Scanner;
public class Q6 {
    public static void sort(double[] xs){
        
        int i, j, argMin; 
        double tmp;

        for (i = 0; i < xs.length - 1; i++) {
            argMin = i;
            for (j = i + 1; j < xs.length; j++) {
                if (xs[j] < xs[argMin]) {
                    argMin = j;
                }
            }

            tmp = xs[argMin];
            xs[argMin] = xs[i];
            xs[i] = tmp;
        }
    }
    public static void main(String[] args) {
        double[] arr = {92.5, 55.5, 32.5, 74.5, 50.0};
        System.out.println(calculateMedian(arr));
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];
        int i = 0;
        while (i<10) {
            System.out.println("Enter a grade: ");
            grades[i] = scanner.nextDouble();
            i++;
        }
        scanner.close();
        System.out.println("average "+calculateAverage(grades));
        System.out.println("median "+calculateMedian(grades));
        System.out.println("Fails "+calculateNumberFailed(grades));
        System.out.println("passed "+calculateNumberPassed(grades));
    }
    public static double calculateAverage(double[] notes){
        double sum = 0.0;
        for (double note: notes){
            sum += note;
        }
        double avg = sum/notes.length;
        return avg;

    }
    public static double calculateMedian(double[] notes){
        sort(notes);
        if (notes.length % 2 == 0){
		    return (notes[notes.length/2 - 1] + notes[notes.length/2])/2.0;
        }
        else{
            return ( notes[(notes.length - 1)/2]);
        }
	}
    public static int calculateNumberFailed(double[] notes){
		int fails = 0;
        for (double i: notes){
            if (i < 50){
                fails += 1;
            }
        }
        return fails;
	}
    public static int calculateNumberPassed(double[] notes){
		int fails = calculateNumberFailed(notes);
        int passes = notes.length - fails;
        return passes;
	}
}

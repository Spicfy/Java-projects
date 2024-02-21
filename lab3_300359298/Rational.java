public class Rational {
    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
	     this.numerator = numerator;
         denominator = 1;
    }

    public Rational(int numerator, int denominator) {
	     this.numerator = numerator;
         this.denominator = denominator;
         if(this.denominator < 0){
            this.numerator *= -1;
            this.denominator *= -1;
         }
         reduce();
    }

    // getters

    public int getNumerator() {
	     return numerator;
    }

    public int getDenominator() {
	     return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
        int multi = this.denominator*other.denominator;
        int numer = this.numerator*other.denominator + other.numerator*this.denominator;
        Rational sum = new Rational(numer, multi);
        return sum;
    }

    public static Rational plus(Rational a, Rational b) {
    	int d = a.getDenominator()*b.getDenominator();
        int n = a.getNumerator()*b.getDenominator() + b.getNumerator()*a.getDenominator();
        Rational sum = new Rational(n, d);
        return sum;
    }

    // Transforms this number into its reduced form

    private void reduce() {
      int gcd = gcd(numerator, denominator);
      numerator /= gcd;
      denominator /= gcd;

    }

 

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
      // Note that the loop below, as-is, will time out on negative inputs.
      // The gcd should always be a positive number.
      // Add code here to pre-process the inputs so this doesn't happen.

    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
      return this.numerator*other.denominator - other.numerator*this.denominator;
    }

    public boolean equals(Rational other) {
      if(this.numerator == other.numerator &&this.denominator == other.denominator){
        return true;
      }
      return false;
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    return ""+numerator;
    	} else {
    	    return numerator+"/"+denominator;
    	}
    }
}

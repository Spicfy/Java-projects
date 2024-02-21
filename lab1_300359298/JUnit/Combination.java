public class Combination{
    private int first;
    private int second;
    private int third;

    // Instance variables.
    // Remove this comment and declare your instance variables here

    // Constructor
    public Combination( int first, int second, int third ) {
        // Your code here
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        if(other==null){
           return false;
        }
        else{
            if(this.first == other.first && this.second == other.second && this.third == other.third){
                return true;
            }
            else{
                return false;
            }
        }
    }

    // Returns a String representation of this Combination.

    public String toString() {
        // Put your code here and remove the line below
        return "\""+this.first +":"+this.second+":"+this.third+"\"";
    }
    public static void main(String[] args){
        Combination c1, c2, c3;
        c1 = new Combination(1, 2, 3);
        c2 = new Combination(1, 2, 3);
        c3 = new Combination(3, 2, 1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
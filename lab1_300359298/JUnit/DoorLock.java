public class DoorLock {
    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        this.combination = combination;
        this.open = false;
        this.activated = true;
        this.numberOfAttempts = 0;
    }

    // Access methods.

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    // Notice that numberOfAttempts is compared to
    // MAX_NUMBER_OF_ATTEMPTS only when its value has been
    // incremented, Also, numberOfAttempts should be set to zero when
    // activated is false.  Problems related to the combined action of
    // these two variables have caused problems for some students.

    public boolean open( Combination combination ) {
        if(isActivated() == true && isOpen() == false){
            if(this.combination.equals(combination)){
                open = true;
                this.numberOfAttempts = 0;
                return true;

            }
            else{
                this.numberofAttempts ++;
                if(this.numberofAttempts >= MAX_NUMBER_OF_ATTEMPTS){
                    activated = false;
                    this.numberOfAttempts = 0;
                    return false;
                }
            }
        }
        return false;
    }

    public void activate( Combination c ) {
        if(this.combination.equals(c)){
            activated = true;
        }
        else{
            activated = false;
        }
        // Put your code here, then remove this comment.
    }

}

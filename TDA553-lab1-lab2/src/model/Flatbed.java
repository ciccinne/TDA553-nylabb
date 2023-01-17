

public class Flatbed implements IPlatform {
    private int state;                               // State = 1; platformen är uppe, state = 0; plattformen är nere.

    public Flatbed() {
        this.state = 1;                    // Plattformen är uppe från start.
    }

    @Override
    public void notInUse() {
        state = 1;
    }

    public void lowerFlatbed() {
        state = 0;
    }

    @Override
    public boolean isInUse() {
        if (state == 0) {
            return true;
        }else{
            return false;
        }
        
    }
    
}

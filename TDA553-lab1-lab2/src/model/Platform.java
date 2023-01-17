
public class Platform implements IPlatform {
    private double platformAngle;

    public Platform() {
        this.platformAngle = 0;
    }

    public double getAngle() {
        return platformAngle;
    }
    
    @Override
    public void notInUse() {
        platformAngle = 0;
        
    }

    public void setAngle(double amount) {                                   // Amount är hur stor vilkel användaren vill att plattformen ska ha
        if (amount > 0 && amount <= 70)
        platformAngle = amount;
        
    }
    @Override
    public boolean isInUse() {
        if (getAngle() == 0) {
            return false;
        }else{
            return true;
        }
    }
}

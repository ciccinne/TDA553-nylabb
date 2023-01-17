
import java.awt.*;

public abstract class Truck extends MotorVehicle {
    private Trim trim;
    private IPlatform platform;
    private final static double trimFactor = 1.25;
        
    public Truck(int nrDoors, Color color, int enginePower, String modelName, double X, double Y, double trimFactor, IPlatform platform) {
        super(nrDoors, color, enginePower, modelName, X, Y);
        this.trim = new Trim(trimFactor, 100);
        this.platform = platform;
    }

    @Override                                                              // Kopierade direkt från Volvo240
    protected double speedFactor(){
        return trim.speedFactor();
    }

    @Override
    public void gas(double amount){
        if (!(platform.isInUse())) {
            super.gas(amount);
        }
    }
}
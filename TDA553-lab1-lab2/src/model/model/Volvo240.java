package model;
import java.awt.*;

public class Volvo240 extends Car  {
    private Trim trim;
    
    public Volvo240(int x, int y, double trimFactor){
        super(4, Color.black, 100, "Volvo240", x, y);
        this.trim = new Trim(trimFactor, 100);
    }

    @Override 
    protected double speedFactor(){
        return trim.speedFactor();
    }
}

package model;
import java.awt.*;

public class Saab95 extends Car {  
    private Turbo turboFunction;
    
    public Saab95(int X, int Y) {     
        super(4, Color.red, 125, "Saab95", X, Y);              
	    this.turboFunction = new Turbo(1, 1.3, 125);
        turboFunction.setTurboOff();
    }

    public void turboOn(){
        turboFunction.setTurboOn(); 
    }


    @Override // Ska overridea
    protected double speedFactor(){  
        return turboFunction.speedFactor();
    }
}

    
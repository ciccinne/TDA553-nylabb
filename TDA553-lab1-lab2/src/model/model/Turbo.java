package model;

public class Turbo {
    private boolean turboOn;
    private double turboOffValue;
    private double turboOnValue;
    private double enginePower;

    public Turbo(double turboOffValue, double turboOnValue, double enginePower) {
        this.turboOn = false;
        this.turboOffValue = turboOffValue;
        this.turboOnValue = turboOnValue;
        this.enginePower = enginePower;  
    }

    public double getTurboValue() {
        if (turboOn) {
            return turboOnValue;
        }else{
            return turboOffValue;
        }
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){   
	    turboOn = false;
    }

    public double speedFactor(){
        return enginePower * 0.01 * getTurboValue();                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }

}

package model;

public class Trim {
    private double trimFactor;
    private double enginePower;
    
    public Trim(double trimFactor, double enginePower) {
    this.trimFactor = trimFactor;
    this.enginePower = enginePower;
}

    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;                     // getEnginePower() ist för att kalla på attributet enginePower (enginePower är ju private i Car)
    }

}

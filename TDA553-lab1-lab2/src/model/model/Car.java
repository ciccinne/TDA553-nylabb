
package model;
import java.awt.*;

public abstract class Car extends MotorVehicle {
    
    public Car(int nrDoors, Color color, int enginePower, String modelName, double X, double Y) {
        super(nrDoors, color, enginePower, modelName, X, Y);
    }
}

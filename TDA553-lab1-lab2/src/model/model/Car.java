
package model;
import java.awt.*;

public abstract class Car extends MotorVehicle {
    
    public Car(int nrDoors, Color color, int enginePower, String modelName, int X, int Y) {
        super(nrDoors, color, enginePower, modelName, X, Y);
    }
}

import model.*;
import controller.CarController;
import controller.Time;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<MotorVehicle> vehicles = new ArrayList<>();

        vehicles.add(new Volvo240(0, 0, 1.3));
        vehicles.add(new Saab95(0, 100));
        vehicles.add(new Scania(0, 200, 1.3));

        CarController cc = new CarController(vehicles);

        DrawPanel view = new DrawPanel(850, 800-250, vehicles);
        Time timer = new Time();
        for (MotorVehicle car : vehicles) {timer.addObserver(car);}
        timer.addObserver(view);

        new CarView("CarSim 1.0", cc, view);

        timer.start();        
    }
}

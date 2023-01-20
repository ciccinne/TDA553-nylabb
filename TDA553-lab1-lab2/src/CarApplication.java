import model.*;
import controller.CarController;
import controller.Timekeeper;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        List<MotorVehicle> cars = new ArrayList<>();

        cars.add(new Volvo240(0, 0, 1.3));
        cars.add(new Saab95(0, 0));
        cars.add(new Scania(0, 0, 1.3));

        CarController cc = new CarController(cars);

        Timekeeper timer = new Timekeeper();
        for (MotorVehicle car : cars) {timer.addObserver(car);}

        DrawPanel view = new DrawPanel(850, 800-250);
        timer.addObserver(view);

        new CarView("CarSim 1.0", cc, view);

        timer.start();        
    }
}

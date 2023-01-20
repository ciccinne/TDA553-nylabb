
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

import controller.Config;
import controller.IObserver;
import model.MotorVehicle;
import view.DrawPanel;

public class Timekeeper {
    private final int delay = Config.getDelay();
    private final Timer timer;
    private final List<IObserver> observers;

    public Timekeeper() {
        observers = new ArrayList<>();
        timer = new Timer(delay, e -> {
            for (IObserver o : observers) {o.update();}
        });
    }

    public void addObserver(IObserver o) {
        observers.add(o);
    }

    public void start() {
        timer.start();
    }
}


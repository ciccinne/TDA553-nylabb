package controller;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class Time {
    private final int delay = Configuration.getDelay();
    private final Timer timer;
    private final List<IObserver> observers;

    public Time() {
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


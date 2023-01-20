package controller;

import java.util.List;
import java.awt.*;
import javax.swing.*;

import model.MotorVehicle;

public class StopButton extends JButton{
    private final int X = Configuration.getWidth();

    public StopButton(List<MotorVehicle> cars) {
        super("Stop all cars");

        setBackground(Color.red);
        setForeground(Color.black);
        setPreferredSize(new Dimension(X/5-15,200));

        addActionListener(actionListener -> {
            for (MotorVehicle car : cars) {car.stopEngine();}
        });
    }
}

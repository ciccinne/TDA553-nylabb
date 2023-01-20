package controller;

import java.util.List;
import java.awt.*;
import javax.swing.*;

import model.MotorVehicle;

public class StartButton extends JButton{
    private final int X = Config.getWidth();

    public StartButton(List<MotorVehicle> cars) {
        super("Start all cars");

        setBackground(Color.blue);
        setForeground(Color.green);
        setPreferredSize(new Dimension(X/5-15,200));

        addActionListener(actionListener -> {
            for (MotorVehicle car : cars) {car.startEngine();}
        });
    }
}


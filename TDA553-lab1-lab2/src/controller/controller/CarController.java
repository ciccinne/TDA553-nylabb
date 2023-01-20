package controller;
import javax.swing.*;

import model.*;

import java.awt.BorderLayout;
import java.util.List;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JPanel{
    public CarController(List<MotorVehicle> cars) {

        GasSpinner gasSpinner = new GasSpinner();
        JPanel gasPanel = new JPanel();
        JLabel gasLabel = new JLabel("Amount of gas");
        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);

        add(gasPanel);
        add(new ControlPanel(cars, gasSpinner));
        add(new StartButton(cars));
        add(new StopButton(cars));

    }
}
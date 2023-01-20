package controller;

import model.MotorVehicle;
import java.util.List;
import javax.swing.*;

public class GasButton extends JButton{
    public GasButton(List<MotorVehicle> cars, GasSpinner spinner){
        super("Gas");
        addActionListener(actionlistener -> {
            for (MotorVehicle car : cars) {
                car.gas(spinner.getGasAmount());
            }
        });
    }
}

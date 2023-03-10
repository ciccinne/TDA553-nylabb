package view;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import controller.IObserver;
import model.MotorVehicle;
import java.util.List;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel implements IObserver{

    // Just a single image, TODO: Generalize
    BufferedImage volvoImage;
    BufferedImage saabImage;
    BufferedImage scaniaImage;
    private MotorVehicle volvo240;
    private MotorVehicle saab95;
    private MotorVehicle scania;
    

    // To keep track of a singel cars position
    //Point volvoPoint = new Point();
    //Point saab95Point = new Point();
    //Point scaniaPoint = new Point();

    // TODO: Make this genereal for all cars
    //void updateImageCoord(int x, int y){
    //    volvoPoint.x = x;
    //    volvoPoint.y = y;
    //    saab95Point.x = x;
    //    saab95Point.y = y + 100;
    //    scaniaPoint.x = x;
    //    scaniaPoint.y = y + 200;
    //}

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, List<MotorVehicle> cars) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        this.volvo240 = cars.get(0);
        this.saab95 = cars.get(1);
        this.scania = cars.get(2);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        //updateImageCoord(0, 0);

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawImage(volvoImage, volvo240.getX(), volvo240.getY(), null); // see javadoc for more info on the parameters
        g.drawImage(saabImage, saab95.getX(), saab95.getY(), null);
        g.drawImage(scaniaImage, scania.getX(), scania.getY(), null);
    }

    @Override
    public void update() {
        paintComponent(getGraphics());
    }
}

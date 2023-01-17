
import java.awt.*;

public class Scania extends Truck{                        // Static gör att det tillhör hela klassen. Ändrar vi värdet så ändras det för alla instanser av klassen, alltså inte unikt för varje instans.
    private IPlatform platform;

    public Scania(double X, double Y, double trimFactor, Platform platform) {
        super(2, Color.red, 100,"Scania", X, Y, trimFactor, platform);
        this.platform = platform;                                    // Composition -> vi skapar en instans av platform och lägger den som ett attrebut till instanserna av scania 
    }

    private Scania(double X, double Y, double trimFactor){
        this(X, Y, trimFactor, new Platform());
    }

    public void platformUp(double amount){   // Delegerar
        if (getCurrentSpeed() == 0) {
            platform.setAngle(amount);
        }
    }

}

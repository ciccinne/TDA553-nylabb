
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.Test;


public class testScania {
    @Test
    public void does_gas_not_gas_when_platform_is_up(){
        Scania scania = new Scania(2, Color.red, 125, "Saab95", 50, 50);
        scania.platformUp(30);
        scania.gas(0.5);
        assertEquals(0,scania.getCurrentSpeed());
    }
   

}


package org.toyota;

import org.toyota.car.details.*;
import org.toyota.car.models.*;


public class Runner {
    public static void main(String[] args) {

        Camry camry = FabricaCar.CamryGenerator(ColorCar.black, 800.90);
        Dyna dyna = FabricaCar.DynaGenerator(ColorCar.white, 1000.90);
        Hiance hiance = FabricaCar.HianceGenerator(ColorCar.silver, 950.90);
        Solara solara = FabricaCar.SolaraGenerator(ColorCar.red, 1990.90);
        System.out.println(camry.checkWheels());
        System.out.println(camry);
        camry.onMusic();
        dyna.chargePhone();
        hiance.headlightsOn();
        solara.fridge();
    }


}

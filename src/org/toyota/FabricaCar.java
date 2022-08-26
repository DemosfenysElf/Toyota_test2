package org.toyota;


import org.toyota.car.details.*;
import org.toyota.car.fabricadetails.*;
import org.toyota.car.models.*;

public class FabricaCar {

    public static Camry CamryGenerator(ColorCar colorCar, double priceCamry){
        return new Camry(colorCar, 200, TransmissionType.AUTOMATIC, false, priceCamry,
                FabricaGasTank.newGasTank(), FabricaWheelPack.generateWheels(CarWheelRadius.R17), FabricaEngine.newEngine(),
                FabricaElectrics.newElectrics(), FabricaHeadLights.newHeadLights(), CarWheelRadius.R17,
                FabricaCruiseControl.newCruiseControl(), FabricaUSB.newUSB());
    }

    public static Dyna DynaGenerator(ColorCar colorCar, double priceDyna){
        return new Dyna(colorCar, 140, TransmissionType.ROBOT, false, priceDyna,
                FabricaGasTank.newGasTank(), FabricaWheelPack.generateWheels(CarWheelRadius.R20), FabricaEngine.newEngine(),
                FabricaElectrics.newElectrics(), FabricaHeadLights.newHeadLights(), CarWheelRadius.R20,
                1000, FabricaSocket.newSocket());
    }
    public static Hiance HianceGenerator(ColorCar colorCar, double priceHiance){
        return new Hiance(colorCar, 120, TransmissionType.AUTOMATIC, false, priceHiance,
                FabricaGasTank.newGasTank(), FabricaWheelPack.generateWheels(CarWheelRadius.R20), FabricaEngine.newEngine(),
                FabricaElectrics.newElectrics(), FabricaHeadLights.newHeadLights(), CarWheelRadius.R20,
                1500, FabricaWheel.newWheel());
    }
    public static Solara SolaraGenerator(ColorCar colorCar, double priceSolara){
        return new Solara(colorCar, 250, TransmissionType.MECHANIC, false, priceSolara,
                FabricaGasTank.newGasTank(), FabricaWheelPack.generateWheels(CarWheelRadius.R16), FabricaEngine.newEngine(),
                FabricaElectrics.newElectrics(), FabricaHeadLights.newHeadLights(), CarWheelRadius.R16,
                FabricaRoof.newRoof(), FabricaMiniFridge.newMiniFridge());

    }


}

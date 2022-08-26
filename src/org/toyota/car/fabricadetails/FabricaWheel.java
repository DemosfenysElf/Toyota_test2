package org.toyota.car.fabricadetails;

import org.toyota.car.details.CarWheelRadius;
import org.toyota.car.details.Wheel;

public class FabricaWheel {
    public static Wheel newWheel(){
        return new Wheel(CarWheelRadius.R20);
    }
}

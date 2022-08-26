package org.toyota.car.fabricadetails;

import org.toyota.car.details.CarWheelRadius;
import org.toyota.car.details.Wheel;

public class FabricaWheelPack {
    public static Wheel[] generateWheels(CarWheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(carWheelRadius);
        }
        return wheels;
    }
}

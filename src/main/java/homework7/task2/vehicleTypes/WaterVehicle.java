package homework7.task2.vehicleTypes;

import homework7.task2.Passengers;
import homework7.task2.Vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}

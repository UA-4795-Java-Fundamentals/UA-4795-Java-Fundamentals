package homework7.task2.vehicleTypes;

import homework7.task2.Passengers;
import homework7.task2.Vehicle;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}

package homework7.task2.vehicleTypes;

import homework7.task2.Passengers;
import homework7.task2.Vehicle;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();
    public abstract void land();
}

package homework7.task2.flyingV;

import homework7.task2.vehicleTypes.FlyingVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {

    }
}

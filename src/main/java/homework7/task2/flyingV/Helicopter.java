package homework7.task2.flyingV;

import homework7.task2.vehicleTypes.FlyingVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Helicopter extends FlyingVehicle {
    private final int weight;
    private final int maxHeight;


    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {

    }
}

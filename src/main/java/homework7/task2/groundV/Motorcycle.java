package homework7.task2.groundV;

import homework7.task2.vehicleTypes.GroundVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers,int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
    }
}

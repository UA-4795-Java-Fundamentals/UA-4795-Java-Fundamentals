package homework7.task2.groundV;

import homework7.task2.vehicleTypes.GroundVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
    }
}

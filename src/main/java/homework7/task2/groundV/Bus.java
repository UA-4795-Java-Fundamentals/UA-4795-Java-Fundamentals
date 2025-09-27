package homework7.task2.groundV;

import homework7.task2.vehicleTypes.GroundVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends GroundVehicle {

    private String route;

    public Bus(int passengers,String route) {
        super(passengers);
        this.route=route;
    }


    @Override
    public void drive() {
    }
}

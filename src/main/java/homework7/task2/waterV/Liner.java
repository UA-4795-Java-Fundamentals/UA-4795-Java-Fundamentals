package homework7.task2.waterV;

import homework7.task2.vehicleTypes.WaterVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }
}

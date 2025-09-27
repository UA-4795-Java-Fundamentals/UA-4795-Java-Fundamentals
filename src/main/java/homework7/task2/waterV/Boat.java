package homework7.task2.waterV;

import homework7.task2.vehicleTypes.WaterVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }


    @Override
    public void isSailing() {
    }
}

package ex2;

public class Motorcycle extends GroundeVehicle{
    private int maxSpeed;
    public Motorcycle() {}

    @Override
    public void drive() {

    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

}

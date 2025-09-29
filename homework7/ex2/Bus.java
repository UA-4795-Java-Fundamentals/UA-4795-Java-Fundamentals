package ex2;

public class Bus extends GroundeVehicle{
    private String route;
    public Bus() {}

    @Override
    public void drive() {

    }
    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }

}

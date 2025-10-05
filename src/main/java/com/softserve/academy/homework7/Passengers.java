package com.softserve.academy.homework7;

abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

interface Vehicle {

}

abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();

    abstract void land();
}

abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}

class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("Liner with " + getPassengers() + " passengers is sailing " + floors + " floors!");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat with " + getPassengers() + " passengers. Volume " + volume);
    }
}

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void land() {
        System.out.println("Plane with " + getPassengers() + " passengers is Flying. Max distance " + maxDistance);
    }

    @Override
    void fly() {
        System.out.println("Plane has landed safely.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int passengers, int maxHeight, int weight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter with " + getPassengers() + " passengers flying with max height " + maxHeight);
    }

    @Override
    void land() {
        System.out.println("Helicopter has landed safely. Weight " + weight);
    }
}

class Bus extends GroundVehicle {
    String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("Bus with " + getPassengers() + " passenger is driving along route " + route);
    }
}

class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle with " + getPassengers() + " passengers is driving with max speed " + maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("Car with " + getPassengers() + " passengers. Model " + model);
    }
}
class TestingPassengers {
    public static void main(String[] args) {
        WaterVehicle liner = new Liner(2000, 70);
        WaterVehicle boat = new Boat(50, 500);

        FlyingVehicle plane = new Plane(180, 5000);
        FlyingVehicle helicopter = new Helicopter(5, 2000, 3000);

        GroundVehicle bus = new Bus(40, "Route 24");
        GroundVehicle car = new Car(5, "Lada");
        GroundVehicle motorcycle = new Motorcycle(2, 300);

        liner.isSailing();
        boat.isSailing();

        plane.fly();
        plane.land();
        helicopter.fly();
        helicopter.land();

        bus.drive();
        car.drive();
        motorcycle.drive();
    }
}
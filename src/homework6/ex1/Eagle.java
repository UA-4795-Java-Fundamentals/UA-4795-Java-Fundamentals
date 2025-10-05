package ex1;

public class Eagle extends FlyingBird{

    public Eagle() {
        this.layEggs = true;
        this.feathers = true;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "Eagle{" + "feathers= " + feathers + ", layEggs= " + layEggs + '}';
    }
}

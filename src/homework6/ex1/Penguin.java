package ex1;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        this.layEggs = true;
        this.feathers = true;
    }
    @Override
    public void fly() {
        super.fly();

    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

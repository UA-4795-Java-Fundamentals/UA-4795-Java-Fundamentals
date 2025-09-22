package ex1;

public class Kiwi extends NonFlyingBird{
    public Kiwi() {
        this.layEggs = true;
        this.feathers = true;
    }
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "layEggs=" + layEggs +
                ", feathers=" + feathers +
                '}';
    }
}

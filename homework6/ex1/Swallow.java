package ex1;

public class Swallow extends FlyingBird{

    public Swallow(){
        this.layEggs = true;
        this.feathers = true;
    }
    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}

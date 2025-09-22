package ex1;

public abstract class FlyingBird extends Bird {
    public FlyingBird() {
        this.layEggs = true;
        this.feathers = true;
    }
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flying");
    }
}
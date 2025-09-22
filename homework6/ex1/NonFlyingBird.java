package ex1;

public abstract class NonFlyingBird extends Bird{
    public NonFlyingBird() {
        this.layEggs = true;
        this.feathers = false;
    }

    public void fly() {
        System.out.println(getClass().getSimpleName() + " can't fly");
    }

}

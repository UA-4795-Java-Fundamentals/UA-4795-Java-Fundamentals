package homework6.task1;

public abstract class Bird {
    protected String feathers;
    protected String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();
}




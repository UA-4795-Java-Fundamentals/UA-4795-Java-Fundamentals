package homework6.task1;

public class NonFlyingBird extends Bird {
   
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    
    public void fly() {
        System.out.println("Not Flying Bird");
    }
}
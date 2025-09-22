package homework6.task1;

public class FlyingBird extends Bird {
   
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    
    public void fly() {
        System.out.println("Flying Bird");
    }
}
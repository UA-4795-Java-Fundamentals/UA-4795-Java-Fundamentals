package homework6.task1;

public class RunBird {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Brown feathers", "2 eggs");
        birds[1] = new Swallow("Gray feathers", " 5 eggs");
        birds[2] = new Penguin("Black & White feathers", "1 eggs");
        birds[3] = new Kiwi("Brown feathers", "2 eggs");

        for (Bird bird : birds) {
            System.out.println("Type: " + bird.getClass().getSimpleName());
            bird.fly();
            System.out.println("Feathers: " + bird.feathers + ", LayEggs: " + bird.layEggs);
            System.out.println("==========");
        }
    }
}

package ex1;

import lombok.ToString;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
            Bird eagle = new Eagle();
            Bird swallow = new Swallow();
            Bird kiwi = new Kiwi();
            Bird penguin = new Penguin();

            Bird[] birds= {eagle, swallow, kiwi, penguin};
            System.out.println(Arrays.toString(birds));

            for (Bird bird : birds) {
                bird.fly();
            }
    }
}


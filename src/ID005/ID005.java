package ID005;

import java.util.Random;

public class ID005 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.ints(10,5,10).sum();
        System.out.println(n%100);
    }
}

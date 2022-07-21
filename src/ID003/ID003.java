package ID003;

import java.util.Random;
import java.util.stream.IntStream;

public class ID003 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int total = IntStream.rangeClosed(1, 100).limit(rnd.nextInt(50)).sum();
        System.out.printf("total=%d/n",total);
    }
}

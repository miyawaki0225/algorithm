package ID004;

import java.util.Random;

public class ID004 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] rnd_array = rnd.ints(1,10).limit(3).toArray();
        int result = 1;
        for(int i:rnd_array){
            System.out.printf("%d ",i);
            result*=i;
        }
        System.out.println();
        System.out.println(result);
    }
}

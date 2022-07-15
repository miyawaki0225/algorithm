package ID002;

import java.util.Random;

public class ID002 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = rnd.ints(3,0,100).toArray();
        int total = Integer.valueOf(0);
        for(int num:array){
            System.out.printf(num+" ");
            total+=num;
        }
        System.out.println();
        System.out.printf("total=%4d\n",total);
    }
}

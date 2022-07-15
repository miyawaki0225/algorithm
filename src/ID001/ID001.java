package ID001;

import java.util.Random;

class ID001{
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int apple = 5;
        int orange = rnd.nextInt(100);

        System.out.printf("total:%3d個\n",apple+orange);
    }
}
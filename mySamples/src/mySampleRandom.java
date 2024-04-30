import java.util.Random;

public class mySampleRandom {
    public static void main(String[] args) {

        Random randomInt = new Random();
        for(int i=0; i<100; i++)
            System.out.println(randomInt.nextInt(100));
    }
}

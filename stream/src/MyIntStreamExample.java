import java.util.Random;
import java.util.stream.IntStream;

public class MyIntStreamExample {
    public static void main(String[] args) {

        IntStream intStream = IntStream.range(0, 100);
        int[] myArray = intStream.toArray();
        for (int i = 0; i < myArray.length - 1; i++)
            System.out.println(myArray[i]);

        intStream = IntStream.rangeClosed(0, 100);

        int[] myArray2 = intStream.toArray();
        for (int i = 0; i < myArray2.length - 1; i++)
            System.out.print(myArray2[i] + " ");


        //infinite stream
        intStream = IntStream.iterate(0, i -> i + 1).limit(100);
        int[] myArray3 = intStream.toArray();
        for (int i = 0; i < myArray3.length - 1; i++)
            System.out.print(myArray3[i] + " ");

        String str = IntStream.iterate(0, i -> i + 1)
                .limit(100)
                .mapToObj((s) -> String.valueOf(s))
                // Create a single string from all 25 numbers delimited by space
                .reduce("", (string, element) -> String.join(" ", string, element));

        System.out.print(str);


        // I cand do the same with Random
        Random random = new Random();
        IntStream randomStream = random.ints(100,0,100);
        int[] myArray4 = randomStream.toArray();
        for (int i = 0; i < myArray4.length - 1; i++)
            System.out.println(myArray4[i] + " ");

        String str2 = random.ints(100,0,100)
                .mapToObj((s) -> String.valueOf(s))
                // Create a single string from all 25 numbers delimited by space
                .reduce("", (string, element) -> String.join(" ", string, element));

        System.out.print(str2);

    }


}

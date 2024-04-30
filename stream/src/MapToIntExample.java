import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntExample {
    public static void main(String[] args) {

        // Using an IntStream
        System.out.println("Output from an IntStream using map");
        IntStream.iterate(5, (t) -> t + 5)
                .limit(5)
                .map((s) -> s * 1000)
                .forEach((s) -> System.out.print(s + " "));

        // Using a Stream<Integer>
        System.out.println("\nOutput from an Stream using mapToInt");
        Stream.<Integer>iterate(5, (t) -> t + 5)
                .limit(5)
                .mapToInt((s) -> s * 1000)
                .forEach((s) -> System.out.print(s + " "));

    }
}
/**
 Output from an IntStream using map
 5000 10000 15000 20000 25000
 Output from an Stream using mapToInt
 5000 10000 15000 20000 25000
 */
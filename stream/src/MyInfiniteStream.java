import java.util.function.Supplier;
import java.util.stream.Stream;




public class MyInfiniteStream {

    public static void main(String[] args) {
        Stream<Double> streamRandom = Stream.generate(Math::random);

    }
}

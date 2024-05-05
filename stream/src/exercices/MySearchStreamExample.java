package exercices;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class MySearchStreamExample {
    public static  void main(String[] args) {
        Optional<Integer> ifAny;
        Random random = new Random();
        ifAny = Stream.generate(() -> random.nextInt(100))
                .limit(10)
                .peek((s) -> System.out.print(s + ", "))
                .sorted(Comparator.naturalOrder())
                .peek((s) -> System.out.println("-----------"))
                .findAny();
        System.out.println("ifAny value is " + ifAny.get());

        Optional<Integer> findFirst;
        findFirst = Stream.generate(() -> random.nextInt(100))
                .limit(10)
                .peek((s) -> System.out.print(s + ", "))
                .sorted(Comparator.reverseOrder())
                .peek((s) -> System.out.println(s))
                .findFirst();
        System.out.println("findFirst  value is " + findFirst.get());

        //Filter Example pair numbers
        Stream.generate(() -> random.nextInt(100))
                .limit(10)
                .filter((s) -> s % 2 == 0)
                .forEach(System.out::println);

        List<Integer> list = List.of( 1,23,4,5,66,5,32,18,9,7,8,76,66,55);
        System.out.println(list.toString());
        System.out.println("odd numbers are : ");
        list.stream().filter((s) -> s % 2 != 0).forEach(System.out::println);
        System.out.println("pair numbers are : ");
        list.stream().filter((s) -> s % 2 == 0).forEach(System.out::println);
    }
}
/**
 32, 36, 69, 70, 56, 88, 60, 69, 98, 70, -----------
 ifAny value is 32
 21, 58, 35, 50, 74, 5, 66, 14, 3, 87, 87
 findFirst  value is 87
 */
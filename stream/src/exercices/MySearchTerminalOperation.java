package exercices;

import java.util.Optional;
import java.util.stream.Stream;

public class MySearchTerminalOperation {


    public static void main(String[] args) {


        Stream<String> stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John");
        Optional<String> str = stream.findFirst();
        str.ifPresent(System.out::println);

        stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John").peek(s -> System.out.print(s + " ")).sorted();
        str = stream.findAny();
        str.ifPresent(System.out::println);

        stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John").peek(s -> System.out.print(s + " ")).sorted();
        str = stream.findFirst();
        str.ifPresent(System.out::println);


        //allMatch
        stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John");
        Boolean ok = stream.allMatch((s) -> s.startsWith("A"));
        System.out.println("Are all the names starting with A " + ok);

        stream = Stream.of("Amber", "Antony", "August", "Anne");
        ok = stream.allMatch((s) -> s.startsWith("A"));
        System.out.println("Are all the names starting with A " + ok);

        stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John");
        ok = stream.anyMatch((s) -> s.startsWith("G") );
        System.out.println("Any name starts with G " + ok);

        stream = Stream.of();
        ok = stream.anyMatch((s) -> s.startsWith("G") );
        System.out.println("Any name starts with G " + ok);


        //count
        stream = Stream.of("Giuseppe", "Mary", "Elisabeth", "John");
        long tot = stream.count();
        System.out.println("tot is " + tot);

    }

}

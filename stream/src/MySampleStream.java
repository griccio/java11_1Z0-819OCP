import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MySampleStream {
    public static void main(String[] args) {

//        Stream<String> argStream = Stream.ofNullable("Hello");
//        argStream.forEach(s -> System.out.print( s + " " ));
//
//
//        Stream<String> argStreamNullable = Stream.ofNullable(null);
//        argStreamNullable.forEach(s -> System.out.print("This is the StreamNullable" +  s + " " ));
//
//        Stream mysStream = Stream.of(null);

//        Stream<Double> infiniteStream = Stream.generate(Math::random);
//        infiniteStream.limit(100).forEach((System.out::println));


//        List<String> succulentFruits = new ArrayList<>(List.of("grapes","melon","peach","tomato"));
//        Stream<String> stream = succulentFruits.stream();
//        stream.forEach(System.out::println);

//        //another infinite Stream
//        Stream<String> str_1 = Stream.iterate("AB", (s) ->  "A"  + s + "B");
//        str_1.limit(10).forEach(System.out::println);
//
//        //odd number
//        Stream<Integer> str_11 = Stream.iterate(0, n->n+1).filter(n ->n%2 !=0).limit(100);
//        str_11.forEach(System.out::println);
//

        Stream<String> germanCars = Stream.of("Mercedes","BMW","Audi","Volkswagen","Porsche");
        Stream<String> britishCars = Stream.of("Range Rover","Jaguar","Aston Martin","Rolls Royce","Morgan");
        Stream<String> italianCars = Stream.of("Ferrari","Maserati","Lamborghini");
        Stream<String> myFavouriteCars = Stream.concat(Stream.concat(germanCars,britishCars),italianCars);
        myFavouriteCars.forEach(System.out::println);

 }


}

package lambdas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuppliedInterfaceTests {


    public static void main(String[] args ){
        String[] dictionary = {"Angry", "Apple", "Art", "Ball", "Box",
                "Bump", "Cap", "Car", "Cone", "Dart", "Dog", "Duck"};


        // Consumer functional interface example
        // method return no value
        Consumer<String> str = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(0, "My Application: Supplied InterfaceTest: ");
            sb.insert(0,  LocalDateTime.now().toLocalTime() + ":");
            System.out.println(sb.toString());
        };

        str.accept("I want to log this statement");
        ArrayList<String> list = new ArrayList(Arrays.asList(dictionary));

        // consumer
        Consumer<String> toUpper = name -> System.out.println(name.toUpperCase());



        //Predicate functional Interface
        //method accept a value and return a boolean
        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        System.out.println("This is the list "+ list);
        list.forEach(toUpper);

        System.out.println("After toUpper " + list);
        list.removeIf(aWords);
        System.out.println("After remove " + list);

    }


}

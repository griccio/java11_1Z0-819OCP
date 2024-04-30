package exercices;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Voyage {
    public Integer id;
    public String route;

    public Voyage(){
    }
    public Voyage(String route){
        this.route = route;
    }
    @Override
    public String toString() {
        return "Voyage{" +
                "id=" + id +
                ", route='" + route + '\'' +
                '}';
    }
    static int counter = 1000;
    String[] routes = new String[]{"Mediterranean","Canarian", "Carribean",
            "Normandy","Egypt", "Scandinavian fjords","Saint Petersbourg",
            "Scotland", "Sicily","Nort Africa","Spain","South of England","Baleari","Greece"};

    //initializer
    {
       int i= new Random().nextInt(14);
       this.id = counter++;
       this.route = routes[i];
    }
}

public class MyMapOperationExample {

    public static void main(String[] args) {
        //I want to create a list of 20 Certificate
        List<Voyage> list = Stream.generate(Voyage::new).limit(20).collect(Collectors.toList());
//        list.forEach(System.out::println);

        //map each element into a string
        Set<String> set = list.stream()
//                .peek(System.out::print)
                .map((v) -> (v.id +" - " + v.route).toUpperCase() )
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

    }
}

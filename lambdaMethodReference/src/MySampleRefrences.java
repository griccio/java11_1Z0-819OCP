import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MySampleRefrences {
    public static void main(String[] args) {
        staticLambda();
        staticMethodReferences();
    }
    public static void staticLambda(){
        System.out.println("---------static  lambda --------------");
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,7,4,5));
        System.out.println("list =" + list);
        Consumer<List<Integer>> listConsumer = (l) -> Collections.sort(l);
        listConsumer.accept(list);
        System.out.println("list after the sorting = " + list);
    }

    public static void staticMethodReferences(){
        System.out.println("---------static  method references --------------");
        List<Integer> list = new ArrayList<Integer>(List.of(8,9,7,4,5));
        System.out.println("list =" + list);
        Consumer<List<Integer>> listConsumer = Collections::sort;
        listConsumer.accept(list);
        System.out.println("list after the sorting = " + list);
    }
}

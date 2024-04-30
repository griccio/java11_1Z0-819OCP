import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListMethod {
    public static void main(String[] args) {
        //creation and test of List.of
        List<Integer> l = new ArrayList(List.of(100,1,22,30,70, 100, 250));
        System.out.println("list l = " + l);
        l.add(45);
        System.out.println("add(45) list l = " + l);
        l.addAll(3,List.of(8,88,888,8888));
        System.out.println("addAll(8,88,888,8888) to list l = " + l);
        l=l.subList(0,5);
        System.out.println("subList(0,5) l = " + l);


        l.add(0,null);
        l.add(2,null);
        System.out.println(" l = " + l);
        l.add(null);
        System.out.println(" l = " + l);
        //test equals
        List<Integer> l1 = new ArrayList(List.of(1,2,3,4,5));
        List<Integer> l2 = new LinkedList<>(List.of(1,2,3,4,5));
        List<Integer> l3 = new LinkedList<>(List.of(5,4,3,2,1));
        System.out.println("l1 = " + l1.getClass().getName() + " " +l1);
        System.out.println("l2 = " + l2.getClass().getName() +" " + l2);
        System.out.println("l1.equals(l2) = " + l1.equals(l2) );
        System.out.println("l1.equals(l3) = " + l1.equals(l3) );

    }
}
/**
 list l = [100, 1, 22, 30, 70, 100, 250]
 add(45) list l = [100, 1, 22, 30, 70, 100, 250, 45]
 addAll(8,88,888,8888) to list l = [100, 1, 22, 8, 88, 888, 8888, 30, 70, 100, 250, 45]
 subList(0,5) l = [100, 1, 22, 8, 88]
 l = [null, 100, null, 1, 22, 8, 88]
 l = [null, 100, null, 1, 22, 8, 88, null]
 l1 = java.util.ArrayList [1, 2, 3, 4, 5]
 l2 = java.util.LinkedList [1, 2, 3, 4, 5]
 l1.equals(l2) = true
 l1.equals(l3) = false
 */
import java.util.*;

public class IterateOnASet {

    public static void main(String[] args) {
        Set<String>  vegetables = new HashSet<>(Set.of("carrot","pee","aubergine","sweetcorn","broccoli","courgette"));
        vegetables.add(null);
        for(Iterator<String> it = vegetables.iterator(); it.hasNext();){
            System.out.print(it.next() + ", ");
        }
        System.out.print("\n-------------------------------------\n");

        Set<String>  vegetables2 = new TreeSet<>(Set.of("carrot","pee","aubergine","sweetcorn","broccoli","courgette"));
        //vegetables2.add(null); // I cannot add null value
        vegetables2.forEach(s ->System.out.print(s + ", "));

        System.out.print("\n-------------------------------------\n");

        Set<String>  vegetables3 = new LinkedHashSet<>(List.of("carrot","pee","aubergine","sweetcorn","broccoli","courgette"));
        vegetables3.add(null);
        vegetables3.forEach(s ->System.out.print(s + ", "));

    }
}

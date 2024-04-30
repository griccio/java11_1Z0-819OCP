import java.util.*;

public class ListFromArray {
    public static void main(String[] args) {
        List<String> instruments = Arrays.asList(new String[]{"violin","flute","clarinet", "piano", "cello"});
        System.out.println("Instruments List is : " + instruments);
        //test search methods:
        System.out.println("Instruments list contains oboe? " + instruments.contains("oboe"));
        System.out.println("Instruments list contains flute? " + instruments.contains("flute"));

        List<String> woods = Arrays.asList("flute","clarinet");
        List<String> brass = new ArrayList<>();
        List<String> strings = new ArrayList<>() ;
        strings.add("violin");
        System.out.println("Instruments list contains wood instruments? " + instruments.containsAll(woods));

        //test compare method
        System.out.println("IS brass list empty? " + brass.isEmpty());
        System.out.println("IS strings list empty? " + strings.isEmpty());
        System.out.println("IS strings list equal brass? " + strings.equals(brass));

        //test manipulation
        List<String> instruments2 = new ArrayList(List.of("violin","piano"));
        List<String> woods2 = Arrays.asList("flute","oboe","clarinet"); //this list is mutable but I cannot change the dimension
        List<String> brass2 = List.of("trumpet","trombone"); //this list is immutable I can change nothing
        instruments2.addAll(woods2);
        instruments2.addAll(brass2);
        System.out.println("Instruments are: " + instruments2);
        instruments2.retainAll(woods2);
        System.out.println("Instruments are: " + instruments2);

        List<String> instruments2_2 = new ArrayList(List.of("violin","piano"));
        List<String> woods2_2 = Arrays.asList("flute","oboe","clarinet"); //this list is mutable but I cannot change the dimension
        List<String> brass2_2 = List.of("trumpet","trombone"); //this list is immutable I can change nothing
        instruments2_2.addAll(woods2_2);
        instruments2_2.addAll(brass2_2);
        System.out.println("Instruments are: " + instruments2_2);

        instruments2_2.removeAll(brass2_2);
        instruments2_2.remove("violin");
        instruments2_2.remove("piano");
        System.out.println("Instruments are: " + instruments2_2);
        System.out.println("Instruments is equals to woods : " + instruments2_2.equals(woods2_2));



        List<String> instruments3 = new ArrayList(List.of("violin","piano"));
        List<String> woods3 = Arrays.asList("flute","oboe","clarinet"); //this list is mutable but I cannot change the dimension
        List<String> brass3 = List.of("trumpet","trombone"); //this list is immutable I can change nothing
        instruments3.addAll(woods3);
        instruments3.addAll(brass3);
        System.out.println("Instruments are: " + instruments3);
        instruments3.removeIf(s -> s.equals("piano")|s.equals("clarinet")|s.equals("drum") );
        System.out.println("Instruments are: " + instruments3);



        List<String> instruments4 = new ArrayList(List.of("violin","piano","violin","flute","clarinet", "cello"));
        //Traversing a collection
        for(Iterator<?> it = instruments4.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        System.out.println("-------------------------------------");
        //traversing with forEach
        instruments4.forEach((s)->System.out.println(s));

        System.out.println("-------------------------------------");
        //traversing with stream
        instruments4.stream()
                .filter(s -> s.startsWith("t")||s.startsWith("f")||s.startsWith("p"))
                .forEach((s)->System.out.println(s));

        System.out.println("-------------------------------------");
        //traversing with for loop
       for(String s : instruments4)
           System.out.println(s);



       //DATA MAnipulation


    }
}

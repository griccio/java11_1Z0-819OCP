import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MySampleMap {
    public static void main(String[] args) {
        Map<Integer,String> m = Map.of(1,"car",2,"airplane",3,"van",4,"ship");
        System.out.println("map is " + m.getClass().getName() + ": " + m );

        Map<Integer,String> h = new HashMap<>( Map.of(1,"car",2,"airplane",3,"van",4,"ship"));
        System.out.println("h is " + h.getClass().getName() + ": " + m );

        Map<Integer,String> l = new LinkedHashMap<>( Map.of(1,"car",2,"airplane",3,"van",4,"ship"));
        System.out.println("l is " + l.getClass().getName() + ": " + m );

        Map<Integer,String> t = new TreeMap<>( Map.of(1,"car",2,"airplane",3,"van",4,"ship"));
        System.out.println("t is " + t.getClass().getName() + ": " + m );

        t.put(5, "motorcycle");
        t.putIfAbsent(6,"bicycle");

        try {
            t.put(null,"scooter");
        } catch (Exception e) {
            System.out.println("t.put(null,\"scooter\");");
            e.printStackTrace();
        }
        System.out.println("t is " +  t );
        t.putIfAbsent(6,"moped");
        System.out.println("t.putIfAbsent(6,\"moped\") = "  + t );
        t.replace(6,"moped");
        System.out.println("t.replace(6,\"moped\"); = "  + t );

        t.compute(6,(key,val)-> val = val.toUpperCase());
        System.out.println("compute val.toUppercase = "  + t );

        t.computeIfAbsent(7,val ->   "convertible".toUpperCase());
        System.out.println("computeIfAbsent val.toUppercase = "  + t );

        //merge example
        //{1=car, 2=airplane, 3=van, 4=ship, 5=motorcycle, 6=MOPED, 7=CONVERTIBLE}
        //merge existing element in this case the function value is get
        t.merge(7,"CONVERTIBLE",(key,val) ->val="SALOON");
        System.out.println("merge existing object "  + t );

        //merge existing  object with null value. value is used
        t.replace(7,null);
        t.merge(7,"HATCHBACK",(key,val) ->val="TO BE DEFINED");
        System.out.println("merge existing object with null value"  + t );

        //merge Not existing  object with. value is used
        t.merge(100,"VESPA",(key,val) ->val="TO BE DEFINED");
        System.out.println("merge not existing object "  + t );





    }
}

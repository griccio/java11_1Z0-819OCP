import element.Cargo;
import element.Pet;

import java.util.*;
import java.util.stream.Collectors;

public class CargoStreamingGroup {
    public static void main(String[] args) {

        List<Cargo> cargoList = List.of(
                new Cargo("1001","Italy","Europe","CONT20"),
                new Cargo("1002","Italy","Europe","CONT20"),
                new Cargo("1004","France","Europe","CONT40"),
                new Cargo("1005","England","Europe","CONT40"),
                new Cargo("1006","China","Asia","BULK"),
                new Cargo("1007","USA","North America","GENCO"),
                new Cargo("1118","CANADA","North America","CONT20"),
                new Cargo("1119","Congo","Africa","CONT20"),
                new Cargo("1120","Angola","Africa","CONT20"),
                new Cargo("1121","France","Europe","CONT40"),
                new Cargo("1122","England","Europe","RORO"),
                new Cargo("1123","China","Asia","BULK"),
                new Cargo("1124","USA","North America","GENCO"),
                new Cargo("1125","CANADA","North America","CONT40")
        );

                /*
         group by Country
{USA=[Cargo{code='1007', country='USA', continent='North America', transport='GENCO'},
      Cargo{code='1124', country='USA', continent='North America', transport='GENCO'}],
Angola=[Cargo{code='1120', country='Angola', continent='Africa', tracnsport='CONT20'}],
CANADA=[Cargo{code='1118', country='CANADA', continent='North America', transport='CONT20'},
        Cargo{code='1125', country='CANADA', continent='North America', transport='CONT40'}],
China=[Cargo{code='1006', country='China', continent='Asia', transport='BULK'},
       Cargo{code='1123', country='China', continent='Asia', transport='BULK'}],
England=[Cargo{code='1005', country='England', continent='Europe', transport='CONT40'},
         Cargo{code='1122', country='England', continent='Europe', transport='RORO'}],
Italy=[Cargo{code='1001', country='Italy', continent='Europe', transport='CONT20'},
      Cargo{code='1002', country='Italy', continent='Europe', transport='CONT20'}],
France=[Cargo{code='1004', country='France', continent='Europe', transport='CONT40'},
        Cargo{code='1121', country='France', continent='Europe', transport='CONT40'}],
        Congo=[Cargo{code='1119', country='Congo', continent='Africa', transport='CONT20'}]}
         */
        System.out.println(" group by Country");
        Map<String,List<Cargo>> countryTransport0 = cargoList.stream()
                .collect(Collectors.groupingBy((Cargo::getCountry)));
        System.out.println(countryTransport0);


        /*
        group by Continent
{Asia=[Cargo{code='1006', country='China', continent='Asia', transport='BULK'},
        Cargo{code='1123', country='China', continent='Asia', transport='BULK'}],
Europe=[Cargo{code='1001', country='Italy', continent='Europe', transport='CONT20'},
        Cargo{code='1002', country='Italy', continent='Europe', transport='CONT20'},
        Cargo{code='1004', country='France', continent='Europe', transport='CONT40'},
        Cargo{code='1005', country='England', continent='Europe', transport='CONT40'},
        Cargo{code='1121', country='France', continent='Europe', transport='CONT40'},
        Cargo{code='1122', country='England', continent='Europe', transport='RORO'}],
Africa=[Cargo{code='1119', country='Congo', continent='Africa', transport='CONT20'},
        Cargo{code='1120', country='Angola', continent='Africa', transport='CONT20'}],
North America=[Cargo{code='1007', country='USA', continent='North America', transport='GENCO'},
               Cargo{code='1118', country='CANADA', continent='North America', transport='CONT20'},
               Cargo{code='1124', country='USA', continent='North America', transport='GENCO'},
               Cargo{code='1125', country='CANADA', continent='North America', transport='CONT40'}]}
*/
        System.out.println(" group by Continent");
        Map<String,List<Cargo>> continentTransport0 = cargoList.stream()
                .collect(Collectors.groupingBy((Cargo::getContinent)));
        System.out.println(continentTransport0);

        System.out.println(" group by Continent and Cargo");
        Map<List<String>,List<Cargo>> countryTransport1 = cargoList.stream()
                .collect(Collectors.groupingBy(// Grouping by list of attributes
                        c -> Arrays.asList(
                                c.getCountry(),c.getTransport())));
        System.out.println(countryTransport1);
/*
{[Congo, CONT20]=[Cargo{code='1119', country='Congo', continent='Africa', transport='CONT20'}],
[China, BULK]=[Cargo{code='1006', country='China', continent='Asia', transport='BULK'},
               Cargo{code='1123', country='China', continent='Asia', transport='BULK'}],
[England, CONT40]=[Cargo{code='1005', country='England', continent='Europe', transport='CONT40'}],
[England, RORO]=[Cargo{code='1122', country='England', continent='Europe', transport='RORO'}],
[CANADA, CONT40]=[Cargo{code='1125', country='CANADA', continent='North America', transport='CONT40'}],
[USA, GENCO]=[Cargo{code='1007', country='USA', continent='North America', transport='GENCO'},
              Cargo{code='1124', country='USA', continent='North America', transport='GENCO'}],
[Italy, CONT20]=[Cargo{code='1001', country='Italy', continent='Europe', transport='CONT20'},
                 Cargo{code='1002', country='Italy', continent='Europe', transport='CONT20'}],
[Angola, CONT20]=[Cargo{code='1120', country='Angola', continent='Africa', transport='CONT20'}],
[CANADA, CONT20]=[Cargo{code='1118', country='CANADA', continent='North America', transport='CONT20'}],
[France, CONT40]=[Cargo{code='1004', country='France', continent='Europe', transport='CONT40'},
                  Cargo{code='1121', country='France', continent='Europe', transport='CONT40'}]}
 */


        //Count Cargo by continent
        //{Asia=2, Europe=6, Africa=2, North America=4}
        Map<String,Long> continentTransport = cargoList.stream()
                .collect(Collectors.groupingBy((Cargo::getContinent),Collectors.counting()));
        System.out.println(continentTransport);


        //Count Cargo by continent orderBy Continent
        //{Africa=2, Asia=2, Europe=6, North America=4}
        Map<String,Long> continentTransport2 = cargoList.stream()
                .collect(Collectors.groupingBy((Cargo::getContinent),TreeMap::new, Collectors.counting()));
        System.out.println(continentTransport2);

        //Count Cargo by country
        //{USA=2, Angola=1, CANADA=2, China=2, England=2, Italy=2, France=2, Congo=1}
        Map<String,Long> countryTransport = cargoList.stream()
                .collect(Collectors.groupingBy((Cargo::getCountry),Collectors.counting()));
        System.out.println(countryTransport);



        System.out.println("--- tot by Country, transport: ---");
        Map<List, Long> transportMaps = cargoList.stream()
                // Collect data into a Map<List,Double>
                .collect(
                        Collectors.groupingBy(
                                // Grouping by list of attributes
                                c -> Arrays.asList(
                                        c.getCountry(),c.getTransport()),
                                // Get the total
                                Collectors.counting()));
        System.out.println(transportMaps);

        System.out.println("--- tot by Country, transport ordered by country: ---");
        cargoList.stream()
                // Collect data into a Map<List,Double>
                .collect(
                        Collectors.groupingBy(
                                // Grouping by list of attributes
                                c -> Arrays.asList(
                                        c.getCountry(),c.getTransport()),
                                Collectors.counting()))
                .entrySet().stream()

                // Sort  by Country
                .sorted((s, t) -> (s.getKey().get(0).compareTo(t.getKey().get(0))))
                .forEach(s -> System.out.print(s));

        System.out.println("--- tot by Country, transport ordered by transport: ---");
        cargoList.stream()
                // Collect data into a Map<List,Double>
                .collect(
                        Collectors.groupingBy(
                                // Grouping by list of attributes
                                c -> Arrays.asList(
                                        c.getCountry(),c.getTransport()),
                                // Get average age of pet
                                Collectors.counting()))
                .entrySet().stream()
                // Sort  by tot transport
                .sorted((s, t) -> (s.getValue().compareTo(t.getValue())))
                .forEach(s -> System.out.print(s));

        /**
         partitionig by Continent: Europe  or Rest of the world
    true=[Cargo{code='1001', country='Italy', continent='Europe', transport='CONT20'},
         Cargo{code='1002', country='Italy', continent='Europe', transport='CONT20'},
         Cargo{code='1004', country='France', continent='Europe', transport='CONT40'},
         Cargo{code='1005', country='England', continent='Europe', transport='CONT40'},
         Cargo{code='1121', country='France', continent='Europe', transport='CONT40'},
         Cargo{code='1122', country='England', continent='Europe', transport='RORO'}
         */
        System.out.println("\n partitionig by Continent: Europe  or Rest of the world");
        Map<Boolean,List<Cargo>> countryTransport00 = cargoList.stream()
                .collect(Collectors.partitioningBy(c ->c.getContinent().equalsIgnoreCase("EUROPE")));
        countryTransport00.entrySet().stream()
                .filter((s) -> s.getKey())
                .forEach(System.out::println);

        /**
         true=6
         */
        System.out.println("\n partitionig by Continent: How many Cargo from Europe?");
        Map<Boolean,Long> countryTransport000 = cargoList.stream()
                .collect(Collectors.partitioningBy(c ->c.getContinent().equalsIgnoreCase("EUROPE"),Collectors.counting()));
        countryTransport000.entrySet().stream()
                .filter((s) -> s.getKey())
                .forEach(System.out::println);


        /*
        false = 8
         */
        System.out.println("\n partitionig by Continent: How many Cargo from Rest of the World?");
        Map<Boolean,Long> countryTransport0000 = cargoList.stream()
                .collect(Collectors.partitioningBy(c ->c.getContinent().equalsIgnoreCase("EUROPE"),Collectors.counting()));
        countryTransport0000.entrySet().stream()
                .filter((s) -> ! s.getKey())
                .forEach(System.out::println);
    }
}


/**
 {Asia=2, Europe=6, Africa=2, North America=4}
 {USA=2, Angola=1, CANADA=2, China=2, England=2, Italy=2, France=2, Congo=1}
 --- tot by Country, transport: ---
 {[Congo, CONT20]=1, [China, BULK]=2, [England, CONT40]=1, [England, RORO]=1, [CANADA, CONT40]=1, [USA, GENCO]=2, [Italy, CONT20]=2, [Angola, CONT20]=1, [CANADA, CONT20]=1, [France, CONT40]=2}
 --- tot by Country, transport: ---
 [Angola, CONT20]=1[CANADA, CONT40]=1[CANADA, CONT20]=1[China, BULK]=2[Congo, CONT20]=1[England, CONT40]=1[England, RORO]=1[France, CONT40]=2[Italy, CONT20]=2[USA, GENCO]=2--- tot by Country, transport: ---
 [Congo, CONT20]=1[England, CONT40]=1[England, RORO]=1[CANADA, CONT40]=1[Angola, CONT20]=1[CANADA, CONT20]=1[China, BULK]=2[USA, GENCO]=2[Italy, CONT20]=2[France, CONT40]=2
 */

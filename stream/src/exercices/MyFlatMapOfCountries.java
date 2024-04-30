package exercices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFlatMapOfCountries {
    public static void main(String[] args) {
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Italy"));
        europe.addCountry(new Country("England"));
        europe.addCountry(new Country("France"));
        europe.addCountry(new Country("Spain"));
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("United States"));
        northAmerica.addCountry(new Country("Canada"));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("Japan"));
        asia.addCountry(new Country("Cina"));
        Continent africa  = new Continent("Africa");
        africa.addCountry(new Country("Congo"));
        africa.addCountry(new Country("Angola"));
        africa.addCountry(new Country("Niger"));

        List<Country> countryList = Stream.of(europe,northAmerica,asia,africa)
                .flatMap(c -> c.getCountryList().stream())
                .collect(Collectors.toList());
        countryList.forEach(System.out::println);
    }
}
/**
 Country{name='Italy'}
 Country{name='England'}
 Country{name='France'}
 Country{name='Spain'}
 Country{name='United States'}
 Country{name='Canada'}
 Country{name='Japan'}
 Country{name='Cina'}
 Country{name='Congo'}
 Country{name='Angola'}
 Country{name='Niger'}

 */
package exercices;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;

    private List<Country> countryList = new ArrayList<>();

    Continent(String name){
        this .name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country) {
        this.countryList.add(country);
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}

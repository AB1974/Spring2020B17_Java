package daysmt_collectionsmuradil;

import java.util.*;

public class SetOfCities {

    public static void main(String[] args) {

        City c1 = new City("London");
        City c2 = new City("NewYork");
        City c3 = new City("London");


        Set<City> cities = new HashSet<>();
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        System.out.println(cities.size());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c3.equals(c1));

    }

}

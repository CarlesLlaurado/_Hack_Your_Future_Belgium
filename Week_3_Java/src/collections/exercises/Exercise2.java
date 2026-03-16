package collections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 1. Create a Set<String> cities.
 2. Add at least 5 city names, including one duplicate.
 3. Print all cities (verify no duplicates).
 4. Check if a given city exists.
*/

public class Exercise2 {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("Barcelona");
        cities.add("Milano");
        cities.add("Madrid");
        cities.add("London");
        cities.add("Milano");

        System.out.println(cities);
        System.out.println(cities.contains("Madrid"));

    }
}

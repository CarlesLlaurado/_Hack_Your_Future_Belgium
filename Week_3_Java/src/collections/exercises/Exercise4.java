package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Map<String, List<Integer>> grades.
    - Key = student name
    - Value = list of grades
 2. Add at least 3 students with multiple grades each.
 3. Print all students with their grades.
 4. Calculate and print the average grade for each student.
*/
public class Exercise4 {
    public static void main(String[] args) {

        Map<String, List<Integer>> myMap = new HashMap<>();
        myMap.put("Jonathan", List.of(7, 5, 8));
        myMap.put("Carles", List.of(5, 6, 7));
        myMap.put("Rafaela", List.of(10, 9, 8));

        printMap(myMap);

    }

    public static void printMap(Map<String, List<Integer>> myMap) {
        for (String key : myMap.keySet()) {
            System.out.println(key + " -> " + myMap.get(key));
        }
        System.out.println("-".repeat(22));

        for (Map.Entry<String, List<Integer>> entry : myMap.entrySet()) {
            double total = 0;
            double average = 0;
            for (int grade : entry.getValue()) {
                total += grade;
            }
            average = total / entry.getValue().size();
            System.out.print(entry.getKey() + " -> " + entry.getValue());
            System.out.println(" Average = " + String.format("%.2f", average));
        }
    }
}

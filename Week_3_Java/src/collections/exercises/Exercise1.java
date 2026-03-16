package collections.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise:
 1. Create a List<String> shoppingList.
 2. Add 5 items.
 3. Remove one item.
 4. Print the final list.
 */

public class Exercise1
{
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Rice");
        shoppingList.add("Tomato");
        shoppingList.add("Chicken");
        shoppingList.add("Yogurt");
        shoppingList.add("Kellogs");

        System.out.println("Before: " + shoppingList);

        shoppingList.remove("Tomato");
        System.out.println("After: " + shoppingList);
    }
}

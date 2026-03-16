package encapsulation.exercises;


import java.util.HashMap;
import java.util.Map;

/**
 TODO:
 1. Create a class ShoppingCart with:
 - private field items (ArrayList of Strings).
 - private field totalPrice (double).

 2. Add methods:
 - addItem(String item, double price) → adds item and increases total price.
 - removeItem(String item, double price) → removes item if it exists and decreases total price.
 - getTotalPrice() → returns current total.
 - getItems() → returns the list of items.

 3. Add validation:
 - No negative prices allowed.
 - If you try to remove an item that doesn't exist, print a message.

 4. Challenge:
 - Add a method applyDiscount(double percentage) → reduces total price by that percentage,
 but only if percentage is between 0 and 50.
 */

public class ShoppingCartWithMap
{
    private Map<String, Double> items;
    private double totalPrice;

    public ShoppingCartWithMap() {
        this.items = new HashMap<>();
        totalPrice = 0;
    }
    public void addItem(String item, double price) {
        if (price >= 0) {
            totalPrice += price;
            items.put(item, price);
        }
    }
    public void removeItem(String item) {
        if (!items.containsKey(item)) {
            System.out.println(item + " is not in the list");
        } else {
            totalPrice -= items.get(item);
            items.remove(item);
        }
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void getItems() {
        for (String item : items.keySet()) {
            System.out.println(item);
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 50) {
            totalPrice -= (totalPrice * (percentage / 100));
        }
    }

    public static void main(String[] args) {
        ShoppingCartWithMap shoppingCart = new ShoppingCartWithMap();
        shoppingCart.addItem("Potato", 3.45);
        shoppingCart.addItem("Tomato", 2.55);
        shoppingCart.addItem("Apple", 10);

        shoppingCart.getItems();
        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.removeItem("Rice");
        shoppingCart.removeItem("Apple");

        shoppingCart.getItems();
        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.applyDiscount(50);
        System.out.println(shoppingCart.getTotalPrice());
    }
}

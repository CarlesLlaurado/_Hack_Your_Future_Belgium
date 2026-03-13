package encapsulation.exercises;

import java.util.ArrayList;
import java.util.List;

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

public class ShoppingCart
{
    private List<String> items;
    private double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0;
    }
    public void addItem(String item, double price) {
        if (price >= 0) {
            this.totalPrice += price;
            this.items.add(item);
        }

    }
    public void removeItem(String item, double price) {
        if (!items.contains(item)) {
            System.out.println(item + " is not in the list");
        } else {
            if (price >= 0) {
                this.totalPrice -= price;
                this.items.remove(item);
            }
        }
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void getItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 50) {
            totalPrice -= (totalPrice * (percentage / 100));
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Potato", 3.45);
        shoppingCart.addItem("Tomato", 2.55);
        shoppingCart.addItem("Apple", 10);

        shoppingCart.getItems();
        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.removeItem("Rice", 100);
        shoppingCart.removeItem("Apple", 5);

        shoppingCart.getItems();
        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.applyDiscount(50);
        System.out.println(shoppingCart.getTotalPrice());
    }
}

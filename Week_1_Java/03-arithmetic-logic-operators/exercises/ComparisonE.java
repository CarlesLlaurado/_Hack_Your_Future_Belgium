import com.sun.source.util.SourcePositions;

/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables a = 50 and b = 25.
 *    - Check if a is equal to b.
 *    - Check if a is greater than b.
 *    - Check if a is less than or equal to b.
 *
 * 2. Create two double variables p = 5.5 and q = 7.2.
 *    - Compare p and q using >, <, and ==.
 *
 * 3. Create a char variable c1 = 'A' and c2 = 'B'.
 *    - Compare if c1 < c2 (hint: uses ASCII values).
 *
 * 4. Create a boolean expression that checks if:
 *    - x (10) is less than y (20) **AND** x is not equal to y.
 *
 * Bonus:
 * 5. Compare two strings (e.g., "Hello" and "World") using `.equals()`
 *    instead of `==`, and explain the difference.
 *
 * 6. Create three int variables and find out which one is the largest
 *    using comparison operators (no `Math.max`).
 * -------------------------------------------------------------
 */

public class ComparisonE
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;

        // Equal to
        boolean isEqual = (x == y);
        System.out.println("Is Equal: " + isEqual); // Output: Is Equal: false

        // Not equal to
        boolean isNotEqual = (x != y);
        System.out.println("Is Not Equal: " + isNotEqual); // Output: Is Not Equal: true

        // Greater than
        boolean isGreater = (x > y);
        System.out.println("Is Greater: " + isGreater); // Output: Is Greater: false

        // Less than
        boolean isLess = (x < y);
        System.out.println("Is Less: " + isLess); // Output: Is Less: true

        // Greater than or equal to
        boolean isGreaterOrEqual = (x >= y);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual); // Output: Is Greater or Equal: false

        // Less than or equal to
        boolean isLessOrEqual = (x <= y);
        System.out.println("Is Less or Equal: " + isLessOrEqual); // Output: Is Less or Equal: true


        // -------------------- Student Exercises --------------------
        // 1. Create int a = 50, b = 25 and compare them.
        System.out.println();
        int a = 50;
        int b = 25;

        boolean areEqual = (x == b);
        System.out.println("Are a and b equal? " + areEqual);
        // 2. Create double p = 5.5, q = 7.2 and compare them.
        double p = 5.5;
        double q = 7.2;

        areEqual = (p == q);
        System.out.println("are p and q equal? " + areEqual);
        // 3. Create char c1 = 'A', c2 = 'B' and check if c1 < c2.
        char c1 = 'A';
        char c2 = 'B';

        isLess = (c1 < c2);
        System.out.println("Is c1 lower than c2: " + isLess);
        // 4. Check if (x < y) AND (x != y).
        isLess = (x < y);
        System.out.println("Is x lower than y? " + isLess);

        isNotEqual = (x != y);
        System.out.println("Is x different than y? " + isNotEqual);
        // 5. Compare two Strings using .equals() instead of ==.
        String s1 = "Hola";
        String s2 = "hola";

        boolean sonIguales = s1.equals(s2);

        System.out.println("Son iguales los dos strings? " + sonIguales);

        // 6. Create three int variables and determine the largest.
        int c = 70;
        int largest;

        if (a > b && a > c)
        {
            largest = a;
        } else if (b > c && b > a) {
            largest = b;
        }else {
            largest = c;
        }
        System.out.println("Largest number is: " + largest);
    }
}

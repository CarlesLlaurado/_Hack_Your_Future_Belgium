import org.w3c.dom.ls.LSOutput;

/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1


        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
        int x = 10;
        int y = 20;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
        int d = 7;
        int e = 2;
        System.out.println(d / e);
        // 3. Use double variables for division and compare with int division.
        double s = 7;
        double h= 2;
        System.out.println(s / h);
        // 4. Create three int variables, add them, and print the total.
        int u = 5;
        int i = 15;
        int o = 50;
        System.out.println(u + i + o);
        // 5. Calculate the square of a number (e.g., 6 * 6).
        System.out.println(u * u);
        // 6. Calculate the average of three numbers.
        System.out.println((u + i + o) / 3);
        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        int z = 0;
        System.out.println(s / z);
//        System.out.println(u / z);
    }
}

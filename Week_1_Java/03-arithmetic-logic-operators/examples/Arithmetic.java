/**
 * This program demonstrates basic arithmetic operations in Java.
 * -------------------------------------------------------------
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 * 5. Modulus
 *-------------------------------------------------------------
 */

public class Arithmetic
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

    }
}
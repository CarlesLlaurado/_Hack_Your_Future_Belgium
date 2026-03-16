/**
 * This program demonstrates the use of different data types in Java.
 * -----------------------------------------------------------------
 * Data Types in Java:
 * 1. Primitive Data Types:
 *    - int: Integer data type (e.g., 10, -5)
 *    - double: Floating point number (e.g., 10.5, -3.14)
 *    - char: Single character (e.g., 'A', 'b')
 *    - boolean: True or false value (e.g., true, false)
 *
 * 2. Non-Primitive Data Types:
 *   - String: Sequence of characters (e.g., "Hello, World!")
 *   - Arrays: Collection of elements of the same type (e.g., int[] grades = {90, 85, 88})
 *   - Classes: User-defined data types (e.g., class Student { ... })
 *   - Interfaces, Enums, etc.
 * -----------------------------------------------------------------
 */


public class DataTypes 
{
    public static void main(String[] args) 
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88, 92, 95};



        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.println("Array of grades: ");
        for (int grade : grades) 
        {
            System.out.println(grade );
        }
    }
}



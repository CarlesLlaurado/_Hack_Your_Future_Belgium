/**
 * Type Conversion in Java
 * -----------------------
 * This program demonstrates both implicit (widening) and explicit (narrowing)
 * type conversions in Java.
 *
 * 1. Implicit Conversion (Widening):
 *    - Happens automatically when a smaller type is assigned to a larger type.
 *    - byte → short → int → long → float → double
 *
 * 2. Explicit Conversion (Narrowing):
 *    - Must be done manually using casting.
 *    - double → float → long → int → short → byte
 *
 * Demonstrated Conversions:
 * - int → double (widening)
 * - char → int (widening)
 * - double → int (narrowing)
 * - float → byte (narrowing)
 */

public class Conversion 
{
    public static void main(String[] args) 
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);
    }
}

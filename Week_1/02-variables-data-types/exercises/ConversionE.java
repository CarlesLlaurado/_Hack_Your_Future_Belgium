/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
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

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)
        short variableShort = 10;

        int variableInt = variableShort;

        System.out.println(variableInt);
        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int largeInt = 1234567890;

        long largeLong = largeInt;
        System.out.println(largeLong);
        // 3. Create a long variable and assign it to a float (implicit)
        long variableLong = 1234567890;

        float variableFloat = variableLong;
        System.out.println(variableFloat);
        // 4. Create a double variable and cast it to a float (explicit)
        double myDouble = 1234.5678;

        float myFloat = (float) myDouble;

        System.out.println("Original double: " + myDouble);
        System.out.println("Casted float: " + myFloat);
        // 5. Create an int variable and cast it to a short (explicit)
        int myInt = 111111;

        short myShort = (short) myInt;

        System.out.println("Original int: " + myInt);
        System.out.println("Casted short: " + myShort);
        // 6. Create a long variable and cast it to a byte (explicit)
        long myLong = 12;

        byte myByte = (byte) myLong;
        System.out.println("Original myLong: " + myLong);
        System.out.println("Casted myByte: " + myByte);
        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        long myLongg = 123456;

        byte myBytee = (byte) myLong;
        System.out.println("Original myLongg: " + myLongg);
        System.out.println("Casted myBytee: " + myBytee);
        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        char letra = 'A';

        int letterNumber = (int) letra;
        System.out.println("Original letter: " + letra);
        System.out.println("Casted letterNumber: " + letterNumber);
        // 9. Convert an int into a char and print the resulting character
        int example = 65;

        char exampleChar = (char) example;

        System.out.println("Original example: " + example);
        System.out.println("Casted exampleChar: " + exampleChar);
        // 10. Create a double with decimals, convert it to int, and print the result
        double exercice = 3.14;

        int exerciceDecimal = (int) exercice;

        System.out.println("Original exercice: " + exercice);
        System.out.println("Casted exerciceDecimal: " + exerciceD);
    }
}

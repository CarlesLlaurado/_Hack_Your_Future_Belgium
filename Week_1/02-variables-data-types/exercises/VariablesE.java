/**
 * Exercises:
 * ---------------------------------------------------------------------
 * 1. Create a variable of type 'char' called myLetter and assign it any letter.
 * 2. Create a variable of type 'float' called myFloat and assign it any decimal value.
 * 3. Create a variable of type 'long' called myBigNumber and assign it a large number.
 * 4. Create a variable of type 'byte' called mySmallNumber and assign it a small number.
 * 5. Create a variable of type 'short' called myShortNumber and assign it a number.
 *
 * Bonus:
 * 6. Change the value of an existing variable (for example, myNumber) and print it again.
 * 7. Create two int variables, add them together, and print the result.
 * 8. Create a String variable for your name and print a greeting message using it.
 */

public class VariablesE
{
    public static void main(String[] args)
    {
        // Variable declaration and initialization (already done for you)
        int myNumber = 10;
        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;

        // Print variables to the console
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);

        // -------------------- Student Exercises --------------------
        // 1. Create a char variable called myLetter and assign it any letter
        char myLetter = 'r';
        // 2. Create a float variable called myFloat and assign it any decimal
        float myFloat = 3.14f;
        // 3. Create a long variable called myBigNumber and assign it a large number
        long myBigNumber = 4345344567890L;
        // 4. Create a byte variable called mySmallNumber and assign it a small number
        byte mySmallNumber = 0;
        // 5. Create a short variable called myShortNumber and assign it a number
        short myShortNumber = 12;
        // 6. Change the value of myNumber and print the new value
        myNumber++;
        System.out.println("myNumber plus 1: " + myNumber);
        // 7. Create two int variables, add them, and print the result
        int x = 10;
        int y = 100;
        System.out.println("x + y = " + (x + y));
        // 8. Create a String variable for your name and print a greeting message
        String name = "Carles";
        System.out.println("Hello, " + name);
    }
}

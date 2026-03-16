/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

public class DataTypesE
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
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age
        int age = 24;
        // 2. Create a double variable called temperature and assign it any decimal
        double temperature = 14.5;
        // 3. Create a char variable called gradeLetter and assign it a letter
        char gradeLetter = 'a';
        // 4. Create a boolean variable called isJavaFun and assign true or false
        boolean isJavaFun = true;
        // 5. Create a String variable called favoriteColor and assign it a color
        String favoriteColor = "red";
        // 6. Create an int array called numbers with at least 5 values, then print them
        int[] numbers = {0, 1, 2, 3, 4};
        for (int i = 0, length = numbers.length; i < length; i++)
        {
            System.out.print(numbers[i]);
        }
        System.out.println();
        // 7. Change one value inside numbers and print the updated array
        numbers[4]++;
        for (int i = 0, length = numbers.length; i < length; i++)
        {
            System.out.print(numbers[i]);
        }
        System.out.println();
        // 8. Create a String array with 3 favorite foods and print them in a loop
        String[] favoriteFood = {"rice", "pizza", "hamburger"};
        for (int i = 0, length = favoriteFood.length; i < length; i++)
        {
            System.out.println(favoriteFood[i]);
        }
        // 9. Create two double variables, add them together, and print the result
        double first = 42.5;
        double second = 32.5;
        System.out.println("first + second = " + (first + second));
        // 10. Use String concatenation to print: "My name is ___ and I am ___ years old."
        String name = "Carles";
        System.out.println("My namge is " + name + " and I am " + age + " years old");
    }
}

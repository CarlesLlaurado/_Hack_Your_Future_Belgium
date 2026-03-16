/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 * <p>
 * Each exercise is designed to help students practice loops.
 */

import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args) {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
        System.out.printf("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 7 + " ");
        }
        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        System.out.printf("\n");
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            System.out.print(sum + " ");
            sum += i;
            i++;
        }
        System.out.printf("\n");
        System.out.println(sum);
        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        int j = 0;
        while (j <= 20) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.printf("\n");

        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Give me a negative number: ");
            number = scanner.nextInt();

            scanner.nextLine();

            if (number >= 0) {
                System.out.println("That's not a negative! Try again");
            }
        } while (number >= 0);

        System.out.println("Perfect! You entered " + number);
        System.out.printf("\n");
        scanner.close();


        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.

        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (String color : colors) {

            for (int k = 0, length = color.length(); k < length; k++) {
                char c = color.charAt(k);

                if (c >= 'a' && c <= 'z') {
                    System.out.print((char) (c - 32));
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        System.out.printf("\n");

        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.

        int[] numberArray = {2, 4, 6, 8, 10};
        int totalSum = 0;

        for (int num : numberArray) {
            totalSum += num;
        }
        System.out.println(totalSum);

        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).

        int tablas = 3;
        int mult = 3;

        for (int a = 1; a <= tablas; a++) {
            for (int b = 1; b <= mult; b++) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
            System.out.println();
        }


        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****

        int height = 4;

        for (int z = 0; z < height; z++) {
            for (int q = -1; q < z; q++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.

        int loop = 20;

        for (int l = 0; l < loop; l++) {
            if (l % 3 == 0) {
                continue;
            } else if (l > 15) {
                break;
            } else {
                System.out.print(l + " ");
            }

        }

        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        System.out.println();
        int printNumber = 10;

        for (int h = 1; h <= printNumber; h++)
        {
            if (h % 7 == 0) {
                break;
            } else {
                System.out.print(h + " ");
            }
        }
        System.out.println();

    }
}

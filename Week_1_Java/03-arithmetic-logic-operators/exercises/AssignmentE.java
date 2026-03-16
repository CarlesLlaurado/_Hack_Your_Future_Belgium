/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create a new int variable b with the value 20.
 *    - Use += to add 10 to b and print the result.
 *    - Use -= to subtract 5 from b and print the result.
 *
 * 2. Create another int variable c with the value 15.
 *    - Multiply c by 3 using *= and print the result.
 *    - Divide c by 2 using /= and print the result.
 *
 * 3. Use %= with c to find the remainder when divided by 4.
 *
 * 4. Create a double variable d = 12.5.
 *    - Use += and *= to update d and print results.
 *
 * Bonus:
 * 5. Create a variable x = 7.
 *    - Use x += x to double its value.
 *    - Use x *= x to square its value.
 *
 * 6. Combine assignment operators in a sequence:
 *    Example: Start with y = 50, then apply -= 10, *= 2, /= 5, and %= 6.
 *    Print the value after each step.
 * -------------------------------------------------------------
 */

public class AssignmentE
{
    public static void main(String[] args)
    {
        int a = 10; // Assignment
        System.out.println("Initial value of a: " + a);

        a += 5; // Addition assignment
        System.out.println("After a += 5: " + a);

        a -= 3; // Subtraction assignment
        System.out.println("After a -= 3: " + a);

        a *= 2; // Multiplication assignment
        System.out.println("After a *= 2: " + a);

        a /= 4; // Division assignment
        System.out.println("After a /= 4: " + a);

        a %= 3; // Modulus assignment
        System.out.println("After a %= 3: " + a);


        // -------------------- Student Exercises --------------------
        // 1. Create an int variable b = 20 and use +=, -= with it.
        int b = 20;
        System.out.println(b);
        System.out.println(b += 10);
        System.out.println(b -= 100);

        // 2. Create an int variable c = 15 and use *=, /= with it.
        int c = 15;
        System.out.println(c);
        System.out.println(c *= 1000);
        System.out.println(c /= 20);
        // 3. Use %= with c to find remainder when divided by 4.
        System.out.println(c %= 4);
        // 4. Create a double variable d = 12.5, then use += and *=.
        double d = 12.5;
        System.out.println(d += 32.2);
        System.out.println(d *= 2.1);
        // 5. Create x = 7, double it with +=, then square it with *=.
        int x = 7;
        System.out.println(x += x);
        System.out.println(x *= x);
        // 6. Start y = 50, apply -= 10, *= 2, /= 5, %= 6 step by step.
        int y = 50;
        y -= 10;
        y *= 2;
        y /= 5;
        y %= 6;
        System.out.println(y);
    }
}

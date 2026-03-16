import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int length = 10;

        System.out.print("Multiplication table of: ");

        int input = scanner.nextInt();

        for (int i = 1; i <= length; i++)
        {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }
}

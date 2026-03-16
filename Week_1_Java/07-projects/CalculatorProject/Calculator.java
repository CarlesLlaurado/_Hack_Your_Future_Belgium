import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double number_1 = 0;
        char op;
        double number_2 = 0;

        while(true)
        {
            System.out.print("Enter first number: ");
            if (scanner.hasNextDouble())
            {
                number_1 = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            else {
                System.out.println("Invalid input. Please enter a valid integer or double");
                scanner.next();
            }
        }


        while(true)
        {
            System.out.print("Enter an operation: ");

            op = scanner.next().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                break;
            }

            System.out.println("Invalid input. Please enter a valid operation ( + | - | * | / )");
        }

        while(true)
        {
            System.out.print("Enter second number: ");
            if (scanner.hasNextDouble())
            {
                number_2 = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            else {
                System.out.println("Invalid input. Please enter a valid integer or double");
                scanner.next();
            }
        }

        double result = 0;

        switch(op)
        {
            case '+':
                result = number_1 + number_2;
                break;
            case '-':
                result = number_1 - number_2;
                break;
            case '*':
                result = number_1 * number_2;
                break;
            case '/':
                result = number_1 / number_2;
                break;
            default:
                System.out.println("Error. Operation not found");
                return;
        }

        System.out.println("Result = " + result);

    }
}


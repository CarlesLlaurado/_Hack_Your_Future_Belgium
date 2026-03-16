package projects.project1;

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        char op = ' ';
        double num2 = 0;

        // Get first number
        while (true) {
            System.out.print("First number: ");
            String input = scanner.next();
            try {
                num1 = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a number.");
            }
        }

        // Get operation
        while (true) {
            System.out.print("Operation (+, -, *, /, %): ");
            String input = scanner.next();
            op = input.charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                break;
            }
            System.out.println("Invalid! Please enter a valid operation.");
        }

        // Get second number
        while (true) {
            System.out.print("Second number: ");
            String input = scanner.next();
            try {
                num2 = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a number.");
            }
        }

        // Calculate result
        double result = 0;
        switch (op) {
            case '+': result = Utils.add(num1, num2); break;
            case '-': result = Utils.sub(num1, num2); break;
            case '*': result = Utils.mult(num1, num2); break;
            case '/': result = Utils.div(num1, num2); break;
            case '%': result = Utils.mod(num1, num2); break;
        }

        if (result == (int) result) {
            System.out.println("Result = " + (int) result);
        } else {
            System.out.println("Result = " + result);
        }
    }
}
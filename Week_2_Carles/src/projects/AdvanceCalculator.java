package projects;

import java.util.Scanner;

public class AdvanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de datos
        System.out.print("Introduce el primer número: ");
        String input1 = scanner.next();

        System.out.print("Introduce el segundo número: ");
        String input2 = scanner.next();

        System.out.print("Operación (+, -, *, /, %): ");
        char op = scanner.next().charAt(0);

        // 2. Lógica de decisión: ¿Es entero o decimal?
        // Usamos contains(".") para detectar si el usuario introdujo un double
        if (input1.contains(".") || input2.contains(".")) {
            double n1 = Double.parseDouble(input1);
            double n2 = Double.parseDouble(input2);
            executeDouble(n1, n2, op);
        } else {
            int n1 = Integer.parseInt(input1);
            int n2 = Integer.parseInt(input2);
            executeInt(n1, n2, op);
        }

        scanner.close();
    }

    // --- MÉTODOS SOBRECARGADOS (Lógica de Negocio) ---

    // SUMA
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b; }

    // RESTA
    public static int sub(int a, int b) { return a - b; }
    public static double sub(double a, double b) { return a - b; }

    // MULTIPLICACIÓN
    public static int mul(int a, int b) { return a * b; }
    public static double mul(double a, double b) { return a * b; }

    // DIVISIÓN (Controlando división por cero)
    public static int div(int a, int b) {
        return (b == 0) ? 0 : a / b;
    }
    public static double div(double a, double b) {
        return (b == 0) ? 0.0 : a / b;
    }

    // MÓDULO
    public static int mod(int a, int b) { return a % b; }
    public static double mod(double a, double b) { return a % b; }

    // --- MÉTODOS DE EJECUCIÓN (Helper Methods) ---

    private static void executeInt(int a, int b, char op) {
        int res = switch (op) {
            case '+' -> add(a, b);
            case '-' -> sub(a, b);
            case '*' -> mul(a, b);
            case '/' -> div(a, b);
            case '%' -> mod(a, b);
            default -> 0;
        };
        System.out.println("Resultado (Integer): " + res);
    }

    private static void executeDouble(double a, double b, char op) {
        double res = switch (op) {
            case '+' -> add(a, b);
            case '-' -> sub(a, b);
            case '*' -> mul(a, b);
            case '/' -> div(a, b);
            case '%' -> mod(a, b);
            default -> 0.0;
        };
        System.out.println("Resultado (Double): " + res);
    }
}

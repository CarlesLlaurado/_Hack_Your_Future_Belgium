package projects;

import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos números vas a introducir?: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error el tamaño debe ser mayor que 0.");
            return;
        }

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("ESTADÍSTICAS");
        System.out.println("Suma total: " + calcularSuma(numeros));
        System.out.println("Promedio: " + calcularMedia(numeros));
        System.out.println("Valor máximo: " + findMax(numeros));
        System.out.println("Valor mínimio: " + findMin(numeros));

        scanner.close();
    }

    public static double calcularSuma(double[] arr) {
        double suma = 0;
        for (double val : arr) {
            suma += val;
        }
        return suma;
    }

    public static double calcularMedia(double[] arr) {
        return calcularSuma(arr) / arr.length;
    }

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (double val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static double findMin(double[] arr) {
        double min = arr[0];
        for (double val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}

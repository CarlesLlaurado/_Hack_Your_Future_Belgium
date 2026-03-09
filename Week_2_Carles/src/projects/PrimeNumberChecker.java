package projects;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Introduce un número para saber si es primo: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Error: debes introducir un número entero.");
                scanner.next();
            }
        }
        if (isPrime(num)) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }


        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }


    public static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
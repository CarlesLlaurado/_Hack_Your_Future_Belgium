import java.util.Scanner;

public class Exercice01 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write something: ");

        if (scanner.hasNextLine()) {
            String temp = scanner.nextLine();

            Scanner tempScann = new Scanner(temp);

            recursive(tempScann);

            tempScann.close();
        }

        scanner.close();
    }

    public static void recursive(Scanner scanner) {
        if (scanner.hasNextInt()) {
            System.out.println("Is an integer: " + scanner.nextInt());
        }else if (scanner.hasNextDouble()) {
            System.out.println("Is a double " + scanner.nextDouble());
        }else if (scanner.hasNextBoolean()) {
            System.out.println("Is a boolean " + scanner.nextBoolean());
        }else {
            System.out.println("Is a string: " + scanner.next());
        }

        if (scanner.hasNext()) {
            recursive(scanner);
        }
    }

}


import java.util.Scanner;

public class Day {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int dayNumber = scanner.nextInt();

        while (true)
        {
            switch(dayNumber)
            {
                case 1:
                    System.out.println("Monday"); return;
                case 2:
                    System.out.println("Tuesday"); return;
                case 3:
                    System.out.println("Wednesday"); return;
                case 4:
                    System.out.println("Thrusday"); return;
                case 5:
                    System.out.println("Friday"); return;
                case 6:
                    System.out.println("Saturday"); return;
                case 7:
                    System.out.println("Sunday"); return;
                default:
                    System.out.print("Number not valid, enter a number again: ");
                    dayNumber = scanner.nextInt();
            }
        }

    }
}


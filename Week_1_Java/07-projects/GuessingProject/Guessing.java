import  java.util.Scanner;

public class Guessing
{

    public static void main(String[] args)
    {
        int length = 3;

        int random = (int) (Math.random() * length);
        guessNumber(random, length);
    }

    public static void guessNumber(int random, int length)
    {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to guess number and say if correct, lower or higher
        System.out.print("Guess the number : ");

        int guessed;

        while(true)
        {
            if (scanner.hasNextInt())
            {
                guessed = scanner.nextInt();
                scanner.nextLine();
                if (guessed == random)
                {
                    System.out.println("Well done, number was: " + random);
                    break;
                }else {
                    System.out.print("Guess again: ");
                }

            }else {
                System.out.print("Please enter an integer between 0 and " + length + ": ");
                scanner.next();
            }
        }

    }

}

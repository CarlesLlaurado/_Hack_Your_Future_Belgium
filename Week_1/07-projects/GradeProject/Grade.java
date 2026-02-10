import java.util.Scanner;

public class Grade
{
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many subjects do you have? ");
        int subjects = scanner.nextInt();
        int totalGrade = 0;
//        int averageGrade = (totalGrade / subjects);

        int[] array = new int[subjects];

        for (int i = 0; i < subjects; i++)
        {
            System.out.print("Grade of subject " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            totalGrade += array[i];
        }

        int average = totalGrade / subjects;

        System.out.println("Your average grade is: " + average);

        switch(average)
        {
            case 9:
            case 8:
                System.out.println("You got an A"); break;
            case 7:
            case 6:
                System.out.println("You got a B"); break;
            case 5:
            case 4:
                System.out.println("You got a C"); break;
            case 1:
                System.out.println("You got a F"); break;
            default:
                System.out.println("You had a problem calculating grade <3");
        }


    }
}

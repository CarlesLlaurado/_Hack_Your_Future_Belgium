/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable month (1-12).
 *    - Use a switch statement to print the corresponding month name.
 *
 * 2. Create a char variable grade ('A', 'B', 'C', 'D', 'F').
 *    - Use a switch statement to print the description:
 *      'A' -> "Excellent"
 *      'B' -> "Good"
 *      'C' -> "Average"
 *      'D' -> "Below Average"
 *      'F' -> "Fail"
 *      default -> "Invalid grade"
 *
 * 3. Create an int variable trafficLight (1, 2, 3).
 *    - Use a switch to print:
 *      1 -> "Red"
 *      2 -> "Yellow"
 *      3 -> "Green"
 *      default -> "Invalid light"
 *
 * 4. Create an int variable menuOption (1-5).
 *    - Use switch to print which action was chosen (e.g., "Option 1 selected").
 *
 * Bonus:
 * 5. Combine multiple cases to handle weekends:
 *    - day = 6 or 7 -> print "Weekend"
 *    - day = 1-5 -> print "Weekday"
 * -------------------------------------------------------------
 */

public class Switch
{
    public static void main(String[] args)
    {
        int day = 3;
        String dayName;

        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);

        // -------------------- Student Exercises --------------------
        // 1. Create int month (1-12) and print month name using switch.
        int month = 11;
        String monthName;

        switch (month)
        {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "Septembre";
                break;
            case 10:
                monthName = "Octobre";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = "Invalid month";
                break;
        }

        System.out.println(monthName);
        // 2. Create char grade and print description using switch.
        int grade = 90;

        char gradeChar;

        switch (grade / 10 )
        {
            case 9:
                gradeChar = 'A';
                break;
            case 8:
                gradeChar = 'B';
                break;
            default:
                gradeChar = 'F';
        }
        System.out.println(gradeChar);

        // 3. Create int trafficLight (1-3) and print light color using switch.
        int ligth = 3;
        String trafficLight;

        switch (ligth)
        {
            case 1:
                trafficLight = "Green";
                break;
            case 2:
                trafficLight = "Orange";
                break;
            case 3:
                trafficLight = "Red";
                break;
            default:
                trafficLight = "Not working";
        }
        System.out.println(trafficLight);
        // 4. Create int menuOption (1-5) and print which option is selected.
        int option = 5;
        String menuOption;

        switch (option)
        {
            case 1:
                menuOption = "Profile";
                break;
            case 5:
                menuOption = "Theme Colour";
                break;
            default:
                menuOption = "Invalid option";
        }
        System.out.println(menuOption);
        // 5. Combine cases for weekends (6 and 7) vs weekdays (1-5).
        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayName = "Weekday";
                break;
            case 6:
            case 7:
                dayName = "Weekday";
                break;
            default:
                dayName = "Not a valid day";
        }
        System.out.println(dayName);
    }
}

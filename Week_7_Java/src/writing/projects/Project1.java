package writing.projects;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Simple Logger
 *
 * Write a small logging program.
 *
 * 1. Ask the user to enter a log level (INFO, WARN, ERROR).
 * 2. Ask the user to enter a log message.
 * 3. Append a new line to "project1.log" in the following format:
 *
 *    timestamp | level | message
 *
 * Example output in file:
 *
 * 2026-03-14T20:21:03 | INFO  | Server started
 * 2026-03-14T20:21:10 | WARN  | Disk usage high
 * 2026-03-14T20:21:15 | ERROR | Database connection failed
 *
 *
 * Bonus:
 * Use an enum instead of String for the log level.
 */
public class Project1 {

    enum Level {
        INFO,
        WARN,
        ERROR
    }

    static void main(String[] args) {
        String filePath = "resources" + File.separator + "project1.txt";

        Scanner scanner = new Scanner(System.in);


        Level level = null;
        while (level == null)
        {
            System.out.print("Enter log level (INFO, WARN, ERROR): ");
            String levelInput = scanner.nextLine().toUpperCase();

            try {
                level = Level.valueOf(levelInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Enter a valid level(INFO, WARN, ERROR): " );
            }
        }

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        scanner.close();

        String timestamp = LocalDate.now().toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(timestamp + " | " + level + " | " + message);
            writer.newLine();

            System.out.println("Log entry success!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}


/* Hint:



 * - Use FileWriter with append mode
 * - Use LocalDateTime.now()
*/
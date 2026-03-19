package reading.projects;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Log Analyzer
 *
 * A small program that reads a log file and counts how many
 * log entries belong to each severity level.
 *
 * The program analyzes the beginning of each line and checks
 * whether it starts with one of the following log levels:
 *
 * INFO
 * WARN
 * ERROR
 *
 * Example input:
 *
INFO server ready
INFO server started
INFO call received
WARN exception thrown and caught during execution
WARN disk almost full
ERROR database connection failed
 *
 * Expected output:
 *
 * INFO: 3
 * WARN: 2
 * ERROR: 1
 *
 */
public class Projects1 {
    static void main(String[] args) {
        String filePath = "resources" + File.separator + "project1.txt";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter log level (INFO, WARN, ERROR)");
        String level = scanner.nextLine().toUpperCase();

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        scanner.close();

        String timestamp = LocalDate.now().toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(timestamp + ", " + level + ", " + message);
            writer.newLine();

            System.out.println("Log entry success!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader((new FileReader(filePath)))) {

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

/**
 * HINTS
 *
 *
 *
 * - Read the file line by line
 * - Detect the log level at the beginning of each line
 * - Count occurrences using a Map<String, Integer>
*/
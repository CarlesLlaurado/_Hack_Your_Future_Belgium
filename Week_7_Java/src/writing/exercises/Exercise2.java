/**
 * 1. Append a new line to "daily_log.txt" each time the program runs.
 * 2. The line should follow CSV format: timestamp,level,message.
 * 3. Ask the user for level (INFO/WARN/ERROR) and message before writing.
 */

package writing.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise2
{
    enum Level {
        INFO,
        WARN,
        ERROR
    }

    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "daily_log.txt";

        Scanner scanner = new Scanner(System.in);

        Level level = null;
        while (level == null)
        {
            System.out.print("Enter level (INFO, WARN, ERROR): ");
            String levelInput = scanner.nextLine().toUpperCase();

            try {
                level = Level.valueOf(levelInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid level. Write (INFO, WARN, ERROR)");
            }
        }

        System.out.print("Enter message: ");
        String msg = scanner.nextLine();

        scanner.close();


        String timestamp = LocalDateTime.now().toString();

        try (FileWriter writer = new FileWriter(filePath, true))
        {
            writer.write(timestamp + ", " + level + ", " + msg + "\n");
        }
        catch (IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

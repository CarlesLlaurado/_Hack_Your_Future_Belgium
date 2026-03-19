/**
 * 1. Ask the user to enter 3 messages.
 * 2. Save them to "messages.txt" with line numbers (e.g., "1: hello").
 * 3. Write an extra summary line: "Total messages: 3".
 */

package writing.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String filePath = "resources" + File.separator + "messages.txt";
        List<String> messages = new ArrayList<>();

        System.out.print("Enter message 1: ");
        messages.add(scanner.nextLine());
        System.out.print("Enter message 2: ");
        messages.add(scanner.nextLine());
        System.out.print("Enter message 3: ");
        messages.add(scanner.nextLine());

        scanner.close();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            for (int i = 0; i < messages.size(); i++) {
                writer.write((i + 1) + ": " + messages.get(i));
                writer.newLine();
            }
            writer.write("Total messages: " +  messages.size());


            System.out.println("Successfully wrote in " + filePath);

        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
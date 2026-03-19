/**
 * 1. Ask the user for 5 grocery items.
 * 2. Remove duplicates and sort alphabetically using streams.
 * 3. Write the cleaned list to "shopping_list.txt".
 * 4. Print how many unique items were saved.
 */

package writing.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String filePath = "resources" + File.separator + "shopping_list.txt";

        List<String> groceries = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            groceries.add(scanner.nextLine());
        }

        List<String> streamed = groceries.stream()
                .map(String::trim)
                .distinct()
                .sorted()
                .toList();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : streamed) {
                writer.write(line);
                writer.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

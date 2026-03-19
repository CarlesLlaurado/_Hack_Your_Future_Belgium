/**
 * 1. Read all lines from "input.txt".
 * 2. Process lines with a stream (trim + uppercase).
 * 3. Write processed lines to "processed_output.txt".
 * 4. Add a header line and a footer containing the total processed line count.
 */

package writing.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise4
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "input.txt";
        String outputPath = "resources" + File.separator + "processed_output.txt";

        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<String> processed = lines.stream()
                .map(String::trim)
                .map(String::toUpperCase)
                .toList();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath)))
        {
            for (String line : processed) {
                writer.write(line);
                writer.newLine();
            }

            writer.write("Total lines: " );
            writer.newLine();
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

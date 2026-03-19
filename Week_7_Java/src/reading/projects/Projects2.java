/**
 *
 * Word Frequency Analyzer
 *
 * Read a text file and display the most common words.
 * Ignore punctuation and capitalization.
 *
 * 1. Read "paragraph.txt".
 * 2. Build a frequency map of words (case-insensitive) using a stream pipeline.
 * 3. Print the top 5 most frequent words with their counts.
 *
 */

package reading.projects;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Projects2
{
    public static void main(String[] args)
    {
        String filePath = "resources" + File.separator + "paragraph.txt";

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        List<String> words = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(String::toLowerCase)
                .map(w -> w.replaceAll("[^a-zA-Z]", ""))
                .filter(w -> !w.isEmpty())
                .toList();

        Map<String, Long> amount = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        amount.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(5)
                .forEach(System.out::println);
    }
}

/**
    HINTS



    Step1
    Count total words

    Step2
    Count unique words

    Step3
    Calculate frequency

    Step4
    Print top 5 words
*/

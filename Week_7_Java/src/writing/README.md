# Writing Files in Java

This folder continues from `inputoutput1`.

Already covered in `inputoutput1`:
- creating and writing files with `FileWriter`
- basic copy operations
- try-with-resources and exception handling

In this `writing` module, the focus is writing workflows and patterns, not repeating the first write example.

## Focus of this module

1. Efficient writing with `BufferedWriter`
2. Appending data (`new FileWriter(path, true)`)
3. Structured multi-line output
4. Controlled write behavior with `flush()` when needed

## Typical pattern used in this folder

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
    writer.write("new entry");
    writer.newLine();
    writer.flush();
} catch (IOException e) {
    System.out.println("Error writing file: " + e.getMessage());
}
```

### What does flush() do?

Buffered writers store data temporarily in memory (the buffer).
Calling `flush()` forces the buffered data to be written to disk immediately.

Normally you do not need to call `flush()` manually because
`close()` (or try-with-resources) will flush automatically.

## Stream-friendly writing pattern

When data is already in a collection, you can transform it with streams and write once:

```java
List<String> lines = names.stream()
        .map(String::trim)
        .filter(s -> !s.isEmpty())
        .map(String::toUpperCase)
        .toList();

Files.write(Path.of("output.txt"), lines);
```

This keeps transformation and output logic clear and testable.

## Note
Many backend systems follow this cycle:

1. Programs write logs or structured data to files
2. Other programs read those files
3. The data is analyzed or transformed

This module prepares you for building such workflows.

## Testing Note

Programs that generate files should also be tested.

For example, a test could verify that:

- the correct number of lines were written
- the file contains expected values
- logs follow the correct format

The next module introduces automated testing for such cases.

## Learning outcomes

By the end of this folder, students should be able to:
- write line-oriented text output
- append logs or incremental records safely
- generate files from in-memory data structures
- choose when buffered writing is preferable


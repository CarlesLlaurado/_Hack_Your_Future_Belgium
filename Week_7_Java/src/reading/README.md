# Reading Files in Java

This folder continues from `inputoutput1`.

Already covered in `inputoutput1`:
- file path handling with `File`
- basic `FileReader` usage
- try-with-resources and `IOException`

In this `reading` module, the focus is on reading-focused practice tasks rather than re-teaching basics.

## Focus of this module

1. Read text line by line using `BufferedReader`
2. Process content while reading (count lines/words, filter lines)
3. Convert file content into in-memory structures (for example, `List<String>`)
4. Apply small text-processing tasks on top of I/O

## Note
Streams in Java are not only for collections. They originally come from Input/Output streams.

The word “stream” is used in more than one place in Java.

- In I/O, a stream means a flow of data between a source and a destination.
- In the Stream API, a stream means a pipeline for processing data.

They are related by idea, but they are not the same class hierarchy.

## What is a Buffer?

A **buffer** is a small temporary memory area used to store data while it is being transferred.

Instead of reading data **one character at a time from the disk**, a buffered stream reads a **larger chunk of data into memory** first.

This makes reading **much faster** because accessing memory is much cheaper than accessing the disk.

Example:

Without buffer
Program → Disk → Program → Disk → Program

With buffer
Program → Memory Buffer → Disk (large chunk)

Java provides buffered classes such as:

- `BufferedReader`
- `BufferedWriter`
- `BufferedInputStream`
- `BufferedOutputStream`

These wrap other streams and improve performance.

## Typical pattern used in this folder

```java
try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        // process line
    }
} catch (IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
}
```

## Stream-based alternative

You can also read files with `Files.lines(...)` and process data with stream pipelines:

```java
try (Stream<String> lines = Files.lines(Path.of("data.txt"))) {
    long nonEmpty = lines
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .count();
    System.out.println("Non-empty lines: " + nonEmpty);
} catch (IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
}
```

This style combines file I/O and stream processing in one readable flow.

## What is Logging?

Most real-world applications write **logs** while they run.

A log is a record of events that happen inside a program.

Logs help developers and system administrators:

- understand what the program is doing
- detect errors
- monitor system behavior
- debug problems after they occur

Example log file:

```
INFO server started
INFO call received
WARN disk usage high
ERROR database connection failed
```

Each line usually begins with a **log level**, which indicates the severity of the message.

Common log levels include:

- **INFO** – normal informational events
- **WARN** – something unexpected happened, but the system continues
- **ERROR** – a failure occurred

In many backend systems, programs write logs continuously and other tools later **read and analyze those logs**.

### Question:
If a production system crashes at 3 AM, how do developers know what happened?

This module includes a small **Log Analyzer** project to simulate that workflow.


## Design Tip: Using Enum for Log Levels

In the Log Analyzer project, log levels appear as strings:

INFO, WARN, ERROR

Instead of using raw strings, we could represent them using an `enum`.

Example:

```java
enum LogLevel {
    INFO,
    WARN,
    ERROR
}
```

Advantages of using enums:

Prevents typos ("EROR" vs "ERROR")

Provides a fixed set of valid values

Makes code easier to read and maintain

Using enums is common when a value can only belong to a small fixed set of options.

> "Strings are flexible but dangerous.  
> Enums are restrictive but safe."

## Testing Note

Many of the functions used in this module (such as counting lines, filtering text, or analyzing logs) can be tested automatically.

In the 2nd next module we will learn how to write tests to verify that our programs behave correctly. We'll have 2 small examples about it here in this module as well.

## Learning outcomes

By the end of this folder, students should be able to:
- read files efficiently with buffering
- compute metrics from text (line count, word count)
- filter lines by keyword
- collect and post-process read data


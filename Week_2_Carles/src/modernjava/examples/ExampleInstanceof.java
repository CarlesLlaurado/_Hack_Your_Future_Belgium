package modernjava.examples;

public class ExampleInstanceof
{
    public static void main(String[] args)
    {
        Object value = "Hello";
        printLength(value);

        value = 42;
        printLength(value);
    }

    public static void printLength(Object value)
    {
        if (value instanceof String text)
        {
            System.out.println("String length: " + text.length());
        }
        else
        {
            System.out.println("Not a String: " + value);
        }
    }
}

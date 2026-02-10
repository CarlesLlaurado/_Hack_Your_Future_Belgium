package classes.exercises;

/**
 * Exercise 1: Basic Class
 * ------------------------
 * TODO:
 * 1. Create a class `Book` with fields: title, author.
 * 2. Add a method `displayInfo()` to print book details.
 * 3. Create objects in main() and call the method.
 */

class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void displayInfo() {
        System.out.println("Libro: " + this.title + " | Escrito por: " + this.author);

    }
}


public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Create Book objects and test methods

        Book myBook1 = new Book("El Quijote", "Cervantes");
        Book myBook2 = new Book("Rich Dad, Poor dad", "Robert Kyosaky");

        myBook1.displayInfo();
        myBook2.displayInfo();
    }
}


package projects.project4;

public class Book {
    String title;
    String author;
    int year;

    Book() {
        title = "Book title";
        author = "author";
        year = 0;

    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printDetails() {
        System.out.print("Title: " + this.title);
        System.out.print(" Author: " + this.author);
        System.out.print(" year: " + year);
        System.out.println();
    }
}

package composition.exercises.BookWithAuthor;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create class Book with title and author.
 2. Create class Library that HAS-A List<Book>.
 3. Add methods addBook(), listBooks().
 4. In main(), add multiple books and print them.
*/

public class Library
{
    private String name;
    private List<Book> bookList;

    public Library(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void listBooks() {
        for (Book book : bookList) {
            System.out.println("title: " + book.getTitle() + " author: " + book.getAuthor());
        }
    }
}

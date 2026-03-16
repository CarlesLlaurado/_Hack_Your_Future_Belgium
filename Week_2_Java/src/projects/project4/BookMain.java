package projects.project4;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book("Rich Dad, poor dad", "Robert Kiyosaki", 1997);
        book1.printDetails();

        Book b2 = new Book("How to win friends & influence people", "Dale Carnedie", 1936);
        b2.printDetails();

    }
}

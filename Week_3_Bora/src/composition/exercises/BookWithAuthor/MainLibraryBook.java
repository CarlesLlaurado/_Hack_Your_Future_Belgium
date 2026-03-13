package composition.exercises.BookWithAuthor;

public class MainLibraryBook {
    public static void main(String[] args) {
        Book richDad = new Book("Rich Dad, poor dad", "Robert Kyiosaki");
        Book winFriends = new Book("How to Win Friends", "Dale Carnegie");

        Library library = new Library("Llibreria de Carles");
        library.addBook(richDad);
        library.addBook(winFriends);

        library.listBooks();
    }
}

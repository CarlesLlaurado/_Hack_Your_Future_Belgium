package projects.project1;

public class MainProject1 {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("978-0-7432-7356-5", "1984", "George Orwell");
        Book book2 = new Book("978-0-7432-7357-6", "Animal Farm", "George Orwell");
        Book book3 = new Book("978-0-7432-7358-7", "Rich Dad Poor Dad", "Robert Kiyosaki");

        // Add books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create members
        StudentMember student = new StudentMember("Carles", 1, 2);
        TeacherMember teacher = new TeacherMember("Bora", 2, "Java");

        // Enroll members
        library.enrollMember(student);
        library.enrollMember(teacher);

        // List everything
        System.out.println("--- Books ---");
        library.listBookMap();

        // Search
        System.out.println("\n--- Search ---");
        Book found = library.searchByTitle("1984");
        if (found != null) {
            System.out.println("Found: " + found.getTitle());
        } else {
            System.out.println("Book not found");
        }

        // Remove
        System.out.println("\n--- After removing 1984 ---");
        library.removeBook("978-0-7432-7356-5");
        library.listBookMap();

        // List members
        System.out.println("\n--- Members ---");
        library.listMembers();
    }
}

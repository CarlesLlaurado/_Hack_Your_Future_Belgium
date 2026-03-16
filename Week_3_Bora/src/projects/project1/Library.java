package projects.project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> bookMap;
    private List<Member> memberList;

    public Library() {
        this.bookMap = new HashMap<>();
        this.memberList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getISBN(), book);
    }
    public void enrollMember(Member member) {
        memberList.add(member);
    }

    public void removeBook(String isbn) {
        if (!bookMap.containsKey(isbn)) {
            System.out.println("Book not found");
        } else {
            bookMap.remove(isbn);
        }
    }

    public Book searchByTitle(String title) {
        for (Book book : bookMap.values()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void listBookMap() {
        for(Map.Entry<String, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            System.out.println(entry.getKey() + " | " + book.getTitle() + " | " + book.getAuthor());
        }
    }
    public void listMembers() {
        for (Member member : memberList) {
            member.infoMember();
        }
    }

}

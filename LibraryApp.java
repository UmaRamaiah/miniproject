package miniproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryApp {
	private List<Book> books;

    public LibraryApp() {
        this.books = new ArrayList<>();
        books.add(new Book("The NoteBook", "Nicholas Sparks"));
        books.add(new Book("Who moved my cheese", "Spencer Jhonson"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("The Shining", "Stephen King"));
        books.add(new Book("The Diary of whimpy kid", "Joff Kinney"));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        System.out.println("------------------------------------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("------------------------------------");
        }
    }

    public boolean cancelBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}


package evaluationtask_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book{
	private int id;
	private String title;
	private String author;
	private String ISBN;
	private boolean available;
	public Book(int id,String title,String author,String ISBN) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.available=true;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String ISBN() {
		return ISBN;
	}
	public boolean isAvailable() {
        return available;
    }
	public void setBookAvailable(boolean available) {
		this.available=available;
	}
	public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + available;
    }
}
class library{
	private Map<Integer, Book> bookcatlog =  new HashMap<>();
	
	public void addBook(Book book) {
		bookcatlog.put(book.getId(), book);
	}
	public void removeBook(int bookId) {
		bookcatlog.remove(bookId);
	}
	public void availableUpdate(int bookId,boolean available) {
		Book book = bookcatlog.get(bookId);
		if(book != null) {
			book.setBookAvailable(available);
		}
	}
	public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : bookcatlog.values()) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
	public List<Book> SearchBookByTitle(String Title) {
		List<Book> foundBook = new ArrayList<>();
		String title = Title;
		for(Book book : bookcatlog.values()) {
			if(book.getTitle().toLowerCase().equals(title.toLowerCase())) {
				foundBook.add(book);
			}
		}
		return foundBook;
	}
	
}
public class LibraryManagementSystem {
	public static void main(String[] args) {
		library Library = new library();
		
		Book book1 = new Book(1, "Java Programming", "John Smith", "1234567890");
		Book book2 = new Book(2, " python programming","yashu","1231018327");
		Book book3 = new Book(3, "c programming","charan","9326487659");
		Library.addBook(book1);
		Library.addBook(book2);
		Library.addBook(book3);
		
		System.out.println("available books:");
		List<Book> AvailableBooks = Library.getAvailableBooks();
		for(Book book : AvailableBooks) {
			System.out.println(book);
		}
		
        System.out.println("\nSearch for books with 'Java' in the title:");
		List<Book> SearchByTitle = Library.SearchBookByTitle("Java Programming");
		for (Book book : SearchByTitle) {
            System.out.println(book);
        }
		
		Library.availableUpdate(2, false);
		
		System.out.println("\navailable books after update :");
		List<Book> Availablebooks = Library.getAvailableBooks();
		for(Book book : Availablebooks) {
			System.out.println(book);
		}
	}
}


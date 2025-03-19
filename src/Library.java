import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<User> users;

	public Library() {
		books = new ArrayList<>();
		users = new ArrayList<>();
	}

	// Add a new book to the library
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: " + book.getTitle());
	}

	// Add a new user to the library
	public void addUser(User user) {
		users.add(user);
		System.out.println("User added: " + user.getName());
	}

	// Borrow a book from the library
	public void borrowBook(String title, int userId) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
				book.setAvailable(false);
				System.out.println("Book borrowed: " + book.getTitle() + " by User ID: " + userId);
				return;
			}
		}
		System.out.println("Book not available or not found.");
	}

	// Return a borrowed book
	public void returnBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
				book.setAvailable(true);
				System.out.println("Book returned: " + book.getTitle());
				return;
			}
		}
		System.out.println("Book not found or already available.");
	}

	// Display all available books in the library
	public void displayAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : books) {
			if (book.isAvailable()) {
				System.out.println(book);
			}
		}
	}

	// Display all users of the library
	public void displayUsers() {
		System.out.println("Registered Users:");
		for (User user : users) {
			System.out.println(user);
		}
	}
}

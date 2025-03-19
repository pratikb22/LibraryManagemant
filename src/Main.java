import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		int choice;

		// Sample data
		library.addBook(new Book("The Alchemist", "Paulo Coelho"));
		library.addBook(new Book("wings of fire", " APJ KALAM"));
		library.addBook(new Book("Clean Code", "Robert C. Martin"));

		library.addUser(new User("pawan", 1));
		library.addUser(new User("Aakansha", 2));

		do {
			System.out.println("\nLibrary Management System");
			System.out.println("1. Display Available Books");
			System.out.println("2. Add Book");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Display Users");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				library.displayAvailableBooks();
				break;

			case 2:
				System.out.print("Enter book title: ");
				String title = scanner.nextLine();
				System.out.print("Enter book author: ");
				String author = scanner.nextLine();
				library.addBook(new Book(title, author));
				break;

			case 3:
				System.out.print("Enter book title to borrow: ");
				String borrowTitle = scanner.nextLine();
				System.out.print("Enter your user ID: ");
				int userId = scanner.nextInt();
				library.borrowBook(borrowTitle, userId);
				break;

			case 4:
				System.out.print("Enter book title to return: ");
				String returnTitle = scanner.nextLine();
				library.returnBook(returnTitle);
				break;

			case 5:
				library.displayUsers();
				break;

			case 0:
				System.out.println("Exiting the system.");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);

		scanner.close();
	}
}

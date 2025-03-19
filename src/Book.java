public class Book {
	private String title;
	private String author;
	private boolean isAvailable;

	public Book() {
		super();
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true; // New books are available by default
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
	}
}

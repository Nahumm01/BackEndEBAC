/**
 * A class for the Book example, with his vars, getters and setters for a future use in a main class.
 * @author nahum
 * @version 1.0
 * @since September, 22.
 */
public class Book {
	public String title;
	public String author;
	public int pages;
	public int year;
	public double rating;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

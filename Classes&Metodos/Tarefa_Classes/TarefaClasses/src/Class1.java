/**
 * Main class for create new Books, set some new infos and print them.
 */
public class Class1 {
	public static void main(String[] args) {
		Book book = new Book();

		/**
		 * In below lines, will be used the getters and setters created in Book Class.
		 * @see Book
		 */
		book.setTitle("Surprised by Jesus");
		book.setAuthor("Dane Ortlund");
		book.setYear(2023);
		book.setPages(189);
		book.setRating(4.89);

		System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " " + book.getPages() + " " + book.getRating());
	}
}

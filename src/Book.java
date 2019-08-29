
public class Book {
	
	private String isbn;
	
	private String author;
	
	private String title;
	
	private float price;
	
	private int copies;
	
	public Book(String isbn, String author, String title, float price, int copy) {
		this.isbn = isbn;
		this.author = title;
		this.price = price;
//		this.setCopies(copy);
		this.copies = copy;
	}
	
	public Book() {
		this.isbn = "";
		this.author = "";
		this.title = "";
		this.price = 0;
		this.copies = 0;
	}
}

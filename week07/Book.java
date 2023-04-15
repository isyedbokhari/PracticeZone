package week07;

public class Book {
	
	private String title;
	private String author;
	private int isbn;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
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
	
	public int getISBN() {
		return isbn;
	}
	
	public void setISBN(int isbn) {
		this.isbn = isbn;
	}
	
	public void getInfo() {
		System.out.println("Sid is reading " + title + " written by " + author + " and the ISBN of the book is " + isbn );
	}
}

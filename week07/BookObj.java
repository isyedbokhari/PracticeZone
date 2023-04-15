package week07;

public class BookObj {

	public static void main(String[] args) {
		
		Book harryPotter = new Book("Harry Potter", "J. K. Rowling", 652346572);
		System.out.println("Title: " + harryPotter.getTitle());
		System.out.println("Author: " + harryPotter.getAuthor());
		System.out.println("ISBN: " + harryPotter.getISBN());
		harryPotter.getInfo();
		
	}

}

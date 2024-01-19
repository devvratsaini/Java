package Session_1;

public class Library {
	
	String bookName, bookAuthor, libraryName;
	int bookPrice, bookPublishYear;
	
	// Main method
	public static void main(String[] args) {
		
		// Creating a new instance of class 'Library'
		Library l1 = new Library();
		
		// Assigning values to data members
		l1.bookName = "Atomic Habits";
		l1.bookAuthor = "James Clear";
		l1.bookPrice = 800;
		l1.bookPublishYear = 2018;
		l1.libraryName = "SIT Library";
		
		// Printing the values of the data members
		System.out.println("Book Name: " + l1.bookName);
		System.out.println("Book Author: " + l1.bookAuthor);
		System.out.println("Book Price: " + l1.bookPrice);
		System.out.println("Book Publish Year: " + l1.bookPublishYear);
		System.out.println("Library Name: " + l1.libraryName);
	}
}

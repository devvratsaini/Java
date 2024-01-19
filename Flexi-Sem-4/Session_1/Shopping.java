package Session_1;

public class Shopping {
	
	String productName, productType, customerName;
	int productQuantity, customerAge, orderID;

	// Main method
	public static void main(String[] args) {
		
		// Creating an instance of the class 'Shopping' 
		Shopping s1 = new Shopping();
		
		// Assigning values to the data members
		s1.productName = "Atomic Habits";
		s1.productType = "Book";
		s1.productQuantity = 1;
		s1.customerName = "Devvrat Saini";
		s1.customerAge = 19;
		s1.orderID = 1;
		
		// Printing the values of the data members
		System.out.println("Product Name: " + s1.productName);
		System.out.println("Product Type: " + s1.productType);
		System.out.println("Product Quantity: " + s1.productQuantity);
		System.out.println("Customer Name: " + s1.customerName);
		System.out.println("Customer Age: " + s1.customerAge);
		System.out.println("Order ID: " + s1.orderID);
	}
}

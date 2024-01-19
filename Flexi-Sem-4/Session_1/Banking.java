package Session_1;

public class Banking {

	String  accountType, customerName;
	int accountNumber, customerAge, transactionID, transactionAmount;
	
	// Main method
	public static void main(String[] args) {
		
		// Creating an instance of the class 'Banking'
		Banking b1 = new Banking();
		
		// Assigning values to the data members
		b1.accountNumber = 1;
		b1.accountType = "Savings";
		b1.customerName = "Devvrat";
		b1.customerAge = 19;
		b1.transactionID = 1;
		b1.transactionAmount = 1000;
		
		// Printing the values of the data members
		System.out.println("Account Number: " + b1.accountNumber);
		System.out.println("Account Type: " + b1.accountType);
		System.out.println("Customer Name: " + b1.customerName);
		System.out.println("Customer Age: " + b1.customerAge);
		System.out.println("Transaction ID: " + b1.transactionID);
		System.out.println("Transaction Amount: " + b1.transactionAmount);
	}
}

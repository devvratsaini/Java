package session_5;

// Parent class
class Building {
	
	int noOfFloors;
	
	public void displayBuilding() {
		System.out.println("Number of Floors in Building = " + noOfFloors);
	}
}

// child class of class Building
class Apartment extends Building {
	
	String ownerName;
	
	public void displayApartment() {
		System.out.println("Number of Floors = " + noOfFloors);
		System.out.println("Apartment Owner Name = " + ownerName);
	}
}

// child class of class Apartment
class Room extends Apartment {
	
	int noOfWindows;
	
	public void displayRoom() {
		System.out.println("Number of Floors in Building = " + noOfFloors);
		System.out.println("Apartment Owner Name = " + ownerName);
		System.out.println("Number of Windows in Room = " + noOfWindows);
	}
}

// driver class
public class MultipleInheritanceBuilding {

	// maim method
	public static void main(String[] args) {
		
		// creating new instance of class Room
		Room r1 = new Room();
		
		// assigning values to instance variables
		r1.noOfFloors = 2;
		r1.ownerName = "John Doe";
		r1.noOfWindows = 2;
		
		// displaying Room details
		r1.displayRoom();
	}
}

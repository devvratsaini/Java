package session_5;

// parent class
class Vehicle2 {
	
	int manufacturingYear;
	
	void displayVehicle() {
		System.out.println("Manufacturing Year = " + manufacturingYear);
	}
}

// child class of class Vehicle2
class Car2 extends Vehicle2{
	
	int noOfDoors;
	String color;
	
	void displayCar() {
		System.out.println("Manufacturing Year = " + manufacturingYear);
		System.out.println("Number of Doors = " + noOfDoors);
		System.out.println("Color = " + color);
	}
}

// child class of class Car2
class SportsCar2 extends Car2{
	
	boolean isConvertible;
	
	void displaySportsCar() {
		System.out.println("Manufacturing Year = " + manufacturingYear);
		System.out.println("Number of Doors = " + noOfDoors);
		System.out.println("Color = " + color);
		System.out.println("Is Convertible = " + isConvertible);
	}
}

// driver class
public class MultipleInheritanceVehicle {

	// main method
	public static void main(String[] args) {
		
		// creating instance of class SportsCar2
		SportsCar2 sc1 = new SportsCar2();
		
		// assigning values to instance variables
		sc1.manufacturingYear = 2011;
		sc1.noOfDoors = 4;
		sc1.color = "Black";
		sc1.isConvertible = false;
		
		// displaying details of instance
		sc1.displaySportsCar();
	}
}

package session_5;

// parent class
class Vehicle1 {
	
	String make;
	
	public void displayVehicle() {
		System.out.println("Make = " + make);
	}
}

// child class
class Car1 extends Vehicle1 {
	
	String model;
	
	public void displayCar() {
		System.out.println("Make = " + make);
		System.out.println("Model = " + model);
	}
}

// driver class
public class VehicleInheritance {

	// main method
	public static void main(String[] args) {
		
		// instance of 
		Car1 c1 = new Car1();
		
		c1.make = "Honda";
		c1.model = "Civic";
		
		c1.displayCar();
	}
}

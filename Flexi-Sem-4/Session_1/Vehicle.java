package Session_1;
public class Vehicle {
	
	int numberOfTyres = 4, numberOfSeats = 4;
	final int price = 10_00_000;
	String manufacturer = "Ford";
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		
		System.out.println("Manufacturer: " + v1.manufacturer);
		System.out.println("Price: " + v1.price);
		System.out.println("Number of Seats: " + v1.numberOfSeats);
		System.out.println("Number of Tyres: " + v1.numberOfTyres);
	}
}

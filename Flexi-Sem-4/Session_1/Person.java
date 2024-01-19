package Session_1;

public class Person {
	
	String name;
	int age;
	char gender;
	
	// Main method
	public static void main(String[] args) {
		
		// Creating 3 instances of class 'Person'
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// Assigning values to data members of each object
		p1.name = "Josh";
		p1.age = 19;
		p1.gender = 'M';
		
		p2.name = "July";
		p2.age = 22;
		p2.gender = 'F';
		
		p3.name = "Jeff";
		p3.age = 30;
		p3.gender = 'M';
		
		// Printing details of each person
		System.out.println("Person 1 Details:");
		System.out.println("Name = " + p1.name);
		System.out.println("Age = " + p1.age);
		System.out.println("Gender = " + p1.gender + "\n");
		
		System.out.println("Person 2 Details:");
		System.out.println("Name = " + p2.name);
		System.out.println("Age = " + p2.age);
		System.out.println("Gender = " + p2.gender + "\n");
		
		System.out.println("Person 3 Details:");
		System.out.println("Name = " + p3.name);
		System.out.println("Age = " + p3.age);
		System.out.println("Gender = " + p3.gender + "\n");
	}
}

package Session_2;

public class SimpleConstructor {

	int a;
	
	// constructors
	public SimpleConstructor() {
		System.out.println("Default constructor called.");
		this.a = 0;
	}
	public SimpleConstructor(int a) {
		System.out.println("Parameterized constructor called.");
		this.a = a;
	}

	// main method
	public static void main(String[] args) {
		
		SimpleConstructor simpleConstructor1 = new SimpleConstructor();
		System.out.println(simpleConstructor1.a);
		
		SimpleConstructor simpleConstructor2 = new SimpleConstructor(12);
		System.out.println(simpleConstructor2.a);
	}
}

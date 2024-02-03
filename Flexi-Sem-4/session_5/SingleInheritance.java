package session_5;

// parent class
class Parent {
	
	int a = 20;
	
	void displayParent() {
		System.out.println("Parent A = " + a);
	}
}

// child class
class Child extends Parent{
	
	int b = 30;
	
	void displayChild() {
		System.out.println("Parent A = " + a);
		System.out.println("Child B = " + b);
	}
}

// driver class
public class SingleInheritance {

	// main method
	public static void main(String[] args) {
		
		// creating instance of class Child
		Child c1 = new Child();
		
		// displaying details of parent (inherited) and child
		c1.displayParent();
		c1.displayChild();
	}
}

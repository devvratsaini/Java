package Session_3;

// POJO outer class
class Outer2 {
	
	void outerMethod() {
		final int outerFinalVariable = 10;
		
		// local inner class
		class LocalInner {
			void display() {
				System.out.println("LocalInner class method. Outer variable: " + outerFinalVariable);
			}
		}
		
		LocalInner localInner = new LocalInner();
		localInner.display();
	}
}

public class LocalInnerClass {

	// main method
	public static void main(String[] args) {
		
		Outer2 o1 = new Outer2();
		o1.outerMethod();
	}
}

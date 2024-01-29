package Session_3;

// outer (POJO) class
class Outer1 {
	
	private int outerVariable = 10;
	
	public int getOuterVariable() {
		return outerVariable;
	}
	
	// inner class
	class Inner {
		public void displayMessage() {
			System.out.println("I am method of inner class");
			System.out.println("Value of OuterClass Variable is: " + outerVariable);
		}
	}
}

public class NonStaticInnerClass {
	
	// main method
	public static void main(String[] args) {
		
		Outer1 o1 = new Outer1();
		System.out.println("Value of outerclass variable is: " + o1.getOuterVariable());
		
		// creating instance of inner class needs reference of an existing instance of outer class
		Outer1.Inner i1 = o1.new Inner();
		i1.displayMessage();
	}
}

package session_5;

// parent class
class Student {
	
	String name;
	
	public void displayStudent() {
		System.out.println("Name = " + name + "\n");
	}
}

// child class
class SecondYear extends Student{
	
	int noOfSubjects;
	
	public void displaySecondYear() {
		System.out.println("Name = " + name);
		System.out.println("Number of Subjects = " + noOfSubjects + "\n");
	}
}

// child class
class ThirdYear extends Student{
	
	int noOfSubjects;
	boolean isIntern;
	
	public void displayThirdYear() {
		System.out.println("Name = " + name);
		System.out.println("Number of Subjects = " + noOfSubjects);
		System.out.println("Is Intern = " + isIntern + "\n");
	}
}

// driver class
public class HierarchialInheritanceStudent {

	// maim method
	public static void main(String[] args) {
		
		// creating an instance of class ThirdYear
		SecondYear sy1 = new SecondYear();
		ThirdYear ty1 = new ThirdYear();
		
		// assigning values to instance variables
		sy1.name = "Anonymous";
		sy1.noOfSubjects = 6;
		ty1.name = "John Doe";
		ty1.noOfSubjects = 5;  
		ty1.isIntern = true;
		
		// displaying details of instances
		sy1.displaySecondYear();
		ty1.displayThirdYear();
	}
}

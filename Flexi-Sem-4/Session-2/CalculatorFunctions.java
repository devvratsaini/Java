package Session_2;

class Calculator {
	
	private int op1, op2;
	
	// getters and setters
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	
	// operation methods
	public int add(int op1, int op2) {
		return op1 + op2;
	}
	public int subtract(int op1, int op2) {
		return op1 - op2;
	}
	public float divide(int op1, int op2) {
		return op1 / op2;
	}
	public int multiply(int op1, int op2) {
		return op1 * op2;
	}
}

public class CalculatorFunctions {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.setOp1(10);
		calc.setOp2(2);
		
		System.out.println("Addition of " + calc.getOp1() + " and " + calc.getOp2() + " is " + calc.add(calc.getOp1(), calc.getOp2()));
		System.out.println("Subtraction of " + calc.getOp1() + " and " + calc.getOp2() + " is " + calc.subtract(calc.getOp1(), calc.getOp2()));
		System.out.println("Division of " + calc.getOp1() + " and " + calc.getOp2() + " is " + calc.divide(calc.getOp1(), calc.getOp2()));
		System.out.println("Multiplication of " + calc.getOp1() + " and " + calc.getOp2() + " is " + calc.multiply(calc.getOp1(), calc.getOp2()));
	}
}

package Session_3;

public class AutoBoxingAndUnboxing {
	
	public static void main(String[] args) {
		
		int a = 15;
		System.out.println("Value of a: " + a);
		
		// Auto-boxing
		Integer i1 = a;
		System.out.println("Integer value of i1: " + i1);
		
		int x1 = i1.intValue();
		int x2 = i1;	// Auto-unboxing
		System.out.println("Value of x1: " + x1);
		System.out.println("Value of x2: " + x2);
		
		// Auto-unboxing - more examples
		Integer i2 = 20;
		
		int a1 = i2.intValue();
		int a2 = i2;
		float a3 = i2;
		double a4 = i2;
		long a5 = i2;
	}
}

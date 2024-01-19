package Session_2;


class StaticDemon {
	
	static int count = 0;
	
	int a;
	
	public StaticDemon(int a) {
		
		System.out.println("New object created");
		
		this.a = a;
		
		count++;
	}
	
	static int returnConst() {
		return count;
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		StaticDemon sd1 = new StaticDemon(10);
		System.out.println(StaticDemon.returnConst());

		StaticDemon sd2 = new StaticDemon(10);
		System.out.println(StaticDemon.returnConst());
		
		StaticDemon sd3 = new StaticDemon(10);
		System.out.println(StaticDemon.returnConst());
		
		StaticDemon sd4 = new StaticDemon(10);
		System.out.println(StaticDemon.returnConst());
	}
}

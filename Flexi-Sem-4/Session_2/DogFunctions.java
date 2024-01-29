package Session_2;

// Plain Old Java Object (POJO) class
class Dog {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void dogBarks() {
		System.out.println(this.name + " is barking.");
	}
}

public class DogFunctions {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setName("Doggo");
		dog.setAge(6);
		
		System.out.println("Dog Name: " + dog.getName());
		System.out.println("Dog Age: " + dog.getAge());
		dog.dogBarks();
	}
}

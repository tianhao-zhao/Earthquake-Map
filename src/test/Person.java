package test;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Person p1 = new Student("Joe", "123");
		
		System.out.println(p1);
	}

}

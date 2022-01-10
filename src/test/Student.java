package test;

public class Student extends Person {
	private String id;
	
	public Student(String name, String id) {
		super(name);
		this.id = id;
	}
	public void getID() {
		System.out.println(this.id);
	}
	public String toString() {
		return (super.toString()+this.id);
	}

}

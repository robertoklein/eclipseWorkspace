package chap5;

public class Animal {

	private int age;
	
	public Animal() {
		System.out.println("dentro do const default");
	}
	
	public Animal(int age) {
		System.out.println("age: " + age);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}


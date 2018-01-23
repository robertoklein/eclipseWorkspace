package pac9;

public abstract class Bird {

	private void fly() {
		System.out.println("bird is flying");
	}
	
	public static void main(String[] args) {
		Bird bird = new Pelican();
		bird.fly();
	}
}

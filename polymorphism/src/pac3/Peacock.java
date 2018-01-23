package pac3;

public class Peacock extends Bird{


	@Override
	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		
		Bird bird = new Peacock();
		bird.displayInfo();
		System.out.println("===========");
	
		Bird b = new Bird();
		b.displayInfo();
	}
}

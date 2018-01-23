package pac1;

public class Swan extends Animal {

	@Override
	public String getName() {
		return "Swan";
	}
	
	public static void main(String[] args) {
		Swan s = new Swan();
		System.out.println(s.age);
		s.eat();
	}

	
}

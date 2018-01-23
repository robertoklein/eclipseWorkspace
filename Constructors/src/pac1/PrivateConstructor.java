package pac1;

public class PrivateConstructor {

private int count;
	
	private PrivateConstructor() {
		System.out.println("called the constructor");
		count++;
	}
	
	public static void acessa() {
		PrivateConstructor p = new PrivateConstructor();
	}
	
	
	
}

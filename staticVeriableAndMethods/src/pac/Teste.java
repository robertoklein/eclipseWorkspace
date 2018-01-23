package pac;

public class Teste {

	private static String name = "static class";

	public static void first() {
	}
	
	public static void second() {
	}
	
	public static void third() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		first();
		second();
		third();
	}
}

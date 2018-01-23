package examples;

public class Test {

	
	public static void main(String[] args) {
		
		InterfaceTest addtwonumber = (int a, int b) -> a + b;
		int c = addtwonumber.add(1, 2);
		System.out.println(c);
	}
}

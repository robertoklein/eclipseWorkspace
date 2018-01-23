package staticInicialization;

public class Inicia {

	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;
	
	static {
		one = 1;
		three = 3;
	}
	static {
		two = 2;
	}
	
	
}

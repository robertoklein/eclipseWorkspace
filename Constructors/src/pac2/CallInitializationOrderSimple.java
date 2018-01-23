package pac2;

public class CallInitializationOrderSimple {

	public static void main(String[] args) {
		
		String str = "roberto";
		str.concat("klein");
		System.out.println(str);
		
		System.out.println("read to construct");
		//new InitializationOrderSimple();
	}
}

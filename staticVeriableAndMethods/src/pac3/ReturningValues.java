package pac3;

public class ReturningValues {

	public static void main(String[] args) {
		
		int number = 1;
		String letters = "abc";
		
		number(number);
		
		letters = letters(letters);
		System.out.println(number + letters);
	
	}
	
	public static String letters(String letters) {
		return letters += "d";
	}
	
	public static int number(int number) {
		number++;
		return number;
	}
}

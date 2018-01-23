package pac6;

public class Spider extends Arthropod{

	public void printName(int input) {
		System.out.println("spider");
	}
	
	public static void main(String[] args) {
		Spider s = new Spider();
		s.printName(4);
		s.printName(9.0);
	}
	
}

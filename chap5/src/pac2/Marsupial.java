package pac2;

public class Marsupial {

	//public static boolean isBiped() {
	//	return false;
	//}

	
	public boolean isBiped() {
		System.out.println("Marsupial");
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("marsupial walks on two legs: " + isBiped());
	}
}

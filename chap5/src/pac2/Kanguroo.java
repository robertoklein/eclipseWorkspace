package pac2;

public class Kanguroo extends Marsupial{

	//public static boolean isBiped() {
	//	return true;
	//}
	
	public boolean isBiped() {
		System.out.println("kanguroo");
		return true;
	}
	
	public void getKangurooDescription() {
		System.out.println("kanguroo hops on two legs: " + isBiped());
	}
}

package pac8;

public class ClownFish implements Aquatic{

	
	public String getNumberOfGills() {
		return "4";
	}
	
	public String getNumberOfGills(int input) {
		return "6";
	}
	
	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumberOfGills(-1));
	}
}

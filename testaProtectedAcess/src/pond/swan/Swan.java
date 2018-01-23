package pond.swan;

import pond.goose.Goose;
import pond.goose.Gosling;
import pond.shore.Bird;

public class Swan extends Bird{

	public void swim() {
		floatInWater();
		System.out.println(text);
	}
	
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater();
		System.out.println(other.text);
	}
	
	public void helpotherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater();
		System.out.println(other.text);		
		
		Swan s = new Bird();
		
	}
}

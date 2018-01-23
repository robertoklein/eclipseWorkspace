package pond.goose;

import pond.shore.Bird;
import pond.swan.Swan;

public class Goose extends Bird {

	public void helpGooseSwim() {
		Goose g = new Goose();
		g.floatInWater();
		System.out.println(g.text);
	}
	
	public void helpOtherGooseSwim() {
		Swan b = new Swan();
		//b.floatInWater();
		//System.out.println(b.text);
	}
}





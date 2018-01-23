package pond.inland;

import pond.shore.Bird;

public class BirdWatcherFromAfar extends Bird{

	/**
	 * nao compila pq os metodos sao protected, sendo assim, so se é visivel para o mesmo pacote, ou para classes
	 * que extendem Bird
	 */
	
	
	public void watchBird(){
		Bird b = new Bird();
		b.floatInWater();
		System.out.println(b.text);
	}
	
	
	
	
}

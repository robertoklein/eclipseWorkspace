package pac1;

public interface Omnivore {

	public void eatPlants();
	public void eatMeat();
	
	public default double getTemp() {
		return 10.0;
	}
	
	static int getKump(){
		return 1;
	}
	
}

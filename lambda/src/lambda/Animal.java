package lambda;

public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHopM() {
		return canHop;
	}
	
	public boolean canSwimM() {
		return canSwim;
	}
	
	public String toString() {
		return species;
	}	
}

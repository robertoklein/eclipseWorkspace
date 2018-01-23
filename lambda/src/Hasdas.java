
public class Hasdas {

	private int numberBags;
	boolean call;
	
	public Hasdas() {
		this(2);
		call = false;
	}
	
	public Hasdas(int numberBags) {
		//System.out.println("const com par");
		this.numberBags = numberBags;
	}
	
	public static void main(String[] args) {
		
		Hasdas h = new Hasdas();
		System.out.println(h.numberBags);
	}
}

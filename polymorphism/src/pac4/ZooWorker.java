package pac4;

public class ZooWorker {

	public static void feed(Reptile reptile) {
		System.out.println("feeding reptile " + reptile.getName());
	}
	
	public static void feed2(Interface i) {
		System.out.println("animal " + i.getTeste());
	}
	
	public static void main(String[] args) {
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());
		
		System.out.println("===============");
		
		feed2(new Alligator());
		feed2(new Crocodile());
		
		
	}
}

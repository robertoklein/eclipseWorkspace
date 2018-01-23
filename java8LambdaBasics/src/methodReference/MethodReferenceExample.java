package methodReference;

public class MethodReferenceExample {

	
	public static void main(String[] args) {
		
		//utilizando lambda
		Thread t1 = new Thread( () -> printMessage());
		t1.start();
		
		//utilizando methodReference
		Thread t2 = new Thread(MethodReferenceExample::printMessage);
		t2.start();
		
	}
	
	public static void printMessage() {
		System.out.println("hello");
	}
	
}

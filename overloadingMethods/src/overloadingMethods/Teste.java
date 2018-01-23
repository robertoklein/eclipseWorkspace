package overloadingMethods;

public class Teste {

	public static void main(String[] args) {
	
		int i = 56;		
		
		Teste t = new Teste();
		//t.fly("test");
		t.fly(56);
		
		//t.fly(123l);
		//t.fly(123L);
		
	}
	
	public void fly(String s) {
		System.out.println("string ");
	}
	
	public void fly(int i) {
		System.out.println("int ");
	}
	
	public void fly(Integer i) {
		System.out.println("integer ");
	}
	
	public void fly(Object o) {
		System.out.println("object ");
	}
	
	public void fly(long l) {
		System.out.println("long ");
	}
}

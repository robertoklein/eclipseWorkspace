package pac2;

public class Teste {

	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		e.fly();
		
		Bird b = new Bird();
		b.fly();
		
		Bird b2 = new Eagle();
		b2.fly();
		
		System.out.println("==========");
		
		Bird.eat();
		Eagle.eat();
		
	}
}

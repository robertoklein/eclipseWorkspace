package chap5;

public class Lion extends Animal{
	
	
	public Lion() {
	}
	
	public Lion(int age) {
		System.out.println("int lion");
	}
	
	private void roar() {
		System.out.println("the " + getAge() + " year old and lion says: Roar");
	}
	
	public static void main(String[] args) {
		Lion l = new Lion();
		l.setAge(2);
		System.out.println(l.getAge());
		
		Lion l2 = new Lion();
		l2.setAge(10);
		System.out.println(l2.getAge());
		
		l.roar();
		l2.roar();
	}
}

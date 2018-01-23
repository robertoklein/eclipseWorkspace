package polymorphism;

public class Lemur extends Primate implements HasTail{

	@Override
	public boolean isTailStripped() {
		return false;
	}
	
	public int age = 10;
	
	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		System.out.println("===========");
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStripped());
		System.out.println(hasTail.testaDefault());
		System.out.println("===========");
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}

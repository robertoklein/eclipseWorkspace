package overloadingMethods;

public class TooManyConversions {

	
	public static void main(String[] args) {
		
		play(4);
		
	}
	
	
	//public static void play(long l) {
		//System.out.println("entrou no long");
	//}
	
	public static void play(long... l) {
		System.out.println("entrou no varargs");
	}
	
	public static void play(Long l) {
		System.out.println("entrou no Long");
	}
	
}

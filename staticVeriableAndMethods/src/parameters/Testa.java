package parameters;

public class Testa {
	
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		String i = "roberto";
		speak(name,i);
		System.out.println(name);
		
		System.out.println("===============");
		
		System.out.println(i);
		
		Testa a = new Testa();
		int r = a.howMany(true, new boolean[2]);
		System.out.println("resultado: " + r);
	}
	
	
	
	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
	
	public static void speak(StringBuilder s, String i) {
		s.append("webby");
		i = i.concat("klein");
		System.out.println("i no speak: " + i);
		
		
		
	}
}

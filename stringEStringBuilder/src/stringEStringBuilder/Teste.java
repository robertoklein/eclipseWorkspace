package stringEStringBuilder;

public class Teste {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		a = b;
		System.out.println("valor a: " + a);
		System.out.println("valor b: " + b);
		b = "c" + "d";
		System.out.println("valor a: " + a);
		System.out.println("valor b: " + b);	
		StringBuilder sb = new StringBuilder();
		sb.append("roberto");
		System.out.println(sb);
		
		
		
		
		
	}
}

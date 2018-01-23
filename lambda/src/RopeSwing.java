import java.util.ArrayList;
import java.util.List;

import predicate.Rope;

public class RopeSwing {

	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	
	{
		System.out.println("no ropeS" + rope1.length);
	}
	
	public static void main(String[] args) {
		
		rope1.nome="ronaldo";
		
		
		List<Integer> lista = new ArrayList<>();
		
		rope1.length = 2;
		lista.add(rope1.length);
		System.out.println(Rope.length);
		System.out.println(Rope.nome);
		
		rope2.length = 8;
		rope2.nome = "rogerio";
		lista.add(rope1.length);
		System.out.println(Rope.length);
		System.out.println(Rope.nome);
		
		System.out.println("===========");
		
		for(int i : lista) {
			System.out.println(i);
		}
		
		//System.out.println(" no main " + rope1.length);
	}
}

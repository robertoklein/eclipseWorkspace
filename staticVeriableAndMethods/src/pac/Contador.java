package pac;

import java.util.ArrayList;

public class Contador {
	
	private static int count;
	
	public Contador() {
		count++;
	}
	
	private static final ArrayList<String> values = new ArrayList<>();
	
	private static final ArrayList<String> values2 = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		//values = values2;
		
		values.add("roberto");
		
		for(String s : values) {
			System.out.println(s);
		}

		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		Contador c4 = new Contador();
		
		System.out.println(count);
	}
}

package arrayList;

import java.util.ArrayList;

public class TestaArrayList {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add(0, "klein");
		
		System.out.println(lista);
		
		lista.add(0, "roberto");
		
		System.out.println(lista);
		
		System.out.println("get 0 "+lista.get(0));
		
		System.out.println("get 1 "+lista.get(1));
		
		
	}
	
}

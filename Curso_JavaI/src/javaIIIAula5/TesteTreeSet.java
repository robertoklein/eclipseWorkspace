package javaIIIAula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TesteTreeSet {

	
	public static void main(String[] args) {
		
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	List<Integer> lista = new ArrayList<>();
	
	for(int i=1; i <= 1000; i++) {
		treeSet.add(i);
		lista.add(i);
	}
	
	//for(Integer i : treeSet.descendingSet()) {
		//System.out.println("tree: "+ i);
	//}
	
	System.out.println("================");
	
	Collections.reverse(lista);
	
	for(Integer i : lista) {
		System.out.println("list: "+ i);
	}
	
	}
	
}

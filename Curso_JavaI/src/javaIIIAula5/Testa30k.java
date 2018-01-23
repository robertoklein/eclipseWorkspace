package javaIIIAula5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Testa30k {

	public static void main(String[] args) {
		
		
		System.out.println("inciando...");
		
		//Collection<Integer> teste = new HashSet<Integer>();
		Collection<Integer> teste = new ArrayList<>();
		//List<Integer> teste = new ArrayList<>();
  		
		int total= 100000;
		
		long inicio = System.currentTimeMillis();
		
		for(int i=0; i<total; i++) {
			teste.add(i);
		}
	
		for(int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempo);
		
		Map mapaContas = new HashMap<>();
		
	}
	
}

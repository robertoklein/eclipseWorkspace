package javaIIIAula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestaRanNum {

	private static Set<Integer> lista = new HashSet<Integer>();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		int tamanho = 10;
		
		geralista(tamanho);
		
		while(lista.size() < tamanho) {
			System.out.println("entrou");
			int num = tamanho - lista.size();
			geralista(num);
		}
		
		//aqui converte o hashSet em arrayList para poder fazer o sort
		List<Integer> sortedList = new ArrayList(lista);
		Collections.sort(sortedList);
		
		//Collections.sort(lista);
		
		for(Integer i : sortedList) {
			System.out.println("main2: " + i);
		}
		
		System.out.println("tamanho da lista: " + lista.size());
		
	}
	
	public static Set<Integer> geralista(int tamanho) {
		Random ran = new Random();
		for(int i = 0; i < tamanho; i++) {
			int num = ran.nextInt(30);
			lista.add(num);
		}
		System.out.println("=============");
		return lista;
	}
}

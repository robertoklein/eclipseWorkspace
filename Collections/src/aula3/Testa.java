package aula3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Testa {

	public static void main(String[] args) {
		
	
		  Map<String, Integer> nomesParaIdade = new HashMap<>();
	        nomesParaIdade.put("Paulo", 31);
	        nomesParaIdade.put("Adriano", 25);
	        nomesParaIdade.put("Alberto", 33);
	        nomesParaIdade.put("Guilherme", 26);
	      
	        
	        Set<String> chaves = nomesParaIdade.keySet();
	        for(String nome : chaves) {
	        	System.out.println(nome);
	        }
	        
	       Collection<Integer> chaves2 = nomesParaIdade.values();
	        
	}
	
	
	
}

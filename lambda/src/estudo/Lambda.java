package estudo;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("roberto","ana","bianca","joao");
		
		System.out.println("==========");
		System.out.println("forEach normal");
		System.out.println("-----------");
		for(String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("==========");
		
		
		System.out.println("forEach lambda");
		System.out.println("-----------");
		lista.forEach(nome -> System.out.println(nome));
		System.out.println("==========");
		
		System.out.println("forEach method reference");
		System.out.println("-----------");
		lista.forEach(System.out::println);
	}
	
	
	
	
	
}

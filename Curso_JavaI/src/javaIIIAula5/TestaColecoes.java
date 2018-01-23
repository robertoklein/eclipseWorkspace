package javaIIIAula5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestaColecoes {

	public static void main(String[] args) {

		ArrayList<Object> nomes = new ArrayList<>();
		nomes.add("roberto");
		nomes.add("klein");

		System.out.println();

		Pessoa p1 = new Pessoa();
		p1.setCpf("12345");
		p1.setNome("nome da pessoa");
		nomes.add(p1);

		int i=0;
		for(Object obj : nomes) {
			if(obj instanceof Pessoa) {
				Pessoa p = (Pessoa) obj;
				System.out.println("obj pessoa, nome: " + p.getNome());
				System.out.println("obj pessoa, cpf: " + p.getCpf());
			}else {
				System.out.println(nomes.get(i));
			}
			i++;
		}
		
		Pessoa p2 = new Pessoa();
		p2.setCpf("12345");
		p2.setNome("nome da pessoa");	
		
		//as classes LinkedList e ArrayList implementam a interface List
		List<String> lista = new LinkedList<>();
		List<String> list = new ArrayList<>();
		
		Set<Pessoa> lista2 = new HashSet<Pessoa>();
		lista2.add(p1);
		lista2.add(p2);
		
	}
}

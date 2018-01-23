package javaIIIAula5;

import java.util.HashSet;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setCpf("12345");
		p1.setNome("roberto");

		Pessoa p2 = new Pessoa();
		p2.setCpf("12345");
		p2.setNome("roberto");


		HashSet<Pessoa> lista = new HashSet<Pessoa>();
		lista.add(p1);
		lista.add(p2);
		lista.add(new Pessoa("klein","54321"));
		lista.add(new Pessoa("klein","54321"));

		for(Pessoa p : lista) {
			System.out.println(p);
		}

		if(p1.equals(p2)) {
			System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
	}






}

package javaIIIAula5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaC {

	public static void main(String[] args) {

		List<ContaPoupanca> lista = new LinkedList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(2);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(3);
		ContaPoupanca c4 = new ContaPoupanca();
		c4.setNumero(4);

		lista.add(c3);
		lista.add(c2);
		lista.add(c4);
		lista.add(c1);

		System.out.println("lista original");
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}

		System.out.println("=================");
		System.out.println("lista ordenada");
		Collections.sort(lista);	
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}

		System.out.println("=================");
		System.out.println("lista inversa");
		Collections.reverse(lista);
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}
		
		System.out.println("=================");
		System.out.println("lista aleatoria");
		Collections.shuffle(lista);
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}
		
		System.out.println("=================");
		System.out.println("lista rotacionada");
		Collections.rotate(lista,3);
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}
		
	}

}

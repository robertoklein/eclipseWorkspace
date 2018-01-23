package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> fila = new LinkedList<>();

	public void  adiciona(String nome) {
		fila.add(nome);
	}

	public void remove() {
		//index 0 pois sempre remove o primeiro da lista.
		fila.remove(0);
	}

	public boolean vazia() {
		return fila.isEmpty();
	}

	@Override
	public String toString() {
		return fila.toString();
	}


}

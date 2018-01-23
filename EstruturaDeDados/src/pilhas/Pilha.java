package pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	List<String> lista = new LinkedList<>();
	
	public void insere(String nome) {
		lista.add(nome);
	}
	
	public void remove() {
		lista.remove(lista.size() -1);
	}
	
	public boolean vazia() {
		return lista.isEmpty();
	}

	@Override
	public String toString() {
		return lista.toString();
	}
	
}

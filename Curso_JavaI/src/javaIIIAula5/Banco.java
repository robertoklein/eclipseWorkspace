package javaIIIAula5;

import java.util.HashMap;
import java.util.Map;

public class Banco {

	private Map<String,Conta> contas = new HashMap<>();
	
	public void adiciona(Conta c) {
		contas.put(c.getNomeCliente(), c);
	}
	
	public Conta pega(int index) {
		return contas.get(index);
	}
	
	public int pegaQtdadeContas() {
		return contas.size();
	}
	
	public Conta getPorNome(String nome) {
		return contas.get(nome);
	}
	
}

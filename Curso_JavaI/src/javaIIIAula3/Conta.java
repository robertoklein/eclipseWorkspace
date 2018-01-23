package javaIIIAula3;

public class Conta {
	
	private int numero;
	private String nome;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta c = (Conta) obj;
		return this.numero == c.numero && this.nome == c.nome;
	}

}

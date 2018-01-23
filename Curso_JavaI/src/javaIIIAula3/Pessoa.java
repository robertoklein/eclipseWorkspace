package javaIIIAula3;

public class Pessoa {
	
	private String nome;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean equals(Pessoa p) {
		//Pessoa p = (Pessoa) obj;
		return p.getNome() == this.nome && p.getCpf() == this.cpf;
	}
	
	@Override
	public String toString() {
		return "toString sobrescrito: " + "nome: "+ this.nome + " cpf: " +this.cpf;
	}

}

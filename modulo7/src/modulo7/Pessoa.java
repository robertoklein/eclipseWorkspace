package modulo7;

public class Pessoa {

	private int rg;
	private String nome;
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "nome: " + this.nome + " rg: " + this.rg;
	}
	
	
}

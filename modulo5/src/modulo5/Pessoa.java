package modulo5;

public class Pessoa {

	private int rg;
	private String nome;
	private int salario;
	
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
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) throws SalarioException{
		int salarioMinimo = 750;
		if(salario >= salarioMinimo) {
			this.salario = salario;
		}else {
			System.out.println("entrou no else");
			throw new SalarioException();
		}
	}
	
	
	
	
}

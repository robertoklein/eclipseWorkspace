package javaIIAula4;

abstract class Funcionario {

	private String nome;
	protected double salario;

	public void testaMetodoFunc() {
		System.out.println("testa metodo no funcionario");
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public abstract double getBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	
	
}

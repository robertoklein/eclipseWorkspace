package pac2;

public class Funcionario {

	
	private String cargo;
	private String nome;
	
	public void motodoNormal() {
		System.out.println("esse é um metodo normal");
	}
	
	public final void metodoFinal() {
		System.out.println("esse é um metodo final");
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}

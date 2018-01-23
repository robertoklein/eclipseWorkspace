package javaIIAula4;

public class Gerente extends Funcionario{

	public double getBonus(){
		System.out.println("getBonus do gerente");
		return this.salario * 0.4;
	}
	
	public void testaMetodoGerente() {
		System.out.println("metodo somente para teste");
	}
	
}

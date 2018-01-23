package javaIIAula4;

public class Desenvolvedor extends Funcionario{

	public double getBonus(){
		System.out.println("getBonus do Desenvolvedor");
		return this.salario * 0.25;
	}
}

package javaIIAula4;

public class TestaFuncionario {

	public static void main (String[] args){

		/**
		 * nao faz sentido instanciar assim, pois aqui, o objeto tem acesso a todos os metodos da classe abstrata
		 * Funcionario, mas nao aos metodos unicos de gerente.
		 */
		Funcionario joao = new Gerente();
		joao.setSalario(1000.0);
		joao.testaMetodoFunc();
		
		/**
		 * Já aqui, o objeto tem acesso a todos os metodos da classe abstrata e também a todos os metodos
		 * unicos da classe gerente.
		 */
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		/**
		 * metodo criado na classe gerente, somente sendo visivel a esse tipo de instanciação.
		 */
		joaquim.testaMetodoGerente();
		joaquim.getBonus();
		/**
		 * metodo criado na classe abstrata, sendo visivel nos dois tipos de instanciação.
		 */
		joaquim.testaMetodoFunc();
		
		System.out.println("bonus do joao: " + joao.getBonus());
		System.out.println("bonus do joaquim: " + joaquim.getBonus());
	}
	
}

package modulo5;

public class Inicio {

	public static void main(String[] args) {


		Pessoa p = new Pessoa();
		Leitura l = new Leitura();

		p.setRg(123);
		p.setNome("roberto");

		boolean continua = true;

		while(continua) {

			try {
				p.setSalario(Integer.parseInt(Leitura.inData("SALARIO")));
				continua = false;
			} catch (SalarioException e) {
				System.out.println("deu pau!!! ");
				e.impErro();	
			}
		}

		
		System.out.println("rg: " + p.getRg());
		System.out.println("nome: " + p.getNome());
		System.out.println("salario: "+ p.getSalario() );

	}
}

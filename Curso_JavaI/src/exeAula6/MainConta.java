package exeAula6;

public class MainConta {

	public static void main(String[] args) {

		ContaCorrente joao = new ContaCorrente();

		try {
			joao.deposita(-4);
		}catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}	
		
		try {
			joao.saca(100);
		}catch(Exception e) {
			System.out.println("exception e: " + e.getMessage());
		}

		System.out.println("saldo: " + joao.getSaldo());
		
		//aqui da um erro de memoria
		 //String[] ss = new String[Integer.MAX_VALUE];
	}
}

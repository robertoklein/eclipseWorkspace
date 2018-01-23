package exeAula6;

public class ValorInvalidoException extends RuntimeException{

		private String msg;
	
	public ValorInvalidoException(double valor) {
		super("Valor invalido!!!!!! " + valor);
	}
	
	
	
	
}

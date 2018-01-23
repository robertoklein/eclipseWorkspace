package pac2;

public class TestaDiv {

	
	public static void main(String[] args) {
		
		//Leitura l = new Leitura();
		boolean testDiv = true;
		while(testDiv) {
			try {
				int numero = Integer.parseInt(Leitura.inData("entre com um numero"));
				int divisor = Integer.parseInt(Leitura.inData("entre com o divisor"));
				System.out.println("o resultado da divisao é: " + numero/divisor);
				testDiv = false;
			}catch (ArithmeticException e) {
				System.out.println("nao existe divisao por 0: " + e);
			}catch (NumberFormatException e) {
				System.out.println("o numero e/ou divisor devem ser numeros: " + e);
			}
		}
	}
}

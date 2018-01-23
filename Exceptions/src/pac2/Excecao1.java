package pac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excecao1 {

	public static void main(String[] args) {
		
		BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("entrada de dados");
		String s = "";
		boolean continua = true;
		while(continua) {
		System.out.println("entre com um valor: ");
		
		try {
			s = memoria.readLine();
			int numero = Integer.parseInt(s); 
			System.out.println("o quadrado do valor de entrada: " + numero*numero);
			continua = false;
		}catch (IOException erro1) {
			System.out.println("erro de entrada de dados: " + erro1);
		}catch (NumberFormatException e) {
			System.err.println("a entrada deve ser um numero " + e);
		} finally {
			System.out.println("entrou no finally");
		}
	}
		
		System.out.println("o valor de entrada foi: " + s);
		System.out.println();
	}
}

package javaIIIAula4;

import java.io.InputStream;
import java.util.Scanner;

public class EntradaComScanner {

	public static void main(String[] args) {
	
    InputStream is = System.in;
    Scanner entrada = new Scanner(is);

    System.out.println("Digite sua mensagem:");
    while (entrada.hasNextLine()) {
        System.out.println(entrada.nextLine());
    }
    entrada.close();
	
	}
}

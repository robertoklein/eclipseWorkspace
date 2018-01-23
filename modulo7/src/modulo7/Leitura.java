package modulo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
	
	public static String inData(String rotulo){
		 InputStreamReader teclado = new InputStreamReader(System.in);
		 BufferedReader memoria = new BufferedReader(teclado);
		 System.out.print(rotulo);
		 String s = "";
		 try{
		 s = memoria.readLine();
		 }
		 catch(IOException e){
		 System.out.println("Erro de entrada");
		 }
		 return s;
		 }
	

}

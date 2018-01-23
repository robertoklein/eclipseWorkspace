package pac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

	public static String inData(String label) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(input);
		System.out.println(label);
		
		String s = "";

		try {
			s = bf.readLine();
		} catch (IOException e) {
			System.out.println("erro de entrada!! " + e);
		}
		
	return s;	
	}
}

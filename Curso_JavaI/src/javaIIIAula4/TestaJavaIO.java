package javaIIIAula4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {
	
	public static void main(String[] args) throws IOException {
		
		//InputStream is = new FileInputStream("leitura.txt");
		//InputStreamReader isr = new InputStreamReader(is);
		//BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(
											new InputStreamReader(
													new FileInputStream("arquivo.txt")));
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while(linha != null) {
		System.out.println(linha);
		linha = br.readLine();
		bw.append(linha);
		bw.newLine();
		
		}
		br.close();
		bw.close();
	}

}

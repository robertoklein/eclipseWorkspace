package pac2;

import java.util.ArrayList;

public class Cliente {

	private static String nome = "roberto";
	
	public static final ArrayList<String> lista = new ArrayList<>();
	
	private String fone;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome2) {
		nome = nome2;
	}
	
	public static void metodoStatico() {
		Cliente c = new Cliente();
		System.out.println(c.fone);
		String a = c.getNome();
	}
	
	public void metodoNaoEstatico() {
		System.out.println(nome);
	}
	
	public void testa() {
		metodoStatico();
		metodoNaoEstatico();
	}
	
	public static void testaEstatico() {
		metodoStatico();
		//metodoNaoEstatico();
	}
}

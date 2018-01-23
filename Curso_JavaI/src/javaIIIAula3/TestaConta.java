package javaIIIAula3;

public class TestaConta {

	public static void main(String[] args) {

		String a = "Socorram-me, subi no onibus em marrocos";
		String b[] = a.split(" ");

		String aux="";
		
		for(int i = b.length -1; i >= 0; i-- ){
			aux = aux + " " + b[i];
		}
		System.out.println(aux.trim());
		
		
		StringBuilder str = new StringBuilder("Socorram-me, subi no onibus em marrocos");
		System.out.println(str.reverse());
		
	}
}

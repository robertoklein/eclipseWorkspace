package javaIIIAula3;

import java.io.PrintStream;

public class TestaInteger {

	public static void main(String[] args) {

		//Integer x1 = new Integer(10);
		//Integer x2 = new Integer(10);

		//System.out.println(x1);
		//System.out.println(x2);

		String x1 = new String("roberto");
		String x2 = new String("roberto");

		//String x1 = "roberto";
		//String x2 = "roberto";

		//Integer x1  = 10;
		//Integer x2 = 10;
		
		Pessoa p1 = new Pessoa();
		p1.setNome("roberto");
		p1.setCpf("12345");
		
		Pessoa p2 = new Pessoa();
		p2 = p1;
		
		if (p1 == p2) {
			System.out.println("igual com ==");
		} else {
			System.out.println("diferente ==");
		}

		if (p1.equals(p2)) {
			System.out.println("igual com equals");
		} else {
			System.out.println("diferente com equals");
		}

		//if (x1 == x2) {
		//	System.out.println("igual com ==");
		//} else {
		//	System.out.println("diferente ==");
		//}

		//if (x1.equals(x2)) {
		//	System.out.println("igual com equals");
		//} else {
		//	System.out.println("diferente com equals");
		//}
		
		
		
		System.out.println(p1);
	}
}

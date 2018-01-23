package aula3;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("Certificaçao java", "roberto");
		Aula a1 = new Aula("java I", 15);
		Aula a2 = new Aula("java II", 21);
		Aula a3 = new Aula("java III", 20);
		Aula a4 = new Aula("java Web", 13);
		
		c1.adiciona(a1);
		c1.adiciona(a2);
		c1.adiciona(a3);

		Curso c2 = new Curso("Angular", "klein");
		
		System.out.println("c2: " + c2.getAulas());
		List<Aula> lista2 = c2.getAulas();
		lista2.add(a3);
		System.out.println("c2: " + c2.getAulas());
		
		System.out.println("=====================================");
		List<Aula> lista = c1.getAulas();
		lista.add(a4);
		
		System.out.println("lista: " + lista);
		System.out.println("===================================================");
		System.out.println("c1.getAulas: " + c1.getAulas());

	}
}

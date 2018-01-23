package aula3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {


	public static void main(String[] args) {

		ArrayList<Aula> cursos = new ArrayList<>();
		
		Aula a1 = new Aula("aula1", 15);
		Aula a2 = new Aula("java 8", 20);
		Aula a3 = new Aula("Angular", 25);
		
		cursos.add(a1);
		cursos.add(a2);
		cursos.add(a3);
	
		System.out.println(cursos);
		System.out.println("============================");
	
		//ordenação por ordem alfabetica
		Collections.sort(cursos);
		
		System.out.println(cursos);
		System.out.println("=============================");
		
		//ordenação por tempo de aula
		cursos.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(cursos);
	}
}

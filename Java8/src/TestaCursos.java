import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(obj -> obj.getAlunos()));	

		//cursos.stream()
		//.filter(obj -> obj.getAlunos() > 50)
		//.forEach(obj -> System.out.println(obj.getNome()));


		List<Curso> resultado = cursos.stream()
		.filter(c -> c.getAlunos() >= 50)
		.collect(Collectors.toList());
			
		resultado.stream()
		.forEach(obj -> System.out.println(obj.getNome()));
		
		OptionalDouble sum = cursos.stream()
				.mapToInt(Curso::getAlunos)
				.average();

		//System.out.println(sum);

		LocalDate olimpiadasRio = LocalDate.now();
		
	}
}

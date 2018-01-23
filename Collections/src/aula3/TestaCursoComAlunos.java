package aula3;

public class TestaCursoComAlunos {
			
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Certificaçao java", "roberto");

		Aula a1 = new Aula("java I", 15);
		Aula a2 = new Aula("java II", 21);
		Aula a3 = new Aula("java III", 20);
		Aula a4 = new Aula("java Web", 13);
		
		javaColecoes.adiciona(a1);
		javaColecoes.adiciona(a2);
		javaColecoes.adiciona(a3);
		javaColecoes.adiciona(a4);
		
		Aluno al1 = new Aluno("Rodrigo", 34563);
		Aluno al2 = new Aluno("Guilherme", 34665);
		Aluno al3 = new Aluno("Mauricio", 34233);
		
		javaColecoes.matricula(al1);
		javaColecoes.matricula(al2);
		javaColecoes.matricula(al3);
		
		System.out.println("alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(obj -> {
			System.out.println(obj);
		});
		
	}
}

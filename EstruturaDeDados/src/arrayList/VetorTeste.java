package arrayList;

public class VetorTeste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("joao");
		Aluno a2 = new Aluno("jose");
		Aluno a3 = new Aluno("roberto");
		Aluno a4 = new Aluno("maria");
		
		Vetor lista = new Vetor();
		
		System.out.println("tamanho da lista: " + lista.tamanho());
		lista.adiciona(a1);
		lista.adiciona(1, a2);
		lista.adiciona(3, a3);
		
		lista.adiciona(87, a4);
		
		System.out.println("tamanho da lista: " + lista.tamanho());
		
		System.out.println(lista);

	}
}

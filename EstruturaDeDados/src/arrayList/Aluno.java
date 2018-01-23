package arrayList;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.getNome());
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}

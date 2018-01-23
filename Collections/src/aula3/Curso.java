package aula3;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	//private Set<Aluno> alunos = new HashSet<>();
	//linkedhasSet
	private Set<Aluno> alunos = new LinkedHashSet<>();
	
	public Curso(String nome, String instrutor) {
		this.nome=nome;
		this.instrutor=instrutor;
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	//unmodifiableList serve para nao deixar inserir itens com add, so é possível inserção atraves de um metodo do proprio objeto.
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for(Aula obj : aulas) {
			tempoTotal += obj.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + " duração total: " + this.getTempoTotal() + " aulas: " + this.aulas;
	}
}

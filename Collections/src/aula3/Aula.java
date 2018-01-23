package aula3;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return " titulo: " + this.titulo + " com duracao: " + this.tempo + " minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
	
}

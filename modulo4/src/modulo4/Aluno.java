package modulo4;

public class Aluno extends Pessoa implements VerifTurma{

	private int ra;
	private String turma;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	@Override
	public void contLetra() {
		System.out.println("entrou");
		if(turma.equalsIgnoreCase("a")){
			System.out.println("\n Turma eh A --> "+mensagem1);
		}
		else System.out.println("\n Turma e B --> "+mensagem2);
	}

	@Override
	public void mostraClasse() {
		System.out.println("classe aluno");
	}
}

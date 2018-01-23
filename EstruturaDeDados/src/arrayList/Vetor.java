package arrayList;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	private int adicionaCerto(int posicao) {
		
		System.out.println("entrou no adiciona certo");
		
		/**
		 * aqui verifica se a posicao anterior é nula, se for, ele volta uma posicao e verifica novamente se a anterior é nula,
		 * se nao for nula, ele adiciona o elemento, serve para evitar que um elemento seja adicionado em qualquer lugar de um array 
		 * com tamanho ja definido.
		 */
		if((alunos[posicao-1]) == null) {
			System.out.println("entrou no adiciona certo if");
			while((alunos[posicao-1]) == null) {
				System.out.println("posicao 1: " + posicao);
				System.out.println("entrou no adiciona certo while" );
				posicao = posicao -1;
				System.out.println("posicao 2: " + posicao);
			}
		}
		return posicao;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		int posicaoCorrigida;
		posicaoCorrigida = this.adicionaCerto(posicao);
		this.garanteEspaco();
		for(int i = totalDeAlunos - 1; i >= posicaoCorrigida; i-=1) {
	        alunos[i+1] = alunos[i];
	    }
	    alunos[posicaoCorrigida] = aluno;
	    totalDeAlunos++;
		
	}
	
	public void remove(int posicao) {
	    for(int i = posicao; i < this.totalDeAlunos; i++) {
	        this.alunos[i] = this.alunos[i+1];
	    }
	    totalDeAlunos--;
	}
	/**
	 * metodo para aumentar o tamanho de um array.
	 */
	private void garanteEspaco() {
	    if(totalDeAlunos == alunos.length) {
	        Aluno[] novoArray = new Aluno[alunos.length*2];
	        for(int i = 0; i < alunos.length; i++) {
	            novoArray[i] = alunos[i];
	        }
	        this.alunos= novoArray;
	    }
	}

	public Aluno pega(int posicao) {		
		if(posicaoValida(posicao)) {
			return alunos[posicao];
		}else {
			throw new IllegalArgumentException("posicao invalida");
		}
	}

	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao < totalDeAlunos;
	}

	public boolean contem(Aluno aluno) {
		for(int i = 0; i < totalDeAlunos; i++) {
			if(alunos[i].equals(aluno)) {
				return true;
			}
			System.out.println("saiu do if");
		}
		System.out.println("saiu do for");
		return false;
	}

	public int tamanho() {
		return totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}

}

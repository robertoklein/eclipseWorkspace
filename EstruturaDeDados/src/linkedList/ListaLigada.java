package linkedList;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos=0;
	
	public void adicionaComeco(Object elemento) {
		//o primeira do construtor sempre vai ser o valor do do ultimo elemento adicionado, que era o antigo primeiro.s
		Celula nova = new Celula(elemento, primeira);
		this.primeira=nova;
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	public void adicionaMeio(int posicao, Object elemento) {
		if(posicao == 0) {
			adicionaComeco(elemento);
		}else if(posicao == this.totalDeElementos) {
			adicionaFim(elemento);
		}else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			this.totalDeElementos++;
		}
	}

	public void adicionaFim(Object elemento) {
		
		if(this.totalDeElementos == 0) {
			adicionaComeco(elemento);
		}else {
			Celula nova = new Celula(elemento,null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	public int tamanho() {
		return totalDeElementos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}
		Celula atual = primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		for(int i =0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}	
}

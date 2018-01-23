package listaDuplamenteLigada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos=0;

	public void adicionaComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			Celula nova = new Celula(elemento,this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
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
			Celula proxima = anterior.getProximo();
			Celula nova = new Celula(elemento, anterior.getProximo());
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}

	public void adicionaFim(Object elemento) {
		if(this.totalDeElementos == 0) {
			adicionaComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			totalDeElementos++;
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

	public void removeDoFim() {
		if(totalDeElementos == 1) {
			removeDoComeco();
		}else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			totalDeElementos--;
		}
	}

	public void remove(int posicao) {
		if(posicao == 0) {
			removeDoComeco();
		}else if(posicao == this.totalDeElementos -1) {
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();

			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
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

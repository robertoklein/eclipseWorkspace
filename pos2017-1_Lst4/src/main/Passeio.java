//ALUNO Roberto Luiz Klein Filho
package main;

//classe nao pode ser extendida
public final class Passeio extends Veiculo{

	private int qtdePassageiros;
	
	public Passeio() {
		qtdePassageiros = 0;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	@Override
	public int calcVel(int vel) {
		return vel * 1000;
	}
	
}

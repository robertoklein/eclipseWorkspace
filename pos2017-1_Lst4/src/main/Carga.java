//ALUNO Roberto Luiz Klein Filho
package main;

//classe nao pode ser extendida
public final class Carga extends Veiculo{

	private int tara;
	private int cargaMax;
	
	public Carga() {
		tara = 0;
		cargaMax = 0;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public int calcVel(int vel) {
		return vel * 100000;
	}	
}

package pond.swan;

import pond.duck.MotherDuck;

public class BadCygnet {

	/*
	 * nao compila pq os metodos e atributos estao com default access, assim, tomam a forma de um private,
	 * somente sendo visivel para classes do mesmo pacote.
	 */	
	
	public void makeNoise() {
		MotherDuck m = new MotherDuck();
		m.quack();
		System.out.println(m.noise);
	}	
}

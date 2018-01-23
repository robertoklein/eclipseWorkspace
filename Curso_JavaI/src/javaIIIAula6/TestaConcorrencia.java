package javaIIIAula6;

public class TestaConcorrencia {
	
	public static void main(String[] args) {
		
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorArquivos copiador = new CopiadorArquivos();
		Thread t2 = new Thread(copiador);
		t2.start();
		
		
		
	}

}

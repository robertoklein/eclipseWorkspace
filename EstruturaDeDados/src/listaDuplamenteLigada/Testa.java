package listaDuplamenteLigada;

public class Testa {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaComeco("roberto");
		System.out.println(lista);
		lista.adicionaComeco("klein");
		System.out.println(lista);
		lista.adicionaFim("luiz");
		System.out.println(lista);
		
		//lista.adicionaMeio(1, "filho");
		
		//System.out.println(lista);
		
		lista.removeDoFim();
		
		System.out.println(lista);
		
	}
}

package linkedList;

public class Testa {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaComeco("roberto");
		lista.adicionaComeco("klein");
		lista.adicionaFim("luiz");
		
		lista.adicionaMeio(1, "filho");
		
		System.out.println(lista);
		
		lista.removeDoComeco();
		
		System.out.println(lista);
		
	}
}

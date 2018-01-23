package fila;

public class TestaFila {

	public static void main(String[] args) {
		
		
		Fila fila = new Fila();
		
		System.out.println(fila.vazia());
		
		fila.adiciona("roberto");
		fila.adiciona("ronaldo");
		fila.adiciona("ricardo");
		fila.adiciona("rodrigo");
		fila.adiciona("rogerio");

		System.out.println(fila);
		System.out.println(fila.vazia());
		fila.remove();
		
		System.out.println(fila);
		
		
	}
}

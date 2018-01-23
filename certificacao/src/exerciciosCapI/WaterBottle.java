package exerciciosCapI;

public class WaterBottle {

	/**
	 * EXERCICIO 2 RESPOSTA D
	 * por nao inicializar as variaveis, vai assumir o valor padrao de cada uma delas.
	 */
	private String brand;
	private boolean empty;
	
	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle();
		System.out.println("Emprty = " + wb.empty);
		System.out.println(", brand = " + wb.brand);
	}
}

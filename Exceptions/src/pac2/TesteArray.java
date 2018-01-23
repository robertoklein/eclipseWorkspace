package pac2;

public class TesteArray {

	public static void main(String[] args) {

		int vetor[] = new int[5];
		boolean continua = true;

		while(continua) {
			try {
				int valor = Integer.parseInt(Leitura.inData("informe o valor: "));
				int endereco = Integer.parseInt(Leitura.inData("informe o endereco: "));
				vetor[endereco] = valor;
				System.out.println("valor "+vetor[endereco] + " na posicao " + endereco );
				continua = false;
			}catch (NumberFormatException e) {
				System.out.println("deu pau, vai voltar para começo! " + e);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu pau no array!! " + e);
			}
		}
	}
}

package exeAula4;

public class GerenciadorDeImpostoDeRenda {

	private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t.toString());
        this.total +=  t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
	
}

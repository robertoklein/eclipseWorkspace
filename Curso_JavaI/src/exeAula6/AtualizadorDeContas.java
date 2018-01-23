package exeAula6;

public class AtualizadorDeContas {
	private static double saldoTotal = 0;
    private double selic;

    //construtor
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c) {
    	 // aqui você imprime o saldo anterior
    	System.out.println("saldo anterior: " + c.getSaldo());
        // atualiza a conta com a taxa selic,
    	c.atualiza(this.selic);
        // e depois imprime o saldo final
    	System.out.println("saldo final: " + c.getSaldo());
        // lembrando de somar o saldo final ao atributo saldoTotal
        saldoTotal+=c.getSaldo();
    }
    // outros métodos, colocar o getter para saldoTotal!
    public double getSaldoTotal(){
    	return this.saldoTotal;
    }
}

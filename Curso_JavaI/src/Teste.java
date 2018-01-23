class Conta {

	//anotar como private, pois se é private nao poderá ser acessada pelas classe que herdam Conta
	protected double saldo;

	
	public void atualiza(double taxa) {
        saldo += saldo * taxa * 3;
		}
	
	public double getSaldo(){
		return this.saldo;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public void saca(double valor){
		this.saldo -= valor;
	}
}

class ContaCorrente extends Conta {
		public void atualiza(double taxa) {
        saldo += saldo * taxa * 2;
		}
	}

class ContaPoupanca extends Conta {

		public void atualiza(double taxa) {
        saldo += saldo * taxa * 3;
		}

		public void deposita(double valor) {
        saldo += valor - 0.10;
    	}
}

class AtualizadorDeContas {
    private static double saldoTotal = 0;
    private double selic;

    //construtor
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
    	 // aqui você imprime o saldo anterior
    	System.out.println("saldo anterior: " + c.getSaldo());

        // atualiza a conta com a taxa selic
    	c.atualiza(this.selic);

        // e depois imprime o saldo final
    	System.out.println("saldo final: " + c.getSaldo());

        // lembrando de somar o saldo final ao atributo saldoTotal
        saldoTotal+=c.getSaldo();
    }

    // outros métodos, colocar o getter para saldoTotal!
}

public class Teste {
	public static void main(String[] args) {
		
	}
}

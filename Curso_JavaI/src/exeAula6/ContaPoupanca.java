package exeAula6;

public class ContaPoupanca extends Conta{
	
	public void testa3() {
		
	}
	
	public void atualiza(double taxa) {
        saldo += saldo * taxa * 3;
		}

		public void deposita(double valor) {
        saldo += valor - 0.10;
    	}
}

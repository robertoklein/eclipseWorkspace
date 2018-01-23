package exeAula6;

public class ContaCorrente extends Conta implements Tributavel{
	
	public void atualiza(double taxa) {
        saldo += saldo * taxa * 2;
		}
	
	public void testaMetodoCC() {
		System.out.println("testa metodo cc");
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}

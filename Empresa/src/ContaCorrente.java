
public class ContaCorrente extends Conta{

	public double atualiza(double taxa) {
        return this.saldo += this.saldo * taxa * 2;
    }
	
}

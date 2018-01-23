
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	 //public double atualiza(double taxa) {
		 //return this.saldo += this.saldo * taxa * 3;
	   // }

	    public double deposita(double valor) {
	      return this.saldo += valor - 0.10;
	    }

	@Override
	public double atualiza(double taxa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(ContaPoupanca cp) {
		return this.getNumero() - cp.getNumero();
	}
	
}

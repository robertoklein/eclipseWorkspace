
public abstract class Conta {

	protected double saldo;
	protected int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		 return this.saldo=saldo;
	}
	
	public double deposita(double valor) {
		return this.saldo+=valor;
	}
	
	public double saca(double valor) {
		return this.saldo-=valor;
	}
	
	public abstract double atualiza(double taxa);
	
}

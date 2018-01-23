package exeAula6;

public abstract class Conta {

	//anotar como private, pois se é private nao poderá ser acessada pelas classe que herdam Conta
	protected double saldo;

	
	public void testaMetodoConta() {
		System.out.println("testa metodo no conta");
	}

	public abstract void atualiza(double taxa);
      
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void deposita(double valor){
		if(valor > 0) {
			this.saldo += valor;
		}else {
			//throw new IllegalArgumentException("valor negativo");
			throw new ValorInvalidoException(valor);
		}
	}
	
	public void saca(double valor){
		if(saldo >= valor) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException(saldo);
		}
		
	}
	
}

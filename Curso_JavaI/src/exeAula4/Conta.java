package exeAula4;

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
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
}

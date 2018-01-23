
public class Main {

	public static void main(String[] args) {
			Funcionario joao = new Funcionario();
			joao.setSalario(1000);
			System.out.println(joao.getBonus());
			
			Gerente joaquim = new Gerente();
			joaquim.setSalario(2000);
			
			System.out.println(joaquim.getBonus());
			
			Conta c = new ContaCorrente();
	        Conta cc = new ContaCorrente();
	        Conta cp = new ContaPoupanca();

	        c.deposita(1000); 
	        cc.deposita(1000); 
	        cp.deposita(1000);

	        c.atualiza(0.01);
	        cc.atualiza(0.01);
	        cp.atualiza(0.01);

	        System.out.println(c.getSaldo());
	        System.out.println(cc.getSaldo());
	        System.out.println(cp.getSaldo());
	        
	        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

	        adc.roda(c);
	        adc.roda(cc);
	        adc.roda(cp);

	        System.out.println("Saldo Total: " + adc.getSaldoTotal());
			
			
	}
}

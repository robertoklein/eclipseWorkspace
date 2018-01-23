package exeAula4;

public class MainConta {

	 public static void main(String[] args) {
	        
	        //Conta c = new Conta();
	        ContaCorrente cc = new ContaCorrente();
	        Conta cp = new ContaPoupanca();
	        //c.deposita(1000); 
	        cc.deposita(1000); 
	        cp.deposita(1000);
	       // c.atualiza(0.01);
	        cc.atualiza(0.01);
	        cp.atualiza(0.01);
	        
	        //System.out.println(c.getSaldo());
	        System.out.println(cc.getSaldo());
	        System.out.println(cp.getSaldo());

	        System.out.println("============================================");

	        //AtualizadorDeContas att = new AtualizadorDeContas(0.3);
	        //att.roda(cc);
	        //att.roda(cp);
	        //System.out.println("saldo total: " + att.getSaldoTotal());   
	        
	        cc.deposita(100);
	        System.out.println(cc.calculaTributos());
	        
	        Tributavel t = cc;
	        System.out.println(t.calculaTributos());
	    }
	 
	 
}

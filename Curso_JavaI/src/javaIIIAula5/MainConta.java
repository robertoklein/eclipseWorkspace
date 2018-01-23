package javaIIIAula5;

public class MainConta {
	
	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1);
		c1.setNomeCliente("roberto1");
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(2);
		c2.setNomeCliente("roberto2");
		ContaCorrente c3 = new ContaCorrente();
		c3.setNumero(3);
		c3.setNomeCliente("roberto3");
		ContaCorrente c4 = new ContaCorrente();
		c4.setNumero(4);
		c4.setNomeCliente("roberto4");
		
		ContaCorrente c5 = new ContaCorrente();
		c5.setNumero(3);
		c5.setNomeCliente("roberto3");
		
		ContaCorrente c6 = new ContaCorrente();
		c6.setNumero(3);
		c6.setNomeCliente("roberto4");

		Banco b = new Banco();
		
		b.adiciona(c1);
		b.adiciona(c2);
		b.adiciona(c3);
		b.adiciona(c4);
		b.adiciona(c5);
		b.adiciona(c6);
		
		String nome = "roberto1";
		Conta c = b.getPorNome(nome);
		System.out.println("numero da conta: " + c.numero);
		
		System.out.println("qtade de contas: " + b.pegaQtdadeContas());
		
		
	}

}

package pac2;

public class Teste {
	
	private static final Cliente cli = new Cliente();
	
	public static void main(String[] args) {
	
		cli.setNome("cli");
		
		Cliente c1 = new Cliente();
		c1.setNome("c1");
		
		c1 = cli;
		
		System.out.println(c1.getNome());
		System.out.println(cli.getNome());
	}
}

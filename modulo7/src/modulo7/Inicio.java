package modulo7;

public class Inicio {

	
	public static void main(String[] args) {
		
		BDSist banco = new BDSist();
		int count = 0;
		
		while(count < 4) {
		Pessoa p = new Pessoa();
		p.setNome(Leitura.inData("informe o nome da pessoa "));
		p.setRg(Integer.parseInt(Leitura.inData("informe o RG da pessoa ")));
		System.out.println("=========================");
		banco.BDPes.add(p);
		count++;
		}
		
		for(Pessoa obj : banco.BDPes) {
			System.out.println(obj);
		}
		
	
	}	
}

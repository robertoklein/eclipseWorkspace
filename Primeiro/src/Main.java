public class Main {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "roberto";
		f.datainicio = new Data();
		f.datainicio.preencheData(19,9,2017);
		f.salario=2200;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "asdasdasd";
		f2.datainicio = new Data();
		f2.datainicio.preencheData(19,9,2017);
		f2.salario=2500;
		
		Empresa e = new Empresa();
		e.nome="empresa1";
		e.cnpj="12312312";
		e.adicionar(f2);
		e.adicionar(f);	
			
		for(Funcionario obj : e.lista) {
			Funcionario func = new Funcionario();
			func.mostra(obj);
		}
		
		Empresa e2 = new Empresa();
		
		Funcionario funci = new Funcionario();
		if(funci.busca(f, e2)){
			System.out.println("funcionario encontrado");
		}else {
			System.out.println("funcionario nao encontrado");
		}
	}
}



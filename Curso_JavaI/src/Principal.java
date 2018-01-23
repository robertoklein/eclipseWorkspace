class Funcionario{
		private String nome;
		private String cargo;
		private double salario;

		Funcionario(String nome){
			this.nome = nome;
		}

		public String getCargo() {
			return this.cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public void setSalario(double salario){
			this.salario = salario;
		}
		
		public double getSalario(){
			return this.salario;
		}

		public void setNome(String nome){
		this.nome = nome;	
		}

		public String getNome(){
		return this.nome;
		}
	}

	class Empresa {

		String nome;
		String cnpj;
		Funcionario[] listaFunc;
		int contador = 0;

		//construtor recebendo o tamanho do array
		public Empresa(int tamanho){
			this.listaFunc = new Funcionario[tamanho];	
		}

		void adicionar(Funcionario f) {
		this.listaFunc[contador] = f;  
		this.contador++;
		}

		void mostraFuncionarios(){
		for(int i = 0; i < this.listaFunc.length; i++){
			Funcionario func = this.listaFunc[i];
				if(func == null) continue;
			System.out.println("nome: " + func.getNome());
			System.out.println("cargo: " + func.getCargo());
			System.out.println("==========================");
			}
	}

		boolean contemFuncionario(Funcionario f){
			for(int i = 0; i < this.listaFunc.length; i++){
				if(this.listaFunc[i] == f){
					return true;
				}
			  }
				return false;
		    }
	}

	class Principal {
		public static void main(String[] args){

		Empresa empresa = new Empresa(3);
		//empresa.listaFunc = new Funcionario[10];	

		Funcionario f1 = new Funcionario("roberto");
		f1.setCargo("programador");

		Funcionario f2 = new Funcionario("klein");
		f2.setCargo("analista de sistemas");

		empresa.adicionar(f1);
		empresa.adicionar(f2);

		}
	}
	
	


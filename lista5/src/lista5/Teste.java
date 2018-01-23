//ROBERTO LUIZ KLEIN FILHO
package lista5;

import java.util.List;

public class Teste {

	public static void main(String[] args) {

		Leitura l = new Leitura();
		BDVeiculos banco = new BDVeiculos();
		int opcao = 0;
		//variavel para continuar rodando a aplicacao
		boolean continua = true;

		while(continua){
			System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
			System.out.println("==============================================");
			System.out.println("( 1 ) - Cadastrar Veículo de Passeio");
			System.out.println("\n( 2 ) - Cadastrar Veículo de Carga");
			System.out.println("\n( 3 ) -  Imprimir Todos os Veículos de Passeio");
			System.out.println("\n( 4 ) -  Imprimir Todos os Veículos de Carga");
			System.out.println("\n( 5 ) -  Imprimir Veículo de Passeio pela Placa");
			System.out.println("\n( 6 ) -  Imprimir Veículo de Carga pela Placa");
			System.out.println("\n( 7 ) -  Alterar dados do Veículo de Passeio pela Placa");
			System.out.println("\n( 8 ) -  Alterar dados do Veículo de Carga pela Placa");
			System.out.println("\n( 9 ) - Sair");
			System.out.println("==============================================");

			opcao=Integer.parseInt(l.entra(("\n Escolha uma opcao: ")));

			switch(opcao){
			case 1:
				//variavel para continuar cadastrando veiculo de passeio.
				boolean loop = true;
				while(loop) {
					System.out.println("\n Cadastrar Veículo de Passeio");
					Passeio p = new Passeio();
					boolean continuaPlaca = false;
					//while para continuar cadastrar o veiculo, informando uma nova placa.
					while(!continuaPlaca) {
						String placa = l.entra("informe a placa: ");
						boolean existe = true;
						try {
							existe = banco.verificaPlacaPasseio(placa);
						} catch (VeicExistException e) {
							e.erro();
							System.out.println("======================");
							System.out.println("deseja continuar cadastrando o veiculo?");
							System.out.println("(0) SIM (1) NAO");
							int i = Integer.parseInt(l.entra("Escolha uma opcao! "));
							if(i == 1) {
								continuaPlaca = true;
								loop = false;
							}
						}
						if(existe == false) {
							p.setPlaca(placa);
							continuaPlaca = true;
						}
					}	

					if(loop) {
						p.setMarca(l.entra("Informe a marca do veiculo"));
						p.setModelo(l.entra("Informe o modelo do veiculo"));
						p.setQtdRodas(Integer.parseInt(l.entra("Informe a quantidade de rodas do veiculo")));
						banco.cadPasseio(p);

						System.out.println("======================");
						System.out.println("deseja cadastrar outro veiculo de passeio?");
						System.out.println("(0) SIM (1) NAO");
						int resposta = Integer.parseInt(l.entra("\n Escolha uma opcao: "));
						if(resposta == 1) {
							loop = false;
						}else {
							loop = true;
						}
					}
				}
				break;
			case 2:
				System.out.println("\n voce escolheu a opcao 2 ");
				break;
			case 3:
				List<Veiculo> lista = banco.listaVeiculosPasseio();
				
				boolean keep = true;
				while(keep) {
					System.out.println("Veiculos de passeio cadastrados");
					for(Veiculo v : lista) {
						System.out.println("===========================");
						System.out.println("Marca: " + v.getMarca());
						System.out.println("Modelo: " + v.getModelo());
						System.out.println("Placa: " + v.getPlaca());
						System.out.println("Qtd de rodas: " + v.getQtdRodas());
					}
					System.out.println("======================");
					l.entra("\n Pressione qualquer tecla para voltar ao menu! ");
						keep = false;
				}

				break;
			case 4:
				break;
			case 5:
				
				Veiculo v = banco.listaPasseioPorPlaca(l.entra("\n informe a placa a ser buscada! "));
				
				boolean keep2 = true;
				while(keep2) {
				
				imprimePorVeiculo(v);
						
				l.entra("\n Pressione qualquer tecla para voltar ao menu! ");
				keep2 = false;
				}
				break;
			case 6:
				break;
			case 7:
	
				Veiculo v2 = banco.listaPasseioPorPlaca(l.entra("\n informe a placa do veiculo a ser alterado! "));
				boolean keep3 = true;
				while(keep3) {
				
				imprimePorVeiculo(v2);
				
				if(v2 != null) {
				System.out.println("==================================");
				Veiculo p = new Passeio();		
				p.setMarca(l.entra("Informe a marca do veiculo a ser alterado"));
				p.setModelo(l.entra("Informe o modelo do veiculo a ser alterado"));
				p.setQtdRodas(Integer.parseInt(l.entra("Informe a quantidade de rodas do veiculo a ser alterado")));
				p.setPlaca(v2.getPlaca());
				
				banco.removeVeiculo(v2);
				banco.cadPasseio(p);
				
				}
				
				l.entra("\n Pressione qualquer tecla para voltar ao menu! ");
				keep3 = false;
				}
				
				break;
			case 8:
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Outras Opcoes (Valor fora da escala do menu)..: "+opcao);
				break; 
			} //fim do switch

		}

	}
	
	public static void imprimePorVeiculo(Veiculo v) {
		if(v.getPlaca() != null) {
			System.out.println("======================");
			System.out.println("Veiculo com placa " + v.getPlaca());
			System.out.println("======================");
			System.out.println("Marca: " + v.getMarca());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Placa: " + v.getPlaca());
			System.out.println("Qtd de rodas: " + v.getQtdRodas());
		}else {
			System.out.println("======================");
			System.out.println("Placa não cadastrada");
			System.out.println("======================");
		}
	}
	
	
}

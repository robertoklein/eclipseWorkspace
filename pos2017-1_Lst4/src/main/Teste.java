//ALUNO Roberto Luiz Klein Filho
package main;

public class Teste {
	public static void main(String[] args) {
			/**
			 * cria um veiculo do tipo passeio
			 */
			Passeio p = new Passeio();
			p.setPlaca("abc-123");
			p.setMarca("Ford");
			p.setModelo("Focus");
			p.setVelocMax(180);
			p.getMotor().setPotencia(120);
			p.getMotor().setQtdPist(4);
			p.setQtdePassageiros(5);
			
			/**
			 * cria um veiculo de carga
			 */
			Carga c = new Carga();
			c.setPlaca("def-456");
			c.setMarca("Ford");
			c.setModelo("modeloDeCaminhao");
			c.setVelocMax(130);
			c.getMotor().setPotencia(3000);
			c.getMotor().setQtdPist(8);
			c.setTara(20000);
			c.setCargaMax(30000);
			
			System.out.println("veiculo passeio");
			System.out.println("===============");
			System.out.println("Marca: " + p.getMarca());
			System.out.println("Modelo: " + p.getModelo());
			System.out.println("Placa: " + p.getPlaca());
			System.out.println("Qtde passageiro: " + p.getQtdePassageiros());
			//calcula a velocidade em m/h
			int velPasseio = p.calcVel(p.getVelocMax());
			System.out.println("Vel. Max: " + velPasseio + " metros por hora");
		
			System.out.println("veiculo carga");
			System.out.println("===============");
			System.out.println("Marca: " + c.getMarca());
			System.out.println("Modelo: " + c.getModelo());
			System.out.println("Placa: " + c.getPlaca());
			System.out.println("Tara: " + c.getTara());
			System.out.println("Carga max: " + c.getCargaMax());
			//calcula a velocidade em m/h 
			int velCarga = c.calcVel(c.getVelocMax());
			System.out.println("Vel. Max: " + velCarga + " centimetros por hora");
			
	}
}

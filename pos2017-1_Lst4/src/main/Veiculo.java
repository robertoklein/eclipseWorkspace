//ALUNO Roberto Luiz Klein Filho
package main;

public abstract class Veiculo {

	String placa;
	String marca;
	String modelo;
	int velocMax;
	Motor motor = new Motor();
	
	public Veiculo() {
		placa="";
		marca="";
		modelo="";
		velocMax=0;
	}
	
	public abstract int calcVel(int vel);
	
	public String getModelo() {
		return modelo;
	}
	
	//nao pode ser sobrescrito
	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	//nao pode ser sobrescrito
	public final void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	//nao pode ser sobrescrito
	public final void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getVelocMax() {
		return velocMax;
	}
	
	//nao pode ser sobrescrito
	public final void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	//nao pode ser sobrescrito
	public final void setMotor(Motor motor) {
		this.motor = motor;
	}
}

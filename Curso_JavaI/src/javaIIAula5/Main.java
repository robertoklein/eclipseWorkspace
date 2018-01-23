package javaIIAula5;

public class Main {
	
	public static void main(String[] args) {
		
		Retangulo r = new Retangulo(3,2);
		System.out.println(r.calculaArea());
		
		Circulo c = new Circulo(5);
		System.out.println(c.calculaArea());
	}
}

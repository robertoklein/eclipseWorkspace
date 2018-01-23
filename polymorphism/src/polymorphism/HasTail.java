package polymorphism;

public interface HasTail {

	public boolean isTailStripped();
	
	public default String testaDefault() {
		return "metodo Default";
	}
	
	public static String testaStatic() {
		return "metodo static";
	}
}

package pac3;

public class Cat {
	
	public String name;
	
	public void parseNmae() {
		
		System.out.println("1");
		
		try {
			System.out.println("2");
			int x = Integer.parseInt(name);
			System.out.println("3");
		}catch (NullPointerException e) {
			System.out.println("4");
		}
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		Cat leo = new Cat();
		leo.name = "leo";
		leo.parseNmae();
		System.out.println("6");
	}
}

package pac1;

public class Order {

	String value = "t";
	
	{ System.out.println("1: ");
		value +="a";	}
	
	{ System.out.println("2: ");
		value += "c"; }
	
	public Order() {
		System.out.println("3: ");
		value+="b";
	}
	
	public Order(String s) {
		System.out.println("4: ");
		value += s;
	}
	
	public static void main(String[] args) {
		System.out.println("5: ");
		Order order = new Order();
		order = new Order();
		System.out.println("6: "+ order.value);
	}
	
}

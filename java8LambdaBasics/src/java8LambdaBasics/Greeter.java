package java8LambdaBasics;

public class Greeter {

	public void greet(Greeting greeting) {
		System.out.println("entrou no greet");
		greeting.perform();
	}
	
	public static void main(String[] args) {
		HWGreeting hw = new HWGreeting();
		hw.perform();
		
		String a = "roberto";
		Greeter g = new Greeter();
		g.greet( () -> System.out.println(a) );
		
		g.greet(hw);
		
		Greeting lambdaGreeting = () -> System.out.println("HelloWorld from lambda");
		Greeting lambdaName = () -> System.out.println("Roberto, just a name");
		
		lambdaGreeting.perform();
		lambdaName.perform();
		
		System.out.println("===========");
		
		g.greet(lambdaGreeting);
	}
}

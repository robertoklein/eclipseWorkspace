package pac2;

public class Capybara extends Rodent {

	public static void main(String[] args) {

		Capybara capy = new Capybara();

		//Rodent r = capy;
		Rodent r = new Capybara();
		//Rodent r = new Rodent();

		if(r instanceof Capybara) {
			System.out.println("true");
			Capybara capy2 = (Capybara)r; 
		}else {
			System.out.println("false");
		}
	}
}

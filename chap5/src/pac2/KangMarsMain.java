package pac2;

public class KangMarsMain {

	public static void main(String[] args) {

		Kanguroo k = new Kanguroo();
		k.getKangurooDescription();
		k.getMarsupialDescription();
		
		System.out.println("=========");
		
		Marsupial joey = new Kanguroo();
		joey.getMarsupialDescription();
		
		System.out.println("=========");
		
		Marsupial m = new Marsupial();
		m.getMarsupialDescription();
	}
}

package exerciciosCapI;

public class Ex3 {

	public static void main(String[] args) {
		
		String s = "roberto";
		
		boolean x = true, z = true;
		int y = 20;
		//System.out.println(z);
		x = (y != 10) ^ (z=false);
		//System.out.println(z);
		//System.out.println(x+", "+y+", "+z);
		
		StringBuilder a = new StringBuilder("roberto");
		StringBuilder b = new StringBuilder("roberto");
		
		String a1 = a.toString();
		String b1 = b.toString();
		
		System.out.println(a1 == a1);
		System.out.println(a1.equals(b));
	}	
}



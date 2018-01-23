package stringEStringBuilder;

public class Otimizacao {

	private static int valor = 50000;
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		String s = "";
		for(int i=0; i<valor; i++) {
			s = s+i;
		}
		long t2 = System.currentTimeMillis();
		
		//==================================
		
		long t3 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<valor; i++) {
			sb.append(i);
		}
		long t4 = System.currentTimeMillis();
		
		System.out.println("tempo gasto com String: " + (t2-t1));
		System.out.println("tempo gasto com StringBuilder: " + (t4-t3));
	}
}

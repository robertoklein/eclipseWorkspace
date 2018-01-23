package pac1;

public class Teste {

	@SuppressWarnings("finally")
	public String exceptions() {
		
		String result = "";
		String v = null;
		
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			}catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			}finally {
				result += "finally";
				throw new Exception();
			}
		}catch (Exception e) {
			result += "done"; 
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Teste t = new Teste();
		System.out.println(t.exceptions());
	}
}

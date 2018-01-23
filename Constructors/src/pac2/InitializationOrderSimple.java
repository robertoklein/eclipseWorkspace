package pac2;

public class InitializationOrderSimple {
	
		private String name = "3: Torchie";
		
		{ System.out.println(name); }
		
		private static int COUNT = 0;
		
		static { System.out.println("1: " + COUNT); }
		
		{ COUNT++; System.out.println("4: " + COUNT); }
		
		public InitializationOrderSimple() {
		
		System.out.println("5: constructor");
		
		}
		 public static void main(String[] args) {
		
		System.out.println("2: read to construct");
	
		new InitializationOrderSimple();
	 }
}

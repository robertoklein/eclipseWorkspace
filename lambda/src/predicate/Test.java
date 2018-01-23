package predicate;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		//System.out.println(bunnies);
		
		bunnies.removeIf(b -> b.charAt(0) != 'h');
		
		//System.out.println(bunnies);
		
		Test t = new Test();
		System.out.println(t.howMany(true, new boolean[2]));
	}		
	
	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
	
}

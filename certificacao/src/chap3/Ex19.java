package chap3;

public class Ex19 {

	public static void main(String[] args) {
		walk(1,2,3,4);
	}
	
	public static void walk(int start, int...nums) {
		System.out.println("nums: " + nums.length);
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		System.out.println("start: " + start);
		System.out.println("========");
	}
}

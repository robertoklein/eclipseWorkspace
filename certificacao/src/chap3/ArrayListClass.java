package chap3;

import java.util.ArrayList;


public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		list.add("hawk");
		list.add(Boolean.TRUE);
		
		
		
		ArrayList<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds);
		
		birds.add(1,"rodin");
		System.out.println(birds);
		
		birds.add(1,"robin");
		System.out.println(birds);
		
		birds.add(0,"blue jay");
		System.out.println(birds);
	}
}

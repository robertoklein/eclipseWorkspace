package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import exercise.Person;

public class CollectionIterationExample {

	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		System.out.println("loop with for");
		for(int i=0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("loop for each");
		System.out.println("---------------");
		for(Person p : people) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println("===== JAVA 8 ======");
		System.out.println();
		
		System.out.println();
		System.out.println("loop lambda foreach");
		System.out.println("-------------------");
		people.forEach( p -> System.out.println(p) );
		
		System.out.println();
		System.out.println("loop method reference");
		System.out.println("---------------------");
		people.forEach(System.out::println);
	}
}

package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		//step1: Sort list of person by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		//step2: Create a method to print all the persons in the list
		System.out.println("all people");
		printAll(people);

		System.out.println("=============");

		//step3: Create a method that prints all people that have last name beginning with C
		System.out.println("all people lastName C");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("=============");
		
		System.out.println("all people firstName C");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}	
}

interface Condition {
	boolean test(Person p);
}

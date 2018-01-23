package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		//step1: Sort list of person by last name
		Collections.sort(people, ( p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );

		//step2: Create a method to print all the persons in the list
		System.out.println("all people sorted");
		printAll(people);
		System.out.println("=============");

		//step3: Create a method that prints all people that have last name beginning with C
		System.out.println("all people lastName C");
		printConditionally(people, p -> p.getLastName().startsWith("C") );
		System.out.println("=============");
		
		//step3: Create a method that prints all people that have first name beginning with C
		System.out.println("all people firstName C");
		printConditionally(people, p -> p.getFirstName().startsWith("C") ); 
	}

	//private static void printConditionally(List<Person> people, Condition condition) {
	private static void printConditionally(List<Person> people, Predicate<Person> condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	private static void printAll(List<Person> people) {
		people.forEach(obj -> System.out.println(obj));
	}
}


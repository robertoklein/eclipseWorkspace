package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import exercise.Person;

public class MethodReferenceExample2 {


	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		System.out.println("all people sorted by lastName");
		System.out.println("=============");
		
		//printConditionally(people, p -> true, p -> System.out.println(p));
		printConditionally(people, p -> true, System.out::println);
	}

	//private static void printConditionally(List<Person> people, Condition condition) {
	private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person p : people) {
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}
	}
}

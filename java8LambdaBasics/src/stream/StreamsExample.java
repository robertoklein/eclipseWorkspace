package stream;

import java.util.Arrays;
import java.util.List;

import exercise.Person;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		people.stream()
		//primeiro aplica o filtro na lista
		.filter(p -> p.getLastName().startsWith("C"))
		//depois printa a lista filtrada
		.forEach(p -> System.out.println(p.getFirstName()));
		
		people.forEach(p -> System.out.println(p));
	}
	
	interface roda {
		void imprime();
	}
}
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TradicionalSearch {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kanguroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		//print(animals, new CheckIfHopper());
		//print(animals, new CheckIfSwim());
		
		/**
		 * with lambda
		 */
		print(animals,  (Animal a) -> { 
			return a.canHopM();
		});
		
		print(animals, (Animal a) -> a.canSwimM());
	}
	/*
	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal a : animals) {
			if(checker.test(a)) {
				System.out.println(a + " ");
			}
			System.out.println();
		}
	}
	*/
	
	/**
	 * using a functional interface provided by JAVA
	 * @param animals
	 * @param chkr
	 */
	private static void print(List<Animal> animals, Predicate<Animal> chkr) {
		for(Animal a : animals) {
			if(chkr.test(a)) {
				System.out.println(a + " ");
			}
			System.out.println();
		}
	}
}

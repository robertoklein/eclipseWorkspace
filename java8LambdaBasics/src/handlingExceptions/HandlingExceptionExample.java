package handlingExceptions;

import java.util.function.BiConsumer;

public class HandlingExceptionExample {

	public static void main(String[] args) {
		
		
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		BiConsumer<Integer, Integer> myLambda = (v, k) -> System.out.println(v / k);
		
		process(someNumbers, key, wrapperLambda(myLambda));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				//original lambda
				consumer.accept(v, k);
			}
			catch (ArithmeticException e) {
				System.out.println("exception cought in wrapper lambda");
			}
		};
	}
}


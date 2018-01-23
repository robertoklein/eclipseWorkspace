package java8LambdaBasics;

import java.util.Arrays;
import java.util.List;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		//StringLengthLambda myLambda = (String s) -> s.length();
		//StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("roberto"));
		
		//Comparator<String> comparador = (s1,s2) -> Integer.compare(s1.length(), s2.length());
		//System.out.println(comparador.compare("roberto", "ana"));
		
		List<String> lista = Arrays.asList("roberto","ana", "joao");
		//forEach com lambda
		lista.forEach(obj -> System.out.println(obj));
		
		for(String obj : lista) {
			System.out.println(obj);
		}
		
		lista.sort( (s1,s2) -> Integer.compare(s1.length(), s2.length()) );
		System.out.println("===============");
		lista.forEach(obj -> System.out.println(obj));
		
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	interface printaInterface{
		void printa();
	}
}
 
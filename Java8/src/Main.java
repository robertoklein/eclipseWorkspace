import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("alura online");
		lista.add("casa do código");
		lista.add("caelum");		

		//		primeira forma do comparador, utilizando a classe criada
		//		Comparator<String> comparador = new ComparadorPorTamanho();
		//		Collections.sort(lista,comparador);

		//		lista.sort((String s1, String s2)-> {
		//			if(s1.length() < s2.length()) {
		//				return -1;
		//			}
		//			if(s1.length() > s2.length()) {
		//				return 1;
		//			}
		//			return 0;
		//		});

		//ordenando a lista pelo tamanho de strings com lambda
		//lista.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

		//outra forma de realizar a comparacao e ordenacao de strings
		lista.sort(Comparator.comparing(obj -> obj.length()));
		//outra forma de realizar a ordenacao de strings
		lista.sort(Comparator.comparing(String::length));
		
		//foreach utilizando lambda
		lista.forEach(obj -> System.out.println(obj));
		
		//lista.forEach(System.out::println);
		//utilizando lambda para rodar uma thread
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		//lista.forEach(obj -> {
		//System.out.println(obj);
		//});

	}
}

/**
 * 
 * classe para implementar o foreach 
 */
/*
class Consumidor implements Consumer<String> {
	@Override
	public void accept(String obj) {
		System.out.println(obj);
	}
}
 */
/**
 * classe para implemtar a comparacao de strings
 */
//class ComparadorPorTamanho implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2) {
//		if(s1.length() < s2.length()) {
//			return -1;
//		}
//		if(s1.length() > s2.length()) {
//			return 1;
//		}
//		return 0;
//	}
//}

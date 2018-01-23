package chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wrapper {

	
	public static void main(String[] args) {
			
		//list para array
		/*
		List<String> list2 = new ArrayList<>();
		list2.add("hawk");
		list2.add("dog");
		
		String[] strArray = list2.toArray(new String[list2.size()]);
		
		System.out.println("lista2 inteira: " + list2);
		
		list2.remove(0);
		System.out.println("lista2: " + list2);
		
		System.out.println("====================");
		for(String s : strArray) {
			System.out.println("array: "+ s);
		}
		System.out.println("====================");
		*/
		
		
		//array para List 	
		String[] array = {"hawk","robin"};
		
		//abaixo, um new arraylist esta recebendo o valor do array, assim, nao se reflete.
		//List<String> list = new ArrayList<>(Arrays.asList(array));
		
		//abaixo nao esta dando new em arraylist, assim, a list e o array estao lincados.
		List<String> list = Arrays.asList(array);
		//list.set(0,"roberto");
		System.out.println("list1: " + list);
		System.out.println("===============");
		
		list.removeAll(Arrays.asList("hawk"));
		System.out.println("list2: " + list);
		System.out.println("===============");
		
		System.out.println("no forEach");
		for(String s : array) {
			System.out.println(s);
		}
		
		array = list.toArray(new String[list.size()]);
		System.out.println("===============");
		
		for(String s : array) {
			System.out.print(s + " ");
		}
		//list.remove(0);
	}
}



















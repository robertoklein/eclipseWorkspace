package javaIIIAula5;

import java.util.HashMap;
import java.util.Map;

public class TestaHashMap {


	public static void main(String[] args) {


		Pessoa p1 = new Pessoa();
		p1.setCpf("12345");
		p1.setNome("ro p1");
		
		Pessoa p2 = new Pessoa();
		p2.setCpf("12345");
		p2.setNome("roberto p2");
		
		Pessoa p3 = new Pessoa();
		p3.setCpf("12345");
		p3.setNome("klein p3");

		Map<String, Pessoa> map = new HashMap<>();
		map.put("conta1", p1);
		map.put("conta2", p2);
		map.put("conta3", p2);
		
		
		map.forEach((k,v) -> System.out.println("key: " + k + " value: " + v.getNome()));

		
		System.out.println("========================");
		
		map.put("conta2", p3);
		map.forEach((k,v) -> System.out.println("key: " + k + " value: " + v.getNome()));
		
	}

}

package Poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list  = new ArrayList<>();

		list.add("Maria");
		list.add("Isaac");
		list.add("Alex");
		list.add("Pedro");
		list.add("João");
		list.add(2, "Marco");
		System.out.println(list.size());
		
		
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("------------");
		
		list.removeIf(nomes -> nomes.charAt(0) == 'M');
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("------------");
		System.out.println("Indef of Bob: " + list.indexOf("Bob"));
		System.out.println("Indef of Isaac: " + list.indexOf("Isaac"));
		System.out.println("------------");
		
		List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'A').collect(Collectors.toList());
		for(String nomes : result) {
			System.out.println(nomes);
		}
		System.out.println("------------");
		
		String name = list.stream().filter(nomes -> nomes.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
	}
}

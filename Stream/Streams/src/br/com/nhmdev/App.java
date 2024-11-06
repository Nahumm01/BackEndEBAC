package br.com.nhmdev;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		var items = new ArrayList<String>();
		items.add("Suco");
		items.add("Café");
		items.add("Leite");
		items.add("Carne");

		for (String item : items) {
			if (item.startsWith("C")) {
				System.out.println("Itens começando com 'C': " + item.toUpperCase());
			}
			System.out.println(item);
		}

		//Streams
		items.stream()
				.filter(item -> item.startsWith("C"))
				.map(String::toUpperCase)
				.forEach(System.out::println);

		items.parallelStream()
				.forEach(item -> System.out.println(Thread.currentThread() + " : " + item));
	}

}

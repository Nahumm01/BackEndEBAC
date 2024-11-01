package br.com.nhmdev.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Teste {
	public static void main(String[] args) {
		List<String> nomes = List.of("Ana", "Pedro", "Lucas", "João");
		List<String> nomesComA = nomes.stream()
				.filter(nome -> nome.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println(nomesComA);

		boolean temNomeComA = nomes.stream()
				.anyMatch(nome -> nome.startsWith("A"));

	}
}

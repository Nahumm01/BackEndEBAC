package br.com.nhmdev;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		sortByGender();
	}

	private static void sortByGender() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os nomes e gêneros(M/F) separados por hífen(-) ");
		System.out.println("Insira uma vírgula para o próximo nome e gênero.");

		String input = sc.nextLine();
		List<String> namesAndGenders = List.of(input.split(","));

		Map<String, List<String>> listaMulheres = namesAndGenders.stream()
				.filter(nameAndGender -> nameAndGender.contains("F"))
				.collect(Collectors.groupingBy(nameAndGender -> nameAndGender.split("-")[1]));

		System.out.println(listaMulheres);
	}
}

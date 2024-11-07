package br.com.nhmdev;


import java.util.List;

public class App {
	public static void main(String[] args) {
	}

	public static List<String> sortByGender(String input) {
//		Não é possível fazer a leitura do input do teclado usando Scanner em teste contexto, pois não há entrada do teclado disponível.
//		Scanner sc = new Scanner(System.in);

//		Mensagem desnecessária para o teste
//		System.out.println("Digite os nomes e gêneros(M/F) separados por hífen(-) ");
//		System.out.println("Insira uma vírgula para o próximo nome e gênero.");

//      Como não temos a entrada do teclado, vamos assumir um valor para o input para o teste.
//		String input = sc.nextLine();
		List<String> womanList = List.of(input.split(","));

		return womanList.stream()
				.filter(nameAndGender -> nameAndGender.endsWith("-F"))
				.map(nameAndGender -> nameAndGender.split("-")[0])
				.toList();
	}
}


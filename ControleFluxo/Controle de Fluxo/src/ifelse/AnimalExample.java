package ifelse;

import java.util.Scanner;

public class AnimalExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do animal: ");
		String texto = scan.next();
		String animal = exampleOfIf(texto);
		System.out.println(animal);
	}

	public static String exampleOfIf(String animal) {
		String result;
		if(animal.equals("Cachorro") || animal.equals("Gato")) {
			result="Animal Doméstico";
		} else if (animal.equals("Tigre")) {
			result="Animal Selvagem";
		}else {
			result="Animal Desconhecido";
		}
		return result;
	}
}

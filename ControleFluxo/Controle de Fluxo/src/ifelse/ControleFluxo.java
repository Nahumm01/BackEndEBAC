package ifelse;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		int result = 14;
		if (result > 1 && result < 5){
			System.out.println("Low result");
		} else if (result > 5 && result < 10){
			System.out.println("Medium result");
		}else if (result > 10 && result < 15){
			System.out.println("High result");
		} else {
			System.out.println("Error");
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		String idadeSt = getIdade(idade);
		System.out.println(idadeSt);

	}

	public static String getIdade (int idade){
		if (idade >= 0 && idade <= 5){
			return "You're a baby!";
		} else if (idade >= 6 && idade <= 10) {
			return "You're a child!";
		} else if (idade >= 11 && idade <= 18) {
			return "You're a teenager!";
		}else {
			return "You're a adult!";
		}
	}

}

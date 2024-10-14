package forewhile;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		while (count < 2) {
			System.out.println("Contador: " + count);
			count++;
		}

		Scanner s = new Scanner(System.in);

		System.out.println("Deseja gerar a tabuada? (S/N)");
		String resposta = s.next();

		while (resposta.equals("S")) {
			System.out.println("Digite um número para gerar a tabuada: ");
			int number = s.nextInt();
			for (int i = 0; i <= 10; i++) {
				System.out.println(number + "X" + i + " = " + (number * i));
			}

			System.out.println("Deseja gerar novamente? (S/N)");
			resposta = s.next();
		}
		System.out.println("Obrigado!");

		Scanner s2 = new Scanner(System.in);
		String resposta2 = "";
		do {
			System.out.println("Digite um número para gerar a tabuada: ");
			int number = s2.nextInt();
			for (int i = 0; i <= 10; i++) {
				System.out.println(number + "X" + i + " = " + (number * i));
			}
			System.out.println("Deseja gerar novamente? (S/N)");
			resposta2 = s2.next();
		}while (resposta2.equals("S"));
		System.out.println("Obrigado!");
	}
}

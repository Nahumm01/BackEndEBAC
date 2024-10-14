package forewhile;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número para gerar a tabuada: ");
		int number = scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + "X" + i + " = " + (number * i));
		}

		for (int contador = 1; contador <= 1000; contador++) {
			System.out.println("Está é a posição do contador Nº " + contador);
			if (contador == 10) {
				break;
			}
		}

		for (int contador = 1; contador <= 1000; contador++) {
			if (contador%5!=0) {
				continue;
			}
			System.out.println("Contador: " + contador);
		}
	}

}

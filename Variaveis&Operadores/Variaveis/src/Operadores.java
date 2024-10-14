public class Operadores {

	public static void main(String[] args) {
		operacoesAritmeticas();
		operacoesAtribuicoes();
		operadoresIncrementoDecremento();
	}

	private static void operadoresIncrementoDecremento() {
		int num1 = 10;
		num1++;
		System.out.println(num1);
	}

	private static void operacoesAtribuicoes() {
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		num3 += num3;
		System.out.println(num3);
	}

	public static void operacoesAritmeticas() {
		int num = 1;
		int num2 = 1;
		int num3 = num + num2;
		int num4 = num * num2 + num3;
		int num5 = num2 / num - num4 * num3;
		boolean isBigger = num4 > num5 && num5 > num3;
		System.out.println(isBigger);
		System.out.println(num5);
	}
}

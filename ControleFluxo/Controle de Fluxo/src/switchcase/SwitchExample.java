package switchcase;

public class SwitchExample {
	public static void main(String[] args) {

	}

	public static String getIdade(int idade) {
		String resultado;
		switch (idade) {
			case 0:
			case 5:
				resultado = "Infantil";
				break;
			case 6:
			case 10:
				resultado = "Juvenil";
				break;
			case 11:
			case 18:
				resultado = "Adolescente";
				break;
			default:
				resultado = "Adulto";
				break;
		}
		return resultado;

	}
}

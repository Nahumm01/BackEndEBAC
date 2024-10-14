import interfaces.*;

public class ClassTeste {
	public static void main(String[] args) {
		ICaneta caneta = new CanetaEsfereografica();
		caneta.escrever("Olá Mundo!");
		caneta.getCor();
		caneta.escritaTodos();
		System.out.println(caneta.getCor());

		ICaneta giz = new Giz();
		giz.escrever("Giz");
		giz.getCor();
		System.out.println(giz.getCor());

		ICaneta lapis = new Lapis();
		lapis.escrever("Lapis");
		lapis.getCor();
		System.out.println(lapis.getCor());


		ICarro carroPasseio = new CarroPasseio();
		carroPasseio.andar();
		carroPasseio.parar();



	}
}

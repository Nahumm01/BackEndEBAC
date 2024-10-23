import domain.Carro;
import domain.Moto;
import domain.Veiculo;

import java.util.ArrayList;
import java.util.List;


public class App {
	public static <T> void main(String[] args) {
		List<? super Veiculo> listaVeiculos = new ArrayList<>();

		listaVeiculos.add(new Carro("Ford",200D,2009,"Focus"));
		listaVeiculos.add(new Moto("Honda",245D,2010,"Kawasaki"));
		listaVeiculos.add(new Carro("Ford",200D,2009,"Focus"));

		System.out.println(listaVeiculos);
	}
}

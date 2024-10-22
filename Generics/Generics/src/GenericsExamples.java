import fruta.Banana;
import fruta.IFruta;
import fruta.Maca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExamples {
	public static void main(String[] args) {
		List lista = new ArrayList<>();
		lista.add("Thiago");
		lista.add(1);
		imprime(lista);
		imprimir(lista);

		List<IFruta> frutas = new ArrayList<>();
		frutas.add(new Maca());
		frutas.add(new Banana());

		imprimeFrutas(frutas);

	}

	public static void imprime (List<?> lista){
		for (Object str : lista){
			System.out.println(str);
		}
	}

	public static <T> void imprimir (List <T> lista){
		for (T st : lista){
			System.out.println(st);
		}
	}

	public static void imprimeFrutas(List<? extends IFruta> lista){
		for (IFruta fruta : lista){
			System.out.println(fruta);
		}
	}
}

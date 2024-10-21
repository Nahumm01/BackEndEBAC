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
}

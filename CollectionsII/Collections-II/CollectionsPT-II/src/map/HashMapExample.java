package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		listaSimplesMap();
		listaMapIteradaValor();
		listaMapIteradaChaves();
	}

	private static void listaSimplesMap(){
		Map<Integer,String> lista = new HashMap<Integer,String>();
		lista.put(1,"Zé da Pinga");
		lista.put(2,"Jão da Faca");
		lista.put(3,"Pedro do Serrote");

		System.out.println(lista);

	}

	private static void listaMapIteradaValor(){
		Map<Integer,String> lista = new HashMap<Integer,String>();
		lista.put(1,"Zé da Pinga");
		lista.put(2,"Jão da Faca");
		lista.put(3,"Pedro do Serrote");

		for (String value : lista.values()) {
			System.out.println(value);
		}
	}

	private static void listaMapIteradaChaves(){
		Map<Integer,String> lista = new HashMap<Integer,String>();
		lista.put(1,"Zé da Pinga");
		lista.put(2,"Jão da Faca");
		lista.put(3,"Pedro do Serrote");

		for (Integer key : lista.keySet()) {
			System.out.println(key);
		}

		lista.forEach((key, value) -> {
			System.out.println(key);
			System.out.println(value);
		});
	}

}

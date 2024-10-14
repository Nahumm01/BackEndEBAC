package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();
		exemploListaSimplesComNumeros();
	}

	private static void exemploListaSimples(){
		System.out.println("*** Exemplo de Lista Simples ***");
		List<String> lista = new LinkedList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		lista.remove(2);
		System.out.println(lista);

		boolean hasObject = lista.contains("Maria");
		System.out.println(hasObject);

		for (String nome : lista ){
			System.out.println(nome);
		}

	}

	private static void exemploListaSimplesOrdemAscendente(){
		System.out.println("*** Exemplo de Lista com Ordem Ascendente ***");
		List<String>  lista = new LinkedList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}

	private static void exemploListaSimplesComNumeros(){
		System.out.println("*** Exemplo de Lista com Numeros ***");
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(5);
		lista.add(3);
		lista.add(1);
		lista.add(2);
		lista.add(4);
		lista.add(10);

		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}
}

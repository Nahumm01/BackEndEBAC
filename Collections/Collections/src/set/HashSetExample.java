package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		exemploListaSimples();
	}

	private static void exemploListaSimples(){
		System.out.println("*** Exemplo de Lista Simples ***");
		Set<String> lista = new HashSet<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		lista.add("Pedro");
		lista.add("Tobias");
		System.out.println(lista);
	}
}

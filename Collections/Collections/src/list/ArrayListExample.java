package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//exemploListaSimples();
		//exemploListaSimplesOrdemAscendente();
		//exemploListaSimplesComNumeros();
		//exemploListaSimplesComClasse();
		exemploListaSimplesOrdenadaComClasse();

	}

	private static void exemploListaSimples(){
		System.out.println("*** Exemplo de Lista Simples ***");
		List<String> lista = new ArrayList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		System.out.println(lista);
		System.out.println("");
	}

	private static void exemploListaSimplesOrdemAscendente(){
		System.out.println("*** Exemplo de Lista com Ordem Ascendente ***");
		List<String>  lista = new ArrayList<String>();
		lista.add("Zézin");
		lista.add("Maria");
		lista.add("João");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}

	private static void exemploListaSimplesComNumeros(){
		System.out.println("*** Exemplo de Lista com Numeros ***");
		List<Integer> lista = new ArrayList<Integer>();
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

	private static void exemploListaSimplesComClasse (){
		List<Aluno> list = new ArrayList<Aluno>();

		Aluno a = new Aluno("João","24","Python",10d);
		Aluno b = new Aluno("Maria","26","JS",5d);
		Aluno c = new Aluno("Zézin","22","Java",8d);

		list.add(a);
		list.add(b);
		list.add(c);

		System.out.println("*** Exemplo de Lista com Classes ***");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("");

	}

	private static void exemploListaSimplesOrdenadaComClasse (){
		List<Aluno> list = new ArrayList<Aluno>();

		Aluno a = new Aluno("João","24","Python",10D);
		Aluno b = new Aluno("Maria","26","JS",5D);
		Aluno c = new Aluno("Zézin","22","Java",8D);
		Aluno d = new Aluno("Felipe", "38", "Ruby", 7D);

		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);

		System.out.println("*** Exemplo de Lista com Classes ***");
		System.out.println("Sem ordenação: " + list);
		Collections.sort(list);
		System.out.println("Com ordenação" + list);
		System.out.println("");

		ComparaNotas comparaNotas = new ComparaNotas();
		Collections.sort(list, comparaNotas);
		System.out.println(list);
		System.out.println("");


	}
}

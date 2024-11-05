package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.List;

public class ExemploForEach {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		list.stream()
				.forEach(pessoa -> System.out.println(pessoa.getNome()));

		list.forEach(System.out::println);

		list.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Chile"))
				.forEach(p -> System.out.println(p.getNome()) );
	}
}

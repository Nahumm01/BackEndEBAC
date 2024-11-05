package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Set<Pessoa> listNames = list.stream()
				.filter(pessoa -> pessoa.getNome().startsWith("M"))
				.collect(Collectors.toSet());

		listNames.forEach(System.out::println);
	}
}

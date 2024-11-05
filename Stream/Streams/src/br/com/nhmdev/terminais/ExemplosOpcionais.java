package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOpcionais {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Optional<Pessoa> opcional = list.stream()
				.max(Comparator.comparing(Pessoa::getIdade));

		opcional.ifPresent(System.out::println);
	}
}

package br.com.nhmdev.intermediarios;

import br.com.nhmdev.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosDistinct {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Stream<Pessoa> stream = list.stream()
				.distinct();
	}
}

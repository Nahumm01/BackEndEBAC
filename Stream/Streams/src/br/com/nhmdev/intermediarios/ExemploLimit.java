package br.com.nhmdev.intermediarios;

import br.com.nhmdev.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLimit {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Stream<Pessoa> stream = list.stream()
				.limit(2);
	}
}

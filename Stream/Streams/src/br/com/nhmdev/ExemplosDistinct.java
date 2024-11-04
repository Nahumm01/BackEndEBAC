package br.com.nhmdev;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosDistinct {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Stream<Pessoa> stream = list.stream()
				.distinct();
	}
}

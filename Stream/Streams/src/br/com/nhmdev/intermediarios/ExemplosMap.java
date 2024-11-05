package br.com.nhmdev.intermediarios;

import br.com.nhmdev.Pessoa;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().populaPessoas();

		Stream<Integer> stream = lista.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Paraguai"))
				.map(Pessoa::getIdade);


		IntStream intStream = lista.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Cuba"))
				.mapToInt(Pessoa::getIdade);
	}
}

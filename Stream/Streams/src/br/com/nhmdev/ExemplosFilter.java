package br.com.nhmdev;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().populaPessoas();
		Stream<Pessoa> streamNacionalidade = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Venezuela"));

		Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Chile");
		Stream<Pessoa> streamPred = lista.stream().filter(pred);

	}
}

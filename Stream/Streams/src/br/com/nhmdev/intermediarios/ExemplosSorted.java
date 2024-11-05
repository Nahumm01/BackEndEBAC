package br.com.nhmdev.intermediarios;

import br.com.nhmdev.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemplosSorted {
	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().populaPessoas();

		Stream<Pessoa> stream = lista.stream()
				.filter(Pessoa -> Pessoa.getNacionalidade().equals("Paraguai"))
				.sorted(Comparator.comparing(Pessoa::getNome));

		Stream<Pessoa> stream2 = lista.stream()
				.filter(Pessoa -> Pessoa.getNacionalidade().equals("Paraguai"))
				.sorted(Comparator.comparing(Pessoa::getIdade));

		Stream<Pessoa> stream3 = lista.stream()
				.filter(Pessoa -> Pessoa.getNacionalidade().equals("Paraguai"))
				.sorted((p1,p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
	}
}

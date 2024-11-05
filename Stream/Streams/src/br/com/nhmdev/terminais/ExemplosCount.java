package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.List;

public class ExemplosCount {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		long count = list.stream()
				.filter(pessoa -> pessoa.getNome().startsWith("M"))
				.count();

		System.out.println(count);
	}
}

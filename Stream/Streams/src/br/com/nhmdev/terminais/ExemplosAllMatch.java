package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.List;

public class ExemplosAllMatch {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		boolean result = list.stream()
				.allMatch(pessoa -> pessoa.getNacionalidade().equals("Cuba"));
		System.out.println(result);
	}
}

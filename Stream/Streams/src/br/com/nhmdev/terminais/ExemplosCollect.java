package br.com.nhmdev.terminais;

import br.com.nhmdev.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {
	public static void main(String[] args) {
		List<Pessoa> list = new Pessoa().populaPessoas();

		Set<Pessoa> listNames = list.stream()
				.filter(pessoa -> pessoa.getNome().startsWith("M"))
				.collect(Collectors.toSet());

		listNames.forEach(System.out::println);

		ArrayList<Pessoa> arrayNames = list.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Cuba"))
				.collect(Collectors.toCollection(ArrayList::new));

		arrayNames.forEach(System.out::println);

		Map<Integer, Pessoa> map = list.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Venezuela"))
				.collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

		map.forEach((k,v) -> System.out.println(v));

		Map<Integer, List<Pessoa>> agrupaPorIdade = list.stream()
				.filter(pessoa -> pessoa.getNacionalidade().equals("Paraguai"))
				.collect(Collectors.groupingBy(Pessoa::getIdade));

		agrupaPorIdade.forEach((k,v) -> System.out.println(k + ": " + v));
	}
}

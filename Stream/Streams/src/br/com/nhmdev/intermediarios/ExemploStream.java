package br.com.nhmdev.intermediarios;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ExemploStream {
	public static void main(String[] args) {
		Stream<String> stream = List.of("Thiago","Nahum","Silva").stream();

		Stream<String> set = Set.of("Thiago","Nahum","Silva").stream();

		Map<String,String> map = Map.of("Thiago","Nahum");
		Stream<String> chaves = map.keySet().stream();
		Stream<String> valores = map.values().stream();

		Stream<String> streamSTS = Stream.of("Stream","asds");
	}
}

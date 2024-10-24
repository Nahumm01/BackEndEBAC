package br.com.nhmdev.anotacoes;

@IAnnotation(value = "Thiago", listaBairros = "Teste", numeroCasa = 20)
public class ExemploAnnotation {

	@IAnnotation(value = "Nahum", listaBairros = {"teste1","teste2","teste3"}, numeroCasa = 20L, valores = 100d)
	private String nome;

}

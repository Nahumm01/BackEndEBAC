package br.com.nhmdev;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TesteAppTest {
	@Test
	public void testaListaMulheres() {
		String input = "Thiago-M,Eli-F,Zé-M,Renata-F,Josy-F,Elen-F, Marta-M";
		List<String> listaMulheres = App.sortByGender(input);
		Assert.assertTrue("Apenas nomes femininos: ", listaMulheres.stream().allMatch(nome -> input.contains(nome +"-F")));
	}
}

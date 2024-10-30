package br.com.nhmdev;

import br.com.nhmdev.annotations.Tabela;
import br.com.nhmdev.classes.Cliente;
import br.com.nhmdev.classes.TabelaCliente;

public class App {
	public static <T> void main(String[] args) {
		TabelaCliente tabelaCliente = new TabelaCliente();

		tabelaCliente.addClienteNaList(new Cliente("320775","Thiago","11111-1111"));
		tabelaCliente.addClienteNaList(new Cliente("319288","Pedro","11111-1111"));
		tabelaCliente.addClienteNaList(new Cliente("310456","José","11111-1111"));

		//Repetindo para poder dar erro e usar a Exception.
		tabelaCliente.addClienteNaList(new Cliente("320775","Thiago","1111-1111"));

		tabelaCliente.imprimeClientes();

		//Exercício Módulo Reflections
		Class<?> clazz = TabelaCliente.class;
		if (clazz.isAnnotationPresent(Tabela.class)){
			Tabela tabelaAnn = clazz.getAnnotation(Tabela.class);

			String nomeTabela = tabelaAnn.nomeTabela();
			System.out.println("Nome da Tabela: " + nomeTabela);
		}

	}
}

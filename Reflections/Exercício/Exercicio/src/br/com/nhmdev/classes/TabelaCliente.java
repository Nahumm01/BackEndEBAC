package br.com.nhmdev.classes;

import br.com.nhmdev.annotations.Tabela;
import br.com.nhmdev.exceptions.ClienteExistenteException;

import java.util.ArrayList;
import java.util.List;

//Annotation
@Tabela(nomeTabela = "Clientes")
public class TabelaCliente {
	private final List<Cliente> clienteList = new ArrayList<>();

	public void addClienteNaList(Cliente cliente){
		try {
			verificaClienteNaList(cliente);
			clienteList.add(cliente);
		} catch (ClienteExistenteException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void verificaClienteNaList(Cliente cliente) throws ClienteExistenteException{
		for (Cliente c : clienteList){
			if (c.getClienteID().equals(cliente.getClienteID())){
				throw new ClienteExistenteException("Cliente já existente!");
			}
		}
	}

	public void imprimeClientes(){
		for (Cliente c : clienteList){
			System.out.println("Nome: " + c.getNomeCliente() + " ID: " + c.getClienteID());
		}
		//Confirmando se o cliente repetido não foi adicionado pós-exception.
		System.out.println(clienteList.size());
	}
}

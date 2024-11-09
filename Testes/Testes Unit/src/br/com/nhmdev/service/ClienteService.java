package br.com.nhmdev.service;

import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteService {
	private final IClienteDAO clienteDAO;

	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public String salvar(){
		clienteDAO.salvar();
		return "Cliente salvo com sucesso!";
	}
}

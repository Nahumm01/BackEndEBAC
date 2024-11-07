package br.com.nhmdev.service;

import br.com.nhmdev.dao.ClienteDAO;

public class ClienteService {
	private ClienteDAO clienteDAO;

	public ClienteService() {
		clienteDAO = new ClienteDAO();
	}

	public String salvar(){
		clienteDAO.salvar();
		return "Cliente salvo com sucesso!";
	};
}

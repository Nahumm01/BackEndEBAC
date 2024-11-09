package br.com.nhmdev.dao;

import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
	@Override
	public String salvar() {
		return "Classe Mock";
	}

	@Override
	public String listar() {
		return "Classe Mock";
	}

	@Override
	public String excluir() {
		return "Classe Mock";
	}

	@Override
	public String atualizar() {
		return "Classe Mock";
	}
}

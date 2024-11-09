package br.com.nhmdev.dao;

import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAO implements IClienteDAO {
	public String salvar() {
       throw new UnsupportedOperationException("Operação não suportada");
//		return "Classe DAO Original";
	}

	@Override
	public String listar() {
		return "Classe DAO Original";
	}

	@Override
	public String excluir() {
		return "Classe DAO Original";
	}

	@Override
	public String atualizar() {
		return "Classe DAO Original";
	}
}

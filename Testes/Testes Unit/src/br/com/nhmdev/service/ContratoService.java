package br.com.nhmdev.service;

import br.com.nhmdev.interfaces.IContratoDAO;

public class ContratoService implements IContratoDAO {

	private final IContratoDAO contratoDAO;

	public ContratoService(IContratoDAO contratoDAO) {
		this.contratoDAO = contratoDAO;
	}

	@Override
	public String salvarContrato() {
		contratoDAO.salvarContrato();
		return "Sucesso";
	}

	@Override
	public String listarContratos() {
		contratoDAO.listarContratos();
		return "Sucesso";
	}

	@Override
	public String excluirContrato() {
		contratoDAO.excluirContrato();
		return "Sucesso";
	}

	@Override
	public String atualizarContrato() {
		contratoDAO.atualizarContrato();
		return "Sucesso";
	}
}

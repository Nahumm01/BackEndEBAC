package br.com.nhmdev.services;

import br.com.nhmdev.interfaces.IContratoDAO;

public class ContratoService implements IContratoDAO {

	private final IContratoDAO contratoDAO;

	public ContratoService(IContratoDAO contratoDAO) {
		this.contratoDAO = contratoDAO;
	}

	@Override
	public String salvarContrato() {
		contratoDAO.salvarContrato();
		return "Contrato salvo com sucesso!";
	}

	@Override
	public String listarContratos() {
		contratoDAO.listarContratos();
		return "200 OK";
	}

	@Override
	public String excluirContrato() {
		contratoDAO.excluirContrato();
		return "Contrato excluído.";
	}

	@Override
	public String atualizarContrato() {
		contratoDAO.atualizarContrato();
		return "200 OK";
	}
}

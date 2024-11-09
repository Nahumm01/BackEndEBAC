package br.com.nhmdev.mock;

import br.com.nhmdev.interfaces.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {
	@Override
	public String salvarContrato() {
		throw new UnsupportedOperationException("DB não configurado.");
	}

	@Override
	public String listarContratos() {
		return null;
	}

	@Override
	public String excluirContrato() {}

	@Override
	public String atualizarContrato() {}
}

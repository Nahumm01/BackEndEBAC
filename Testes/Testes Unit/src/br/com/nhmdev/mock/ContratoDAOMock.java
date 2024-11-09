package br.com.nhmdev.mock;

import br.com.nhmdev.exceptions.MockExceptions;
import br.com.nhmdev.interfaces.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {
	@Override
	public String salvarContrato() {
		throw new MockExceptions("DB não configurado.");
	}

	@Override
	public String listarContratos() {
		throw new MockExceptions("DB não configurado.");
	}

	@Override
	public String excluirContrato() {
		throw new MockExceptions("DB não configurado.");
	}

	@Override
	public String atualizarContrato() {
		throw new MockExceptions("DB não configurado.");
	}
}

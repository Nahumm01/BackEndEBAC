package br.com.nhmdev;

import br.com.nhmdev.dao.ContratoDAO;
import br.com.nhmdev.interfaces.IContratoDAO;

import br.com.nhmdev.mock.ContratoDAOMock;
import br.com.nhmdev.service.ContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
	@Test
	public void salvarContratoTest() {
		IContratoDAO contratoDAO = new ContratoDAO();
		ContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.salvarContrato();
		Assert.assertEquals("Sucesso", retorno);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoDB() {
       IContratoDAO mock = new ContratoDAOMock();
	   ContratoService contratoService = new ContratoService(mock);
	   String retorno = contratoService.salvarContrato();
	   Assert.assertEquals("Sucesso", retorno);

    }
}

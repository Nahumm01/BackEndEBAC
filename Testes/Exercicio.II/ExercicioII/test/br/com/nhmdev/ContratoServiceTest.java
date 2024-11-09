package br.com.nhmdev;

import br.com.nhmdev.dao.ContratoDAO;
import br.com.nhmdev.interfaces.IContratoDAO;
import br.com.nhmdev.services.ContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
	@Test
	public void salvarContratoTest() {
		IContratoDAO contratoDAO = new ContratoDAO();
		ContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.salvarContrato();
		Assert.assertEquals("Contrato salvo com sucesso!", retorno);
	}

	@Test
    public void listarContratosTest() {
		IContratoDAO contratoDAO = new ContratoDAO();
		ContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.listarContratos();
		Assert.assertEquals("200 OK", retorno);
	}

	@Test
	public void excluirContratoTest() {
		IContratoDAO contratoDAO = new ContratoDAO();
        ContratoService contratoService = new ContratoService(contratoDAO);
        String retorno = contratoService.excluirContrato();
        Assert.assertEquals("Contrato excluído.", retorno);
	}

	@Test
    public void atualizarContratoTest() {
		IContratoDAO contratoDAO = new ContratoDAO();
		ContratoService contratoService = new ContratoService(contratoDAO);
		String retorno = contratoService.atualizarContrato();
		Assert.assertEquals("200 OK", retorno);
	}
}

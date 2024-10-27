package br.com.nhmdev.exceptions;

public class ClienteService {
	public static void consultarCliente(String codigo){

		try {
			ClienteDAO.consultarCliente(codigo);
		} catch (ClienteNaoEncontradoException e){
			e.printStackTrace();
		}
	}
}

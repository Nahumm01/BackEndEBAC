import br.com.nhmdev.Cliente;
import br.com.nhmdev.TabelaCliente;

public class App {
	public static void main(String[] args) {
		TabelaCliente tabelaCliente = new TabelaCliente();

		tabelaCliente.addClienteNaList(new Cliente("320775","Thiago","11111-1111"));
		tabelaCliente.addClienteNaList(new Cliente("319288","Pedro","11111-1111"));
		tabelaCliente.addClienteNaList(new Cliente("310456","José","11111-1111"));

		//Repetindo para poder dar erro e usar a Exception.
		tabelaCliente.addClienteNaList(new Cliente("320775","Thiago","1111-1111"));

		tabelaCliente.imprimeClientes();
	}
}

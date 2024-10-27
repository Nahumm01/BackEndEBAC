package br.com.nhmdev;

public class Cliente {
	public String clienteID;
	public String nomeCliente;
	public String telefoneCliente;

	public Cliente(String clienteID, String nomeCliente, String telefoneCliente) {
		this.clienteID = clienteID;
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public String getClienteID() {
		return clienteID;
	}

	public void setClienteID(String clienteID) {
		this.clienteID = clienteID;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"clienteID='" + clienteID + '\'' +
				", nomeCliente='" + nomeCliente + '\'' +
				", telefoneCliente='" + telefoneCliente + '\'' +
				'}';
	}
}

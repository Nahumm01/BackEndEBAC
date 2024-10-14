public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, String cnpj, String razaoSocial, String nomeFantasia, String email, String telefone, String endereco) {
		this.cnpj = cnpj;
		this.setNome(nome);
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}

	@Override
	public String toString() {
		return super.toString() + ", CNPJ: " + cnpj + ", Razão Social: " + razaoSocial + ", Nome Fantasia: " + nomeFantasia;
	}

}
